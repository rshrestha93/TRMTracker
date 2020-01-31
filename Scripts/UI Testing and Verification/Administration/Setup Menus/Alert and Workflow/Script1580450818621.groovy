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

WebUI.waitForElementVisible(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Alert and Workflow'), 
    30)

WebUI.click(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Alert and Workflow'))

WebUI.waitForElementVisible(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Alert and Workflow Menu/Manage Approval'), 
    30)

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Alert and Workflow Menu/Manage Approval'), 
    'Manage Approval')

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Alert and Workflow Menu/Setup Workflow-Alerts'), 
    'Setup Workflow/Alerts')

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Alert and Workflow Menu/Workflow Module Mapping'), 
    'Workflow Module Mapping')

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Alert and Workflow Menu/Setup Simple Alert'), 
    'Setup Simple Alert')

WebUI.verifyElementText(findTestObject('UI Testing and Verification/Administration Menu/Setup Menu/Alert and Workflow Menu/Setup Advanced Workflow Rule'), 
    'Setup Advanced Workflow Rule')

