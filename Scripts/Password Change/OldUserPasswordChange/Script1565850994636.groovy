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

rowlength = 1

WebUI.callTestCase(findTestCase('User Login/ValidLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://dev01.farrms.us/trmtracker_release/trm/main.menu/scripts/main.menu.trm.php')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Ronish  Shrestha'))

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/a_Profile'))

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/a_Change Password'))

WebUI.delay(1)

//for (def row = 1; row <= findTestData('change Password').getRowNumbers(); row++) {
rowlength = row

def OldPassword = findTestData('change Password').getValue(1, row)

def NewPassword = findTestData('change Password').getValue(2, row)

def ConfirmPassword = findTestData('change Password').getValue(3, row)

def expected = findTestData('change Password').getValue(4, row)

WebUI.comment(expected)

def Scenario = findTestData('change Password').getValue(7, row)

WebUI.comment(Scenario)

WebUI.setText(findTestObject('Change_OldUser_Password/Page_TRMTracker/input_User Name_Old_Password'), OldPassword)

WebUI.setText(findTestObject('Change_OldUser_Password/Page_TRMTracker/input__New_Password'), NewPassword)

WebUI.setText(findTestObject('Change_OldUser_Password/Page_TRMTracker/input__Confirm_Password'), ConfirmPassword)

WebUI.delay(2)

WebUI.click(findTestObject('Change_OldUser_Password/Page_TRMTracker/div_Save'))

if (Scenario.equals('Invalid')) {
    if (expected.equals('Required Field')) {
        ActualResult = WebUI.getText(findTestObject('Change_OldUser_Password/Page_TRMTracker/div_Required Field'), FailureHandling.STOP_ON_FAILURE)

        WebUI.comment(ActualResult)
    } else {
        ActualResult = WebUI.getText(findTestObject('Change_OldUser_Password/Page_TRMTracker/div_Alert Password Rules'), 
            FailureHandling.STOP_ON_FAILURE)

        WebUI.comment(ActualResult)

        WebUI.click(findTestObject('Change_OldUser_Password/Page_TRMTracker/div_OK'))
    }
} else {
ActualResult = WebUI.getText(findTestObject('Change_OldUser_Password/Page_TRMTracker/div_Confirmation'),
	FailureHandling.STOP_ON_FAILURE)
    WebUI.click(findTestObject('Change_OldUser_Password/Page_TRMTracker/div_cancel'))
}

if (ActualResult .equals (expected)) {
    WebUI.comment('Pass' //return 0
        // return 1
        )
} else {
    WebUI.comment('Fail')

    throw new Exception('Failed')
}

WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

@com.kms.katalon.core.annotation.TearDownIfFailed
@com.kms.katalon.core.annotation.TearDownIfError
def failed() {
    CustomKeywords.'mypack.WriteExcel.demoKey'('Failed', 'change password', rowlength, 5)

    CustomKeywords.'mypack.WriteExcel.demoKey'('Error finding element', 'change password', rowlength, 4)
}

@com.kms.katalon.core.annotation.TearDownIfPassed
def passed() {
    CustomKeywords.'mypack.WriteExcel.demoKey'('Passed', 'change password', rowlength, 5)
}

