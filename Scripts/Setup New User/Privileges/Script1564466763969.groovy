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
import com.kms.katalon.core.testobject.ConditionType as ConditionType

WebUI.callTestCase(findTestCase('User Login/ValidLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://dev01.farrms.us/trmtracker_release/trm/main.menu/scripts/main.menu.trm.php')

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/i_Toggle navigation_fa fa-bars'))

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/a_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/a_User and Role'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Setup User'))

WebUI.delay(2)

WebUI.setText(findTestObject('Page_TRMTracker/input__dhxId_DIj113eFGBBv'), 'ronish')

WebUI.delay(2)

WebUI.doubleClick(findTestObject('Page_TRMTracker/td_filtered_User'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/div_Privilege'))

WebUI.delay(5)

WebUI.mouseOver(findTestObject('Object Repository/Page_TRMTracker/div_Editprivilege'))

WebUI.delay(2)

WebUI.scrollToElement(findTestObject('Page_TRMTracker/div_privilegeadd'), 2)

WebUI.click(findTestObject('Page_TRMTracker/div_privilegeadd'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/div_'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_TRMTracker/div_SaveAsignPrevilege'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_TRMTracker/div_Cancel_Privilege'))

