package addtocart;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
public class Addtocart extends BaseClass{
	@Test
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		driver.findElement(By.xpath("//a [ text() = 'Log in']")).click();
		FileInputStream fis = new FileInputStream("./Data1.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		String Email = wb.getSheet("Sheet1").getRow(1).getCell(2).getStringCellValue();
		String password = wb.getSheet("Sheet1").getRow(1).getCell(3).getStringCellValue();
		driver.findElement(By.xpath("//input [@value = 'Log in']")).click();
	}
}

