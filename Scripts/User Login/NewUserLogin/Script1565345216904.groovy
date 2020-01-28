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

for (def row = 1; row <= findTestData('change Password').getRowNumbers(); row++) {
    def Username = findTestData('change Password').getValue(1, row)

    def Password = findTestData('change Password').getValue(2, row)

    def OldPassword = findTestData('change Password').getValue(3, row)

    def NewPassword = findTestData('change Password').getValue(4, row)

    def ConfirmPassword = findTestData('change Password').getValue(5, row)

    WebUI.setText(findTestObject('Page_TRMTracker Login/input_User Name_txt_user_name'), Username)

    WebUI.setText(findTestObject('Page_TRMTracker Login/input_Password_txt_password'), Password)

    WebUI.click(findTestObject('Page_TRMTracker Login/button_Login'))

    WebUI.setText(findTestObject('change NewUsers password/Page_TRMTracker Login/input_User Name_Old_Password'), OldPassword)

    WebUI.setText(findTestObject('change NewUsers password/Page_TRMTracker Login/input__New_Password'), NewPassword)

    WebUI.setText(findTestObject('change NewUsers password/Page_TRMTracker Login/input__Confirm_Password'), ConfirmPassword)

    WebUI.click(findTestObject('change NewUsers password/Page_TRMTracker Login/div_Save'))

    WebUI.click(findTestObject('null'))
}

WebUI.closeBrowser()

