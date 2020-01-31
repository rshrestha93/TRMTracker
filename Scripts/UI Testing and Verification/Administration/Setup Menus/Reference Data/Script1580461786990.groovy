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

WebUI.waitForElementVisible(findTestObject('UI Testing and Verification/Administration Menu/Setup'), 30)

WebUI.click(findTestObject('UI Testing and Verification/Administration Menu/Setup'))

WebUI.waitForElementVisible(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Reference Data'), 
    30)

WebUI.click(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Reference Data'))

WebUI.waitForElementVisible(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Reference Data Menu/Setup Static Data'), 
    30)

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Reference Data Menu/Setup Static Data'), 
    'Setup Static Data')

WebUI.verifyElementClickable(findTestObject(null))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Reference Data Menu/Setup Book Structure'), 
    'Setup Book Structure')

WebUI.verifyElementClickable(findTestObject(null))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Reference Data Menu/Setup Meter'), 
    'Setup Meter')

WebUI.verifyElementClickable(findTestObject(null))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Reference Data Menu/Setup DST'), 
    'Setup DST')

WebUI.verifyElementClickable(findTestObject(null))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Reference Data Menu/Setup Counterparty'), 
    'Setup Counterparty')

WebUI.verifyElementClickable(findTestObject(null))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Reference Data Menu/Setup Price Curve'), 
    'Setup Price Curve')

WebUI.verifyElementClickable(findTestObject(null))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Reference Data Menu/Setup Renewable Source'), 
    'Setup Renewable Source')

WebUI.verifyElementClickable(findTestObject(null))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Reference Data Menu/Setup Profile'), 
    'Setup Profile')

WebUI.verifyElementClickable(findTestObject(null))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Reference Data Menu/Setup Location'), 
    'Setup Location')

WebUI.verifyElementClickable(findTestObject(null))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Reference Data Menu/Setup UOM Conversion'), 
    'Setup UOM Conversion')

WebUI.verifyElementClickable(findTestObject(null))

