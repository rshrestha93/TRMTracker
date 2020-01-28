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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev01.farrms.us/trmtracker_release/trmclient/')
//WebUI.navigateToUrl('https://stg01.farrms.us/TRMTracker_PROD/trmclient/')
String title = WebUI.getWindowTitle()

String title1 = 'TRMTracker: Login'

if (title.equals(title1)) {
    WebUI.comment('Title Matched')
} else {
    WebUI.executeJavaScript('alert(\'page title not matched\')', null)

    WebUI.delay(2)
}

WebUI.setText(findTestObject('Page_TRMTracker Login/input_User Name_txt_user_name'), 'ronish')

WebUI.setText(findTestObject('Page_TRMTracker Login/input_Password_txt_password'), 'Kathmandu123')

//WebUI.waitForElementClickable(findTestObject('Page_TRMTracker Login/button_Login'), 5)
WebUI.click(findTestObject('Page_TRMTracker Login/button_Login'))

