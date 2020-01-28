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

WebUI.callTestCase(findTestCase('User Login/ValidLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://dev01.farrms.us/trmtracker_release/trm/main.menu/scripts/main.menu.trm.php')

WebUI.click(findTestObject('Page_TRMTracker/i_Toggle navigation_fa fa-bars'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_TRMTracker/a_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_TRMTracker/span_User and Role'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_TRMTracker/span_Setup User'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_TRMTracker/div_Edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_TRMTracker/div_Add'))

WebUI.delay(5)

def dropdownlist = findTestData('Login Testdata').getValue(1, 1)

WebUI.comment(dropdownlist)

WebUI.setText(findTestObject('dropdowns/Page_TRMTracker/input__region'), dropdownlist, FailureHandling.STOP_ON_FAILURE)

WebUI.sendKeys(findTestObject('dropdowns/Page_TRMTracker/input__timezone'), Keys.chord(Keys.ENTER))

