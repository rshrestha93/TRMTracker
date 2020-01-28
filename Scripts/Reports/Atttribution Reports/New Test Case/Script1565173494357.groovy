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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.openqa.selenium.support.ui.Select as Select

WebUI.callTestCase(findTestCase('User Login/ValidLogin'), [:], FailureHandling.STOP_ON_FAILURE)
WebUI.switchToWindowTitle('TRMTracker')
WebUI.navigateToUrl('https://dev01.farrms.us/trmtracker_release/trm/main.menu/scripts/main.menu.trm.php')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/i_Toggle navigation_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Administration'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Reporting'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_View Report'))

WebUI.delay(2)

//WebUI.doubleClick(findTestObject('Report_View/Page_TRMTracker/div_Attribution'))
//WebUI.doubleClick(findTestObject('Report_View/Page_TRMTracker/div_PNL Attribution Detail Report'))
//WebUI.doubleClick(findTestObject('Report_View/Page_TRMTracker/input_Counterparty_label_counterparty_id'))
//WebUI.delay(2)
WebDriver driver = DriverFactory.getWebDriver()

Actions actions = new Actions(driver)
WebDriverWait wait = new WebDriverWait(driver, 30)
//First iframe
WebElement xpathframe = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_wins\']//iframe'))

driver.switchTo().frame(xpathframe)

WebElement target = driver.findElement(By.xpath('//span[contains(text(),\'Attribution\')]'))

actions.doubleClick(target).perform()

WebElement target1 = driver.findElement(By.xpath('//span[contains(text(),\'PNL Attribution Detail Report\')]'))

actions.doubleClick(target1).perform()

//Second iframe
WebElement xpathframe1 = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_layout\']//iframe'))

driver.switchTo().frame(xpathframe1)

//driver.switchTo().frame(0)
//Third iframe
WebElement xpathframe2 = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_layout\']//iframe'))

driver.switchTo().frame(xpathframe2)


//driver.switchTo().frame(0)
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//*[@class = \'dhxform_textarea calendar\']')))
//for Prior Date
WebElement Priordate = driver.findElement(By.xpath("//label[contains(text(),'Prior As of Date')]//ancestor::div[1]//following-sibling::div/input"))

//Priordate.click()
Priordate.sendKeys('9/2/2019')

//for Location field
WebElement Location = driver.findElement(By.xpath('//div[@class=\'dhxform_item_label_top browse_label\']//label[contains(text(),\'Location\')]//ancestor::div[1]//following-sibling::div/input'))

actions.doubleClick(Location).perform()

WebElement xpathframe4 = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_wins\']//iframe'))

driver.switchTo().frame(xpathframe4)

//WebUI.delay(10)
//WebDriverWait wait = new WebDriverWait(driver, 10);
//WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.id("someid")));
//WebDriverWait wait = new WebDriverWait(driver, 10)

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//td[contains(text(),\'3192\')]')))

WebElement LocationA = driver.findElement(By.xpath('//td[contains(text(),\'3192\')]'))

WebElement LocationB = driver.findElement(By.xpath('//td[contains(text(),\'2961\')]'))

actions.keyDown(Keys.CONTROL).click(LocationA).click(LocationB).keyUp(Keys.CONTROL).perform()

WebUI.delay(2)

WebElement Clicks = driver.findElement(By.xpath('//div[@class=\'dhxtoolbar_text\']')).click()

driver.switchTo().parentFrame()

//int size = driver.findElements(By.xpath("//iframe")).size();
//
//		for(int i=0; i<=size; i++){
//		driver.switchTo().frame(i);
//		int total=driver.findElements(By.xpath("//td[contains(text(),'0011 - 00112')]")).size();
//		System.out.println(total);
//		}


//for Counterparty field
WebElement Counterparty = driver.findElement(By.xpath('//div[@class=\'dhxform_item_label_top browse_label\']//label[contains(text(),\'Counterparty\')]//ancestor::div[1]//following-sibling::div/input'))

actions.doubleClick(Counterparty).perform()

//driver.findElement(By.xpath('//div[@class=\'dhxwin_button dhxwin_button_close\']')).click()
//Forth iframe(Browse)
WebElement xpathframe3 = driver.findElement(By.xpath('//div[@class="dhxwin_active"]//div[@class="dhx_cell_wins"]//iframe'))

driver.switchTo().frame(xpathframe3)

//WebElement scroll = driver.findElement(By.xpath('//span[contains(text(),"Counterparty")]'))
//WebUI.scrollToElement(findTestObject(scroll), 20)
//driver.switchTo().frame(0)
//WebUI.delay(10)
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//td[contains(text(),\'0011 - 00112\')]')))

WebElement CounterpartyA = driver.findElement(By.xpath('//td[contains(text(),\'0011 - 00112\')]'))

WebElement CounterpartyB = driver.findElement(By.xpath('//td[contains(text(),\'00112444 - 0011\')]'))

actions.keyDown(Keys.LEFT_CONTROL).click(CounterpartyA).click(CounterpartyB).keyUp(Keys.LEFT_CONTROL).perform()

WebUI.delay(2)

WebElement Click = driver.findElement(By.xpath('//div[@class=\'dhxtoolbar_text\']')).click()

//To Switch back to previous iframe.
//driver.switchTo().defaultContent()
driver.switchTo().parentFrame()

WebElement target3 = driver.findElement(By.xpath('//div[@class=\'dhxform_item_label_top browse_label\']//label[contains(text(),\'Contract\')]//ancestor::div[1]//following-sibling::div/input'))

actions.doubleClick(target3).perform()

WebElement xpathframe6 = driver.findElement(By.xpath('//div[contains(@class,"dhxwin_active")]//div[contains(@class,"dhx_cell_wins")]//iframe'))

driver.switchTo().frame(xpathframe6)

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//div[contains(@class,\'objbox\')]//tr[2]//td[2]')))

WebElement contract = driver.findElement(By.xpath('//div[contains(@class,"objbox")]//tr[2]//td[2]')).click()

WebElement Clickss = driver.findElement(By.xpath('//div[@class=\'dhxtoolbar_text\']')).click()

driver.switchTo().parentFrame()

//for Current Date
WebElement Currentdate = driver.findElement(By.xpath('//label[contains(text(),\'Current As of Date\')]//ancestor::div[1]//following-sibling::div[1]/input'))

//Currentdate.click()
Currentdate.sendKeys('9/1/2019')

//for Dealstatusgroup
// select the multiple values from a dropdown
//Select selectByValue = new Select(driver.findElement(By.xpath('//body[contains(@class,"dhxlayout_base_dhx_web dhxwins_vp_dhx_web")]/div[@class="dhxlayout_cont"]/div[@class="dhx_cell_layout"]/div[@class="dhx_cell_cont_layout dhx_cell_cont_no_borders"]/div[contains(@class,"dhxtabbar_base_dhx_web")]/div[@class="dhxtabbar_cont"]/div[@class="dhxtabbar_tabs_top"]/div[@class="dhx_cell_tabbar"]/div[@class="dhx_cell_cont_tabbar"]/div[@class="dhxform_obj_dhx_web"]/div[@class="dhxform_base"]/div[@class="block_dhxform_item_label_top"]/div[@class="dhxform_obj_dhx_web dhxform_block"]/div[@class="dhxform_base_nested in_block"]/div[9]/div[1]/div[2]/span[1]/div[1]')));
//selectByValue.selectByVisibleText("All");
WebElement DealStatusGroup = driver.findElement(By.xpath('//label[contains(text(),\'Deal Status Group\')]//ancestor::div[1]//following-sibling::div/span/div/input'))

//DealStatusGroup.click()
DealStatusGroup.sendKeys('All')

DealStatusGroup.sendKeys(Keys.ENTER)

//To click HTML
driver.switchTo().parentFrame()

WebElement Html = driver.findElement(By.xpath('//div[(@title = \'HTML\')]')).click()

//Fifth Iframe(For Report)
WebElement xpathframe5 = driver.findElement(By.xpath('//div[contains(@class,\'dhxlayout_base_dhx_web\')]//div[contains(@class,\'dhxlayout_base_dhx_web\')]//div[@class=\'dhx_cell_layout\']//iframe'))

driver.switchTo().frame(xpathframe5)

//if (driver.findElements(By.xpath('//div[@id=\'5xB_gr\']/table/tbody/tr[2]/td/table')).size() != 0) {
//    System.out.println('Element is Present')
//} else {
//    System.out.println('Element is Absent')
//}
WebElement verify = driver.findElement(By.xpath('//table[@class="a415"]'))

WebUI.acceptAlert()

