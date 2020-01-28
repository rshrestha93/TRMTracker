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

WebUI.openBrowser('https://dev01.farrms.us/trmtracker_release/trmclient/')

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Login page/Span_TRMTracker'), 'TRMTracker')

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Login page/Span_Username'), 'USER NAME')

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Login page/Span_Password'), 'PASSWORD')

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Login page/Span_Forget_password'), 'Forgot Password?')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Login page/Span_Forget_password'))

