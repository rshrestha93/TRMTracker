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

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.testng.Assert as Assert

WebDriver driver = DriverFactory.getWebDriver()
Actions actions = new Actions(driver)



// To locate table.
WebElement mytable = driver.findElement(By.xpath("(//div[contains(@id,'ReportGridStyle_forRW')])[2]//tbody"));
// To locate rows of table.
List<WebElement> rows_table = mytable.findElements(By.tagName("tr"));
// To calculate no of rows In table.
int rows_count = rows_table.size();
// Loop will execute till the last row of table.
for (int row = 0; row < rows_count; row++) {
	// To locate columns(cells) of that specific row.
	List<WebElement> Columns_row = rows_table.get(row).findElements(By.tagName("td"));
	// To calculate no of columns (cells). In that specific row.
	int columns_count = Columns_row.size();
	System.out.println("Number of cells In Row " + row + " are " + columns_count);
	// Loop will execute till the last cell of that specific row.
	for (int column = 0; column < columns_count; column++) {
		// To retrieve text from that specific cell.
		String celtext = Columns_row.get(column).getText();
		System.out
				.println("Cell Value of row number " + row + " and column number " + column + " Is " + celtext);
	}

}
FileInputStream fis = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\resources\\excelfiles\\Bas Outline Mode Report.xlsx");
XSSFWorkbook wb = new XSSFWorkbook(fis);

// Read sheet inside the workbook by its name
XSSFSheet sh1 = wb.getSheetAt(0);
// Data formatter
DataFormatter formatter = new DataFormatter();
// Find number of rows in excel file
// Iterate through each rows one by one
Iterator<Row> rowIterator = sh1.iterator();
while (rowIterator.hasNext()) {
	Row row = rowIterator.next();
	// For each row, iterate through all the columns
	Iterator<Cell> cellIterator = row.cellIterator();

	while (cellIterator.hasNext()) {
		Cell cell = cellIterator.next();
		// Check the cell type and format accordingly
		switch (cell.getCellType()) {
		case Cell.CELL_TYPE_NUMERIC:
			cell.getNumericCellValue();
			String value = formatter.formatCellValue(cell);
			System.out.print(value + " ");

			break;
		case Cell.CELL_TYPE_STRING:
			System.out.print(cell.getStringCellValue() + " ");
			break;
		}
	}
	System.out.println("");
}