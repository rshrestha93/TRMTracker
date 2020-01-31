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

WebUI.click(findTestObject('UI Testing and Verification/Main Menu/Hamburger Menu'))

WebUI.click(findTestObject('UI Testing and Verification/Menus/Administration'))

WebUI.click(findTestObject('UI Testing and Verification/Administration Menu/Setup'))

WebUI.delay(2)

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Data Cache'), 'Data Cache')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Data Cache'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Setup Logical Trade Lock'), 
    'Setup Logical Trade Lock')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Setup Logical Trade Lock'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/XConnect API Configuration'), 
    'XConnect API Configuration')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/XConnect API Configuration'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Lock As of Date'), 'Lock As of Date')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Lock As of Date'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Setup Default Application Theme'), 
    'Setup Default Application Theme')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Setup Default Application Theme'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Regression Testing'), 
    'Regression Testing')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Regression Testing'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Configuration Manager'), 
    'Configuration Manager')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Configuration Manager'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Setup Book Tag Name'), 
    'Setup Book Tag Name')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Setup Book Tag Name'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Manage Data'), 'Manage Data')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Manage Data'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/User defined Table'), 
    'User Defined Table')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/User defined Table'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Mapping Setup'), 'Mapping Setup')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Mapping Setup'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Data Import-Export'), 
    'Data Import/Export')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Data Import-Export'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Alert and Workflow'), 
    'Alert and Workflow')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Alert and Workflow'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/View Scheduled Job'), 
    'View Scheduled Job')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/View Scheduled Job'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template'), 'Template')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Manage Document'), 'Manage Document')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Manage Document'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Setup Menu'), 'Setup Menu')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Setup Menu'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Manage Email'), 'Manage Email')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Manage Email'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Reference Data'), 'Reference Data')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Reference Data'))

