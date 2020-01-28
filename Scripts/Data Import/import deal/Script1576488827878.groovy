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

WebUI.delay(5)

WebUI.switchToWindowTitle('TRMTracker')

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/i_Toggle navigation_fa fa-bars'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/a_Administration'), 30)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/a_Administration'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/a_Setup'), 30)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/a_Setup'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/span_Data ImportExport'), 30)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Data ImportExport'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/span_Data Import'), 30)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Data Import'))

WebUI.waitForElementVisible(findTestObject('Import data/Page_TRMTracker/deal/span_Deal'), 30)

WebUI.doubleClick(findTestObject('Import data/Page_TRMTracker/deal/span_Deal'))

WebUI.waitForElementVisible(findTestObject('Import data/Page_TRMTracker/deal/div_Deals'), 30)

WebUI.mouseOver(findTestObject('Import data/Page_TRMTracker/deal/div_Deals'))

WebUI.click(findTestObject('Import data/Page_TRMTracker/deal/div_Deals'))

WebUI.waitForElementPresent(findTestObject('Import data/Page_TRMTracker/div_Process'), 30)

WebUI.mouseOver(findTestObject('Import data/Page_TRMTracker/div_Process'))

WebUI.waitForElementVisible(findTestObject('Import data/Page_TRMTracker/div_Run Rule'), 30)

WebUI.click(findTestObject('Import data/Page_TRMTracker/div_Run Rule'))

WebUI.waitForElementPresent(findTestObject('Import data/Page_TRMTracker/deal/div_upload_deal'), 30)

//For Uploading file
CustomKeywords.'upload.uploadclass.uploadFile'(findTestObject('Import data/Page_TRMTracker/deal/div_upload_deal'), 'C:\\Users\\ronish.shrestha\\Downloads\\Deals')

WebUI.delay(2)

WebUI.click(findTestObject('Import data/Page_TRMTracker/deal/div_ok'))

WebUI.refresh()

WebUI.click(findTestObject('Import data/Page_TRMTracker/div_message_icon'))

WebUI.click(findTestObject('Import data/Page_TRMTracker/a_View all messages'))

//WebUI.delay(5)
def count = 5

for (i = 1; i < count; i++) {
    try {			
            WebUI.click(findTestObject('Import data/Page_TRMTracker/div_refresh'))

            //WebUI.waitForElementVisible(findTestObject('Import data/Page_TRMTracker/deal/div_deal_message'), 30)
			
            WebUI.verifyElementPresent(findTestObject('Import data/Page_TRMTracker/deal/div_deal_message'), 30)
			break
			   
			}
   
    catch (Exception e) {
    
		WebUI.comment('fail')  
    	}
	 
		if(i == 4){
		throw new Exception('element not found')
		}
	
}

