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
//import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.testng.Assert as Assert
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait

WebUI.callTestCase(findTestCase('User Login/ValidLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('TRMTracker')

//WebUI.navigateToUrl('https://dev01.farrms.us/trmtracker_release/trm/main.menu/scripts/main.menu.trm.php#')
//WebUI.navigateToUrl('https://stg01.farrms.us/TRMTracker_PROD/trm/main.menu/scripts/main.menu.trm.php#')
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/i_Toggle navigation_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Administration'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_TRMTracker/span_Reporting'), 30)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Reporting'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/span_View Report'), 30)

WebUI.click(findTestObject('Page_TRMTracker/span_View Report'))

WebDriver driver = DriverFactory.getWebDriver()

Actions actions = new Actions(driver)
WebDriverWait wait = new WebDriverWait(driver, 30)

//First iframe
WebElement frame1 = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_wins\']//iframe'))
driver.switchTo().frame(frame1)

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//span[contains(text(),"Attribution")]')))
WebElement target = driver.findElement(By.xpath('//span[contains(text(),"Attribution")]'))
actions.doubleClick(target).perform()

WebElement target1 = driver.findElement(By.xpath('//span[contains(text(),"PNL Attribution Report")]'))
actions.doubleClick(target1).perform()

//Second iframe
WebElement frame2 = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_layout\']//iframe'))
driver.switchTo().frame(frame2)

//Third iframe
WebElement frame3 = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_layout\']//iframe'))
driver.switchTo().frame(frame3)

//for Prior Date
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//*[@class = \'dhxform_textarea calendar\']')))
WebElement Prior_date = driver.findElement(By.xpath('//*[@class = \'dhxform_textarea calendar\']'))
Prior_date.sendKeys('12/25/2017')

//for Current Date
WebElement Current_date = driver.findElement(By.xpath('//label[contains(text(),\'Current As of Date\')]//ancestor::div[1]//following-sibling::div[1]/input'))
Current_date.sendKeys('12/31/2017')

//for Deal id
WebElement deal_id = driver.findElement(By.xpath('//label[contains(text(),\'Deal ID\')]//ancestor::div[1]//following-sibling::div[1]/input'))
deal_id.sendKeys('223400')

//To click HTML
driver.switchTo().parentFrame()

WebElement Html = driver.findElement(By.xpath('//div[(@title = \'HTML\')]')).click()

//Forth Frame
WebElement frame4 = driver.findElement(By.xpath('//div[contains(@class,\'dhxlayout_base_dhx_web\')]//div[contains(@class,\'dhxlayout_base_dhx_web\')]//div[@class=\'dhx_cell_layout\']//iframe'))
driver.switchTo().frame(frame4)



wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//table[@class=\'a415\']')))

WebElement verify = driver.findElement(By.xpath('//table[@class=\'a415\']'))

//Assert.assertEquals("935,060.48",driver.findElement(By.xpath("//div[@class='a262']")))
String ExpectedDate = '12/25/2017'

String ExpectedResult = '935,060.48'

String ActualDate = driver.findElement(By.xpath('//div[@class=\'a154\']')).getText().trim()

WebUI.comment(ActualDate)

String ActualResult = driver.findElement(By.xpath('//div[@class=\'a262\']')).getText().trim()

WebUI.comment(ActualResult)

Assert.assertEquals(ExpectedDate, ActualDate)

Assert.assertEquals(ExpectedResult, ActualResult)

if (ActualResult.equals(ExpectedResult) && ActualDate.equals(ExpectedDate)) {
    WebUI.comment('Pass')
} else {
    WebUI.comment('Fail')
}

