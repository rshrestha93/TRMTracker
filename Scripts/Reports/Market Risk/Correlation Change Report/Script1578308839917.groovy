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
import org.openqa.selenium.JavascriptExecutor
import org.testng.Assert as Assert

WebUI.callTestCase(findTestCase('User Login/ValidLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowTitle('TRMTracker')

WebUI.navigateToUrl('https://dev01.farrms.us/trmtracker_release/trm/main.menu/scripts/main.menu.trm.php')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/i_Toggle navigation_fa fa-bars'))

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Administration'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/span_Reporting'), 30)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_Reporting'))

WebUI.waitForElementVisible(findTestObject('Page_TRMTracker/span_View Report'), 30)

WebUI.click(findTestObject('Object Repository/Page_TRMTracker/span_View Report'))

WebDriver driver = DriverFactory.getWebDriver()
Actions actions = new Actions(driver)
JavascriptExecutor js = (JavascriptExecutor) driver //Scroll 
WebDriverWait wait = new WebDriverWait(driver, 30)
//int EXPECTED_ROW_COUNT = 79;

//switch to first iframe
WebElement xpathframe = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_wins\']//iframe'))
driver.switchTo().frame(xpathframe)

//To Click Market Risk Option
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'Market Risk')]")))
WebElement MarketRisk = driver.findElement(By.xpath("//span[contains(text(),'Market Risk')]"))
js.executeScript("arguments[0].scrollIntoView();", MarketRisk)
actions.doubleClick(MarketRisk).perform()

WebElement Report = driver.findElement(By.xpath("//span[contains(text(),'Correlation Change Report')]"))
js.executeScript("arguments[0].scrollIntoView();", Report);
actions.doubleClick(Report).perform()

//Second iframe
WebElement frame2 = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_layout\']//iframe'))
driver.switchTo().frame(frame2)

//Third iframe
WebElement frame3 = driver.findElement(By.xpath('//div[@class=\'dhx_cell_cont_layout\']//iframe'))
driver.switchTo().frame(frame3)

//As Of Date From
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'As of Date From')]//ancestor::div[1]//following-sibling::div[1]/input")))
WebElement AsOfDateFrom = driver.findElement(By.xpath("//label[contains(text(),'As of Date From')]//ancestor::div[1]//following-sibling::div[1]/input"))
AsOfDateFrom.sendKeys('12/31/2017')

//As Of Date To
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//label[contains(text(),'As of Date To')]//ancestor::div[1]//following-sibling::div[1]/input")))
WebElement AsOfDateTo = driver.findElement(By.xpath("//label[contains(text(),'As of Date To')]//ancestor::div[1]//following-sibling::div[1]/input"))
AsOfDateTo.sendKeys('12/31/2017')

//Index From
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\'dhxform_item_label_top browse_label\']//label[contains(text(),\'Index From\')]//ancestor::div[1]//following-sibling::div/input")))
WebElement Index = driver.findElement(By.xpath('//div[@class=\'dhxform_item_label_top browse_label\']//label[contains(text(),\'Index From\')]//ancestor::div[1]//following-sibling::div/input'))
actions.doubleClick(Index).perform()

WebElement xpathframe2 = driver.findElement(By.xpath("//div[@class='dhx_cell_cont_wins']//iframe"))
driver.switchTo().frame(xpathframe2)

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//td[contains(text(),\'10 min\')]')))
WebElement IndexA = driver.findElement(By.xpath('//td[contains(text(),\'10 min\')]'))
WebElement IndexB = driver.findElement(By.xpath('//td[contains(text(),\'10 year price\')]'))
actions.keyDown(Keys.LEFT_CONTROL).click(IndexA).click(IndexB).keyUp(Keys.LEFT_CONTROL).perform()

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//div[@class=\'dhxtoolbar_text\']')))
WebElement Click = driver.findElement(By.xpath('//div[@class=\'dhxtoolbar_text\']')).click()
driver.switchTo().parentFrame()

//Index To
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\'dhxform_item_label_top browse_label\']//label[contains(text(),\'Index To\')]//ancestor::div[1]//following-sibling::div/input")))
WebElement IndexTo = driver.findElement(By.xpath('//div[@class=\'dhxform_item_label_top browse_label\']//label[contains(text(),\'Index To\')]//ancestor::div[1]//following-sibling::div/input'))
actions.doubleClick(IndexTo).perform()

WebElement xpathframe1 = driver.findElement(By.xpath("//div[@class='dhxwin_active']//div[@class='dhx_cell_wins']//iframe"))
driver.switchTo().frame(xpathframe1)

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//td[contains(text(),\'15 min\')]')))
WebElement IndexToA = driver.findElement(By.xpath('//td[contains(text(),\'15 min\')]'))
WebElement IndexToB = driver.findElement(By.xpath('//td[contains(text(),\'10 year price\')]'))
actions.keyDown(Keys.LEFT_CONTROL).click(IndexToA).click(IndexToB).keyUp(Keys.LEFT_CONTROL).perform()

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//div[@class=\'dhxtoolbar_text\']')))
WebElement ClickTo = driver.findElement(By.xpath('//div[@class=\'dhxtoolbar_text\']')).click()
driver.switchTo().parentFrame()

//Curve Source
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class=\'dhxform_item_label_top browse_label\']//label[contains(text(),\'Curve Source\')]//ancestor::div[1]//following-sibling::div/input")))
WebElement CurveSource = driver.findElement(By.xpath('//div[@class=\'dhxform_item_label_top browse_label\']//label[contains(text(),\'Curve Source\')]//ancestor::div[1]//following-sibling::div/input'))
actions.doubleClick(CurveSource).perform()

WebElement xpathframe4 = driver.findElement(By.xpath("//div[@class='dhxwin_active']//div[@class='dhx_cell_wins']//iframe"))
driver.switchTo().frame(xpathframe4)

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//td[contains(text(),\'Historical\')]')))
WebElement CurveSourceA = driver.findElement(By.xpath('//td[contains(text(),\'Historical\')]'))
WebElement CurveSourceB = driver.findElement(By.xpath('//td[contains(text(),\'Master\')]'))
actions.keyDown(Keys.LEFT_CONTROL).click(CurveSourceA).click(CurveSourceB).keyUp(Keys.LEFT_CONTROL).perform()

wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//div[@class=\'dhxtoolbar_text\']')))
WebElement Clicks = driver.findElement(By.xpath('//div[@class=\'dhxtoolbar_text\']')).click()
driver.switchTo().parentFrame()

//Term From
WebElement TermFrom = driver.findElement(By.xpath("//label[contains(text(),'Term From')]//ancestor::div[1]//following-sibling::div[1]/input"))
TermFrom.sendKeys('12/31/2017')

//Term To
WebElement TermTo = driver.findElement(By.xpath("//label[contains(text(),'Term To')]//ancestor::div[1]//following-sibling::div[1]/input"))
TermTo.sendKeys('12/31/2017')


//To click HTML
driver.switchTo().parentFrame()
WebElement Html = driver.findElement(By.xpath('//div[(@title = \'HTML\')]')).click()

//Forth Frame
WebElement frame4 = driver.findElement(By.xpath('//div[contains(@class,\'dhxlayout_base_dhx_web\')]//div[contains(@class,\'dhxlayout_base_dhx_web\')]//div[@class=\'dhx_cell_layout\']//iframe'))
driver.switchTo().frame(frame4)

//Verfy if report table is generated or not.
wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath('//table[@class=\'r18\']')))
WebElement verify = driver.findElement(By.xpath('//table[@class=\'r18\']'))

