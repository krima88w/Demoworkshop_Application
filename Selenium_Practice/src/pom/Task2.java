package pom;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Date;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2 
{

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		FileInputStream fi = new FileInputStream("./data.xlsx");
		Workbook wb = WorkbookFactory.create(fi);
		String url = wb.getSheet("Sheet1").getRow(2).getCell(0).getStringCellValue();
		System.out.println(url);
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Task1 ts = new Task1(driver);
		ts.Login();
		ts.email();
		ts.pass();
		ts.Login1();
		ts.clicklogout();
		ts.logout();
		
		
		
		driver.close();
		
		
		
		
		
	}
	
	
}
