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

WebUI.waitForElementVisible(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template'), 30)

WebUI.click(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template'))

WebUI.waitForElementVisible(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Compose Email'), 
    30)

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Compose Email'), 
    'Compose Email')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Compose Email'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Setup Confirmation Rule'), 
    'Setup Confirmation Rule')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Setup Confirmation Rule'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Deal Transfer Rule'), 
    'Deal Transfer Rule')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Deal Transfer Rule'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Setup User Defined View'), 
    'Setup User Defined View')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Setup User Defined View'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Setup Custom Report Template'), 
    'Setup Custom Report Template')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Setup Custom Report Template'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Setup Submission Rule'), 
    'Setup Submission Rule')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Setup Submission Rule'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Formula Builder'), 
    'Formula Builder')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Formula Builder'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Setup Deal Template'), 
    'Setup Deal Template')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Setup Deal Template'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Setup Fees'), 
    'Setup Fees')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Setup Fees'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Setup UDF Template'), 
    'Setup UDF Template')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Setup UDF Template'))

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Form Builder'), 
    'Form Builder')

WebUI.verifyElementClickable(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Template Menu/Form Builder'))

