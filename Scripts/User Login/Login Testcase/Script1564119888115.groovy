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
import com.kms.katalon.core.logging.KeywordLogger as KeywordLogger
import org.codehaus.groovy.ast.expr.EmptyExpression as EmptyExpression

//int rowlen = findTestData('Login Testdata').getRowNumbers()
//row_count = findTestData('Login Testdata').getRowNumbers()
rowlength = 1

WebUI.openBrowser('')

WebUI.navigateToUrl('https://dev01.farrms.us/trmtracker_release/trmclient/')

//WebUI.navigateToUrl('https://stg01.farrms.us/TRMTracker_PROD/trmclient/')
//for (def row = 1; row <= row_count; row++) {
rowlength = row

def username = findTestData('Login Testdata').getValue(1, row)

def password = findTestData('Login Testdata').getValue(2, row)

def expected = findTestData('Login Testdata').getValue(3, row)

WebUI.comment(expected)

def Scenario = findTestData('Login Testdata').getValue(6, row)

WebUI.comment(Scenario)

WebUI.setText(findTestObject('Object Repository/Page_TRMTracker Login/input_User Name_txt_user_name'), username)

//WebUI.comment(username)
WebUI.setText(findTestObject('Object Repository/Page_TRMTracker Login/input_Password_txt_password'), password)

//WebUI.comment(password)
WebUI.click(findTestObject('Object Repository/Page_TRMTracker Login/button_Login'))

if (Scenario.equals('valid')) {
    WebUI.switchToWindowTitle('TRMTracker')

    ActualResult = WebUI.getText(findTestObject('Page_TRMTracker/a_TRMTracker'), FailureHandling.STOP_ON_FAILURE)

    WebUI.comment(ActualResult // ActualResult = WebUI.getAttribute(findTestObject('Page_TRMTracker Login/error_msg'), 'text')
        )
} else {
    //WebUI.waitForElementPresent(findTestObject('Page_TRMTracker Login/error_msg'), 60)
	WebUI.delay(5)
    ActualResult = WebUI.getText(findTestObject('Page_TRMTracker Login/error_msg'), FailureHandling.STOP_ON_FAILURE)

    WebUI.comment(ActualResult)
}

if (ActualResult.equals(expected)) {
    //WebUI.comment('Pass')
    //WebUI.comment('Fail')
} else {
    throw new Exception('failed')
}

//WebUI.verifyMatch( ActualResult, expected, true)
WebUI.delay(3)

//}
//WebUI.switchToWindowTitle('TRMTracker')
WebUI.closeBrowser(FailureHandling.STOP_ON_FAILURE)

@com.kms.katalon.core.annotation.TearDownIfFailed
@com.kms.katalon.core.annotation.TearDownIfError
def failed() {
    CustomKeywords.'mypack.WriteExcel.demoKey'('Failed', 'login', rowlength, 4)

    CustomKeywords.'mypack.WriteExcel.demoKey'('Error finding  element', 'login', rowlength, 3)
}

@com.kms.katalon.core.annotation.TearDownIfPassed
def passed() {
    CustomKeywords.'mypack.WriteExcel.demoKey'('Passed', 'login', rowlength, 4)
}

