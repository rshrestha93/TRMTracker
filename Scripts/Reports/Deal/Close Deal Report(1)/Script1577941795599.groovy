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
import org.testng.Assert;

WebUI.callTestCase(findTestCase('User Login/ValidLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://dev01.farrms.us/trmtracker_release/trm/main.menu/scripts/main.menu.trm.php')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/i_Toggle navigation_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Reporting'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_View Report'))

WebUI.delay(2)

WebDriver driver = DriverFactory.getWebDriver()

Actions actions = new Actions(driver)

//First iframe
WebElement frame1 = driver.findElement(By.xpath("//div[@class='dhx_cell_cont_wins']//iframe"))
driver.switchTo().frame(frame1)

WebElement target = driver.findElement(By.xpath('//span[contains(text(),\'Deal\')]'))

actions.doubleClick(target).perform()

WebElement target1 = driver.findElement(By.xpath('//span[contains(text(),"Close Deal Report")]'))

actions.doubleClick(target1).perform()

//Second iframe
WebElement frame2 = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_layout\']//iframe'))

driver.switchTo().frame(frame2)

//Third iframe
WebElement frame3 = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_layout\']//iframe'))

driver.switchTo().frame(frame3)
