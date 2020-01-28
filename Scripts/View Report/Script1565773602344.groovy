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

WebUI.callTestCase(findTestCase('User Login/ValidLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebDriver driver = DriverFactory.getWebDriver()

Actions actions = new Actions(driver)
WebUI.switchToWindowTitle('TRMTracker')
WebUI.navigateToUrl('https://dev01.farrms.us/trmtracker_release/trm/main.menu/scripts/main.menu.trm.php')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/i_Toggle navigation_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Reporting'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_View Report'))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Report_View/Page_TRMTracker/div_Attribution'))

WebUI.doubleClick(findTestObject('Report_View/Page_TRMTracker/div_PNL Attribution Detail Report'))

WebUI.setText(findTestObject('Report_View/Page_TRMTracker/input__as_of_date_from'), '8/1/2019')

WebUI.setText(findTestObject('Report_View/Page_TRMTracker/input__as_of_date_to'), '8/1/2019')

WebUI.setText(findTestObject('Report_View/Page_TRMTracker/input__deal_status_group'), 'All')

WebUI.sendKeys(findTestObject('Report_View/Page_TRMTracker/input__deal_status_group'), Keys.chord(Keys.ENTER))

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Report_View/Page_TRMTracker/input_Counterparty_label_counterparty_id'))

WebUI.click(findTestObject('CounterpartyList/Page_TRMTracker/td_0011 - 00112'))

WebUI.click(findTestObject('CounterpartyList/Page_TRMTracker/div_ok'))

WebUI.doubleClick(findTestObject('Report_View/Page_TRMTracker/input_Location_label_location_id'))

WebUI.delay(5)

WebUI.click(findTestObject('LocationList/Page_TRMTracker/td_2869'))

//def targetA = findTestObject('LocationList/Page_TRMTracker/td_3192')
//
//def targetB = findTestObject('LocationList/Page_TRMTracker/td_2961')
//
//actions.keyDown(Keys.LEFT_CONTROL).click(targetA).click(targetB).keyUp(Keys.LEFT_CONTROL).perform()

WebUI.click(findTestObject('Report_View/Page_TRMTracker/div_HTML'))

WebUI.delay(10)

WebUI.verifyElementPresent(findTestObject('Table verify/Page_TRMTracker/table_PNL Attribution Report'), 20)

