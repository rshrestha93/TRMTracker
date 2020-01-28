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
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.support.ui.Select as Select
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.testng.Assert as Assert

WebUI.callTestCase(findTestCase('User Login/ValidLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('TRMTracker')

WebUI.navigateToUrl('https://dev01.farrms.us/trmtracker_release/trm/main.menu/scripts/main.menu.trm.php')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/i_Toggle navigation_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Administration'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/span_Reporting'), 30)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Reporting'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/span_View Report'), 30)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_View Report'))

WebDriver driver = DriverFactory.getWebDriver()
Actions actions = new Actions(driver)
JavascriptExecutor js = ((driver) as JavascriptExecutor)
WebDriverWait wait = new WebDriverWait(driver, 30)
//int EXPECTED_ROW_COUNT = 47;

//switch to first iframe
WebElement xpathframe = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_wins\']//iframe'))
driver.switchTo().frame(xpathframe)

//For Position
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//span[contains(text(),\'Position\')]')))
WebElement target = driver.findElement(By.xpath('//span[contains(text(),\'Position\')]'))

//This will scroll the page till the element is found
js.executeScript('arguments[0].scrollIntoView();', target)

//This will scroll the web page till end.
//js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
actions.doubleClick(target).perform()

WebElement HourlyReport = driver.findElement(By.xpath('//span[contains(text(),\'Hourly Position Extract Report\')]'))
js.executeScript('arguments[0].scrollIntoView();', HourlyReport)
actions.doubleClick(HourlyReport).perform()

//Second iframe
WebElement frame2 = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_layout\']//iframe'))
driver.switchTo().frame(frame2)

//Third iframe
WebElement frame3 = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_layout\']//iframe'))
driver.switchTo().frame(frame3)

//For Book Structure
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//div[@class=\'dhxform_item_label_top browse_label\']//label[contains(text(),\'Book Structure\')]//ancestor::div[1]//following-sibling::div/input')))
WebElement BookStructure = driver.findElement(By.xpath('//div[@class=\'dhxform_item_label_top browse_label\']//label[contains(text(),\'Book Structure\')]//ancestor::div[1]//following-sibling::div/input'))
actions.doubleClick(BookStructure).perform()

WebElement xpathframe4 = driver.findElement(By.xpath('//div[contains(@class,\'dhx_cell_cont_wins\')]//iframe'))
driver.switchTo().frame(xpathframe4)

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//body[contains(@class,\'dhxlayout_base_dhx_web dhxwins_vp_dhx_web\')]/div[contains(@class,\'dhxlayout_cont\')]/div[contains(@class,\'dhx_cell_layout\')]/div[contains(@class,\'dhx_cell_cont_layout\')]/div[contains(@class,\'dhxtree_dhx_web\')]/div[contains(@class,\'containerTableStyle\')]/table/tbody/tr/td/table/tbody/tr/td[2]/div[1]')))
WebElement checkbox = driver.findElement(By.xpath('//body[contains(@class,\'dhxlayout_base_dhx_web dhxwins_vp_dhx_web\')]/div[contains(@class,\'dhxlayout_cont\')]/div[contains(@class,\'dhx_cell_layout\')]/div[contains(@class,\'dhx_cell_cont_layout\')]/div[contains(@class,\'dhxtree_dhx_web\')]/div[contains(@class,\'containerTableStyle\')]/table/tbody/tr/td/table/tbody/tr/td[2]/div[1]'))
actions.click(checkbox).perform()

WebElement OKButton = driver.findElement(By.xpath('//body[contains(@class,\'dhxlayout_base_dhx_web dhxwins_vp_dhx_web\')]/div[@class=\'dhxlayout_cont\']/div[@class=\'dhx_cell_layout\']/div[@class=\'dhx_cell_toolbar_def\']/div[@class=\'dhx_toolbar_dhx_web dhxtoolbar_icons_18\']/div[@class=\'dhxtoolbar_float_left\']/div[@class=\'dhx_toolbar_btn dhxtoolbar_btn_def\']/div[1]'))
actions.click(OKButton).perform()

driver.switchTo().parentFrame()

WebElement AsOfDate = driver.findElement(By.xpath('//label[contains(text(),\'As of Date\')]//ancestor::div[1]//following-sibling::div[1]/input'))
AsOfDate.sendKeys('12/31/2017')

WebElement DealStatus = driver.findElement(By.xpath('//label[contains(text(),\'Deal Status Group\')]/ancestor::div[1]/following-sibling::div/span/div/input[@class=\'dhxcombo_input\']'))
actions.click(DealStatus).perform()
DealStatus.sendKeys('Official')

WebElement DealID = driver.findElement(By.xpath('//label[contains(text(),\'Deal ID\')]//ancestor::div[1]//following-sibling::div[1]/input'))
DealID.sendKeys('223400')

//To click HTML
driver.switchTo().parentFrame()
WebElement Html = driver.findElement(By.xpath('//div[(@title = \'HTML\')]')).click()

//Forth Frame
WebElement frame4 = driver.findElement(By.xpath('//div[contains(@class,\'dhxlayout_base_dhx_web\')]//div[contains(@class,\'dhxlayout_base_dhx_web\')]//div[@class=\'dhx_cell_layout\']//iframe'))
driver.switchTo().frame(frame4)

//Verifying Table
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//table[@class=\'a437\']')))
WebElement verify = driver.findElement(By.xpath('//table[@class=\'a437\']'))



'To locate table'
WebElement Table = driver.findElement(By.xpath("//body/div[@id='report-body']/div[@id='cn-ssrs-viewer-report']/div[@id='oReportDiv']/div[@class='ap']/table/tbody/tr/td[@id='oReportCell']/div[@id='5xB_gr']/table[@class='a437']/tbody[1]"))

'To locate rows of table it will Capture all the rows available in the table'
List <WebElement> rows_table = Table.findElements(By.tagName("tr"))
'To calculate no of rows In table'
int rows_count = rows_table.size()

//Assert.assertTrue(EXPECTED_ROW_COUNT == rows_table.size());
System.out.println('No. of rows: ' + rows_count)


for (def row = 3; row <= (rows_count-44); row++) {
	'Expected value from Table'
	String ExpectedValue = "223400"
	
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='a449xB']//tr[3]//td[11]")))
	String Actualdeal= driver.findElement(By.xpath("//div[@class='a449xB']//tr["+ row +"]//td[11]")).getText()
	WebUI.comment(Actualdeal)
	
	//String ActualCounterparty= driver.findElement(By.xpath("//div[@class='objbox']//tr["+ row + "]//td[8]")).getText()
	//WebUI.comment(ActualCounterparty)
	
	if (Actualdeal .equals (ExpectedValue) ) {
			WebUI.comment('Pass')
			
		} else {
			WebUI.comment('Fail')
			throw new Exception('failed')
		}
		//break;
}