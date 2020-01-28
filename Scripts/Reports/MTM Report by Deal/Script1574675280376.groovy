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

def AsofDate = findTestData('MTM Report Data').getValue(1, 1)
def Dealid = findTestData('MTM Report Data').getValue(2,1)

WebUI.click(findTestObject('Page_TRMTracker/i_Toggle navigation_fa fa-bars'))

WebUI.click(findTestObject('Page_TRMTracker/a_Administration'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/span_Reporting'), 30)

WebUI.click(findTestObject('Page_TRMTracker/span_Reporting'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/span_View Report'), 30)

WebUI.click(findTestObject('Page_TRMTracker/span_View Report'))

WebUI.waitForElementVisible(findTestObject('MTM Report/Page_TRMTracker/span_MTM'), 30)

WebUI.doubleClick(findTestObject('MTM Report/Page_TRMTracker/span_MTM'))

WebUI.doubleClick(findTestObject('MTM Report/Page_TRMTracker/span_MTM Report by Deal'))

WebUI.doubleClick(findTestObject('MTM Report/Page_TRMTracker/div_Book Structure'))

WebUI.click(findTestObject('MTM Report/Page_TRMTracker/div_'))

WebUI.click(findTestObject('MTM Report/Page_TRMTracker/div_OK'))

WebUI.setText(findTestObject('MTM Report/Page_TRMTracker/div_asofdate'), '12/31/2017')

WebUI.setText(findTestObject('MTM Report/Page_TRMTracker/div_dealid'), Dealid)

WebUI.click(findTestObject('MTM Report/Page_TRMTracker/div_Html'))

