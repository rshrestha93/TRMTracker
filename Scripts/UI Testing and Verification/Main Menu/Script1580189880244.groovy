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

WebUI.verifyElementVisible(findTestObject('Report manager/Page_TRMTracker/Title'), FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Main Menu/Hamburger Menu'))

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Main Menu/Search-minus'))

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Main Menu/History'))

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Main Menu/Star'))

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Main Menu/Pie-chart'))

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Main Menu/Refresh'))

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Main Menu/Tiles Windows'))

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Main Menu/Search'))

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Main Menu/Calendar'))

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Main Menu/Warning-Alert'))

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Main Menu/Envelope'))

WebUI.waitForElementVisible(findTestObject('UI Testing and Verification/Main Menu/img'), 30)

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Main Menu/span_Ronish  Shrestha'))

WebUI.click(findTestObject('UI Testing and Verification/Main Menu/span_Ronish  Shrestha'))

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Main Menu/Power-off'))

