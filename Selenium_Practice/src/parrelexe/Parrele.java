package parrelexe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parrele {
	
	WebDriver driver;
	@Parameters ({"BrowserName"})
	
	@Test
	
	public void m1(String browser) {
		if (browser.equals("Chrome"))
		{
		
			driver = new ChromeDriver();
				
		} else if (browser.equals("Firefox")) {
			
		
			driver = new FirefoxDriver();

		}
		
		
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.name("q")).sendKeys("selenium");
		driver.close();
	}
	
	
	

}
