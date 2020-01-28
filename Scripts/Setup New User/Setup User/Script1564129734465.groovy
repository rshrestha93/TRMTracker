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

//WebUI.navigateToUrl('https://dev01.farrms.us/trmtracker_release/trm/main.menu/scripts/main.menu.trm.php')
//WebUI.navigateToUrl('https://stg01.farrms.us/TRMTracker_PROD/trm/main.menu/scripts/main.menu.trm.php#')
WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/i_Toggle navigation_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Administration'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/span_User and Role'), 10)

WebUI.click(findTestObject('Page_TRMTracker/span_User and Role'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Setup User'))

WebUI.delay(2)

WebUI.mouseOver(findTestObject('Page_TRMTracker/div_Edit'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/div_Add'))

WebUI.delay(2)

for (def row = 2; row <= findTestData('setup user').getRowNumbers(); row++) {
    def login = findTestData('setup user').getValue(1, row)

    WebUI.comment(login)

    def email = findTestData('setup user').getValue(2, row)

    def fname = findTestData('setup user').getValue(3, row)

    def lname = findTestData('setup user').getValue(4, row)

    def timezone = findTestData('setup user').getValue(5, row)

    def region = findTestData('setup user').getValue(6, row)

    def menutype = findTestData('setup user').getValue(7, row)

    WebUI.setText(findTestObject('Object Repository/Page_TRMTracker/input__user_login_id'), login)

    //actualValue = WebUI.getAttribute(findTestObject('Page_TRMTracker/input__user_login_id'), 'value')
    //WebUI.verifyMatch(actualValue, 'rshrestha', false)
    WebUI.setText(findTestObject('Object Repository/Page_TRMTracker/input__user_emal_add'), email)

    WebUI.setText(findTestObject('Object Repository/Page_TRMTracker/input__user_f_name'), fname)

    WebUI.setText(findTestObject('Object Repository/Page_TRMTracker/input__user_l_name'), lname)

    //WebUI.click(findTestObject('Page_TRMTracker/div__dhxcombo_select_img'))
    //WebUI.click(findTestObject('Object Repository/Page_TRMTracker/div_(GMT 545) Kathmandu'))
    //def dropdownlist = findTestData('Login Testdata').getValue(1, 1)
    //WebUI.comment(dropdownlist)
    WebUI.setText(findTestObject('dropdowns/Page_TRMTracker/input__timezone'), timezone, FailureHandling.STOP_ON_FAILURE)

    WebUI.sendKeys(findTestObject('dropdowns/Page_TRMTracker/input__timezone'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('dropdowns/Page_TRMTracker/input__region'), region)

    WebUI.sendKeys(findTestObject('dropdowns/Page_TRMTracker/input__region'), Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('dropdowns/Page_TRMTracker/input_menutype'), menutype)

    WebUI.sendKeys(findTestObject('dropdowns/Page_TRMTracker/input_menutype'), Keys.chord(Keys.ENTER))

    //WebUI.selectOptionByLabel(findTestObject('Page_TRMTracker/div__dhxcombo_select_img'), '(GMT +10:00) Eastern Australia, Guam, Vladivostok',  false)
    WebUI.click(findTestObject('Object Repository/Page_TRMTracker/div_Save')) 

    WebUI.click(findTestObject('Change_OldUser_Password/Page_TRMTracker/div_OK'))
}

