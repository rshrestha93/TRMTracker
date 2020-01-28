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

WebUI.switchToWindowTitle('TRMTracker')

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/a_Toggle navigation_make-small-nav'))

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Middle Office'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/span_Valuation And Risk Analysis'), 30)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Valuation And Risk Analysis'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/a_Run Analytical Process'), 30)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/a_Run Analytical Process'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/a_Run MTM Process'), 30)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/a_Run MTM Process'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/div_book'), 30)

//WebUI.click(findTestObject('Page_TRMTracker/div_book'))
WebUI.mouseOver(findTestObject('MTM Process/Page_TRMTracker/div_Edit'))

WebUI.waitForElementVisible(findTestObject('MTM Process/Page_TRMTracker/div_Add'), 30)

WebUI.click(findTestObject('MTM Process/Page_TRMTracker/div_Add'))

WebUI.waitForElementVisible(findTestObject('MTM Process/Page_TRMTracker/div_'), 30)

WebUI.click(findTestObject('MTM Process/Page_TRMTracker/div_'))

WebUI.click(findTestObject('MTM Process/Page_TRMTracker/div_Reference ID'))

WebUI.setText(findTestObject('MTM Process/Page_TRMTracker/div_Reference ID'), 'Power Swap Deal')

WebUI.click(findTestObject('MTM Process/Page_TRMTracker/div_Refresh'))

WebUI.waitForElementVisible(findTestObject('MTM Process/Page_TRMTracker/div_power swap deal'), 30)

WebUI.click(findTestObject('MTM Process/Page_TRMTracker/div_power swap deal'))

WebUI.click(findTestObject('MTM Process/Page_TRMTracker/div_ok'))

WebUI.click(findTestObject('MTM Process/Page_TRMTracker/Select_deal'))

//WebUI.doubleClick(findTestObject('MTM Process/Page_TRMTracker/div_asofdate'))
WebUI.click(findTestObject('MTM Process/Page_TRMTracker/div_asofdate'))

WebUI.sendKeys(findTestObject('MTM Process/Page_TRMTracker/div_asofdate'), Keys.chord(Keys.CONTROL, 'a'))
//WebUI.clearText(findTestObject('MTM Process/Page_TRMTracker/div_asofdate'))

WebUI.delay(2)

WebUI.sendKeys(findTestObject('MTM Process/Page_TRMTracker/div_asofdate'),'12/31/2017')

WebUI.click(findTestObject(''))