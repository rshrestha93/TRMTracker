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

WebUI.waitForElementVisible(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/User defined Table'), 
    30)

WebUI.click(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/User defined Table'))

WebUI.waitForElementVisible(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/User Defined Table Menu/System User Defined Table'), 
    30)

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/User Defined Table Menu/System User Defined Table'), 
    'Setup User Defined Table')

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/User Defined Table Menu/View User Defined Table'), 
    'View User Defined Table')

