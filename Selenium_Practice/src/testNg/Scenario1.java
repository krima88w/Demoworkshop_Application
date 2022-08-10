package testNg;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Scenario1 
{

	WebDriver driver;
	@BeforeMethod

	public void m1()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

	}

	@Test
	public void m2()
	{

		driver.findElement(By.id("email")).sendKeys("admin");
		driver.findElement(By.id("pass")).sendKeys("password");
		driver.findElement(By.name("login")).click();
		String title = driver.getTitle();
		String url = driver.getCurrentUrl();
		Reporter.log(title,true);
		Reporter.log(url,true);
		
	}

	@AfterMethod
	public void m3()
	{
		driver.close();	
	}
}


