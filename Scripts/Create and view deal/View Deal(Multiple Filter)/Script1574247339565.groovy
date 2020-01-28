import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.testng.Assert as Assert

WebUI.callTestCase(findTestCase('User Login/ValidLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('TRMTracker')

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/i_Toggle navigation_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Front Office'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/span_Deal Capture'), 30)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Deal Capture'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/a_Create and View Deal'), 30)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/a_Create and View Deal'))

WebDriver driver = DriverFactory.getWebDriver()
Actions actions = new Actions(driver)

//First iframe
WebElement frame1 = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_wins\']//iframe'))

driver.switchTo().frame(frame1)
WebDriverWait wait = new WebDriverWait(driver, 30)

//int EXPECTED_ROW_COUNT = 26;

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'PIONEER SOLUTIONS 1')]//ancestor::tr[1]/td[2]/div")))
WebElement target = driver.findElement(By.xpath("//span[contains(text(),'PIONEER SOLUTIONS 1')]//ancestor::tr[1]/td[2]/div"))
actions.click(target).perform()

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Trader')]//ancestor::div[2]//following-sibling::div/span/div/input[1]")))
WebElement target1 = driver.findElement(By.xpath("//label[contains(text(),'Trader')]//ancestor::div[2]//following-sibling::div/span/div/input[1]"))
//actions.click(target1).perform()
target1.sendKeys('Patrick Ong')


//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[34]//div[57]//div[2]")))
//WebElement target2 = driver.findElement(By.xpath("//div[@class='dhxcombo_option dhxcombo_option_selected']//div[@class='dhxcombo_option_text dhxcombo_option_text_chbx enable_option'][contains(text(),'Patrick Ong')]"))
//actions.click(target2).perform()

actions.click(target1).perform()

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'Counterparty')]//ancestor::div[2]//following-sibling::div/span/div/input[1]")))
WebElement Counterparty = driver.findElement(By.xpath("//label[contains(text(),'Counterparty')]//ancestor::div[2]//following-sibling::div/span/div/input[1]"))
actions.click(Counterparty).perform()

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(text(),'3 Phases Energy Renewables Inc.')]")))
WebElement Counterparty_value = driver.findElement(By.xpath("//div[contains(text(),'3 Phases Energy Renewables Inc.')]"))
actions.click(Counterparty_value).perform()

actions.click(Counterparty).perform()

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span/div[contains(text(),'Deals')]//ancestor::div[3]//following-sibling::div[1]/div/div/div/div[contains(text(),'Refresh')]")))
WebElement target3 = driver.findElement(By.xpath("//span/div[contains(text(),'Deals')]//ancestor::div[3]//following-sibling::div[1]/div/div/div/div[contains(text(),'Refresh')]"))
actions.click(target3).perform()

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='objbox']//tr[2]//td[7]")))

'To locate table'
WebElement Table = driver.findElement(By.xpath("//div[@class='dhx_cell_cont_layout']//div[2]//div[2]//table[1]//tbody[1]"))

'To locate rows of table it will Capture all the rows available in the table'
List <WebElement> rows_table = Table.findElements(By.tagName("tr"))
'To calculate no of rows In table'
int rows_count = rows_table.size()

//Assert.assertTrue(EXPECTED_ROW_COUNT == rows_table.size());
System.out.println('No. of rows: ' + rows_count)

for (def row = 2; row <= rows_count; row++) {
	'Expected value from Table'
	String ExpectedTrader = "Patrick Ong" 
	String ExpectedCounterparty = "3 Phases Energy Renewables Inc." 
	
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='objbox']//tr[2]//td[7]")))
String ActualTrader= driver.findElement(By.xpath("//div[@class='objbox']//tr["+ row + "]//td[7]")).getText()
WebUI.comment(ActualTrader)

String ActualCounterparty= driver.findElement(By.xpath("//div[@class='objbox']//tr["+ row + "]//td[8]")).getText()
WebUI.comment(ActualCounterparty)

	if (ActualTrader .equals (ExpectedTrader) && ActualCounterparty .equals (ExpectedCounterparty)  ) {
		WebUI.comment('Pass')
	} else {
		WebUI.comment('Fail')
		throw new Exception('failed')
	}
	
}






/*
import org.openqa.selenium.WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory
import org.openqa.selenium.By
WebDriver driver = DriverFactory.getWebDriver()
eleCount = driver.findElements(By.xpath("//div[text()='Coach 1']").size())
	
	
	
	for (i = 0; i< driver.findelement(td).size; i ++){
		"//td["+i+ "]"
		}

*/
	
