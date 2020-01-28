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

WebUI.callTestCase(findTestCase('User Login/ValidLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('TRMTracker')

WebUI.navigateToUrl('https://dev01.farrms.us/trmtracker_release/trm/main.menu/scripts/main.menu.trm.php')

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/a_Toggle navigation_make-small-nav'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/a_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/a_Setup'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_TRMTracker/a_Reference Data'), 2)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/a_Reference Data'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_TRMTracker/span_Setup Price Curve'))

WebUI.mouseOver(findTestObject('Page_TRMTracker/div_Edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_TRMTracker/div_Add'))

WebUI.waitForElementClickable(findTestObject('Setup Price Curve/Page_TRMTracker/General/input__curve_name'), 30)

WebUI.click(findTestObject('Setup Price Curve/Page_TRMTracker/General/input__curve_name'))

WebUI.click(findTestObject('Setup Price Curve/Page_TRMTracker/div_Additional'))

WebUI.doubleClick(findTestObject('Setup Price Curve/Page_TRMTracker/Additional/input_Formula_label_formula_id'))

WebUI.doubleClick(findTestObject('Setup Price Curve/Page_TRMTracker/Formula_Browser/span_Date Time'))

WebUI.dragAndDropToObject(findTestObject('Setup Price Curve/Page_TRMTracker/Formula_Browser/span_DaysInContractMnth'), findTestObject(
        'Setup Price Curve/Page_TRMTracker/Formula_Browser/div_Remove_formula_tags'))

WebUI.click(findTestObject('Setup Price Curve/Page_TRMTracker/Formula_Browser/div_Save'))

WebUI.click(findTestObject('Setup Price Curve/Page_TRMTracker/div_Risk Bucketing'))

WebUI.click(findTestObject('Setup Price Curve/Page_TRMTracker/Risk Bucketing/div_Risk Bucket_dhxcombo_dhx_web'))

WebUI.click(findTestObject('Setup Price Curve/Page_TRMTracker/div_Fair Value Reporting'))

WebUI.click(findTestObject('Setup Price Curve/Page_TRMTracker/Fair Value reporting/div_Fair Value Reporting Group_dhxcombo_dhx_web'))

WebUI.click(findTestObject('Setup Price Curve/Page_TRMTracker/div_Valuation'))

WebUI.acceptAlert()

