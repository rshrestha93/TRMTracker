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

WebUI.navigateToUrl('https://dev01.farrms.us/TRMTracker_release/trmclient/')

//row_count = findTestData('Login Testdata').getRowNumbers()

//for (def row = 1; row <= row_count; row++) {
  //  def username = findTestData('Login Testdata').getValue(1, row)
//
    //def password = findTestData('Login Testdata').getValue(2, row)

    WebUI.setText(findTestObject('Page_TRMTracker Login/input_User Name_txt_user_name'), findTestData('Login Testdata').getValue(
            1, 1))

    WebUI.setText(findTestObject('Page_TRMTracker Login/input_Password_txt_password'), findTestData('Login Testdata').getValue(
            2, 1))

    WebUI.click(findTestObject('Page_TRMTracker Login/button_Login') // WebUI.switchToWindowTitle('TRMTracker')
        )
//}

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

