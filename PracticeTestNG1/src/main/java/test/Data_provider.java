package test;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.reporters.jq.Main;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Data_provider 
{

	
	@DataProvider(name = "dataprovider")
		
		public Object[][] demo()
		{
			
			Object[][] data   = new Object [2][2];
			data[0][0] = "Admin";
		    data[0][1] = "admin123";
		    data[1][0] = "Admin";
		    data[1][1] = "admin2345";
		    return data;
		}
	@Test(dataProvider = "dataprovider")
	
	public void user(String userna, String  passw)
	
	{
		
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.id("txtUsername")).sendKeys(userna);
		driver.findElement(By.id("txtPassword")).sendKeys(passw);
		driver.findElement(By.id("btnLogin")).click();
		boolean ele = driver.findElement(By.id("welcome")).isDisplayed();
		Actions mov = new Actions(driver);
		WebElement ele1 = driver.findElement(By.xpath("//b[text() = 'Dashboard']"));
		mov.moveToElement(ele1).perform();
		driver.findElement(By.xpath("//span[text() = 'Timesheets']")).click();
		Assert.assertTrue(ele, "Welcome Paul") ;
		driver.close();
		
		
		
		
	}
		
}

	

