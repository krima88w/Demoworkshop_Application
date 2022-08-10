package genericUtilities;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class ExcelUtility1 {
	@DataProvider(name = "test data1")
	
	 public static Object[][] data() throws EncryptedDocumentException, InvalidFormatException, IOException {
		FileInputStream file = new FileInputStream("./TestData/LoginPageData1.xlsx");
		Workbook workbook = WorkbookFactory.create(file);
		Sheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		//System.out.println(rowCount);
		int cellCount = sheet.getRow(0).getPhysicalNumberOfCells();
		Object [][] obj = new Object[rowCount][cellCount];
		for (int row = 0; row < rowCount; row++) {
			Row actRow = sheet.getRow(row);
			for (int cell = 0; cell < actRow.getLastCellNum(); cell++) {
				obj[row][cell]=actRow.getCell(cell).getStringCellValue();
			}
		}

		return obj;

	}
}
