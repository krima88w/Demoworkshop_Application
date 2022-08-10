package testNg;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class ParallelTest {
	
	public WebDriver driver;
	@Test
	public void FirefoxTest() throws InterruptedException {	 
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/"); 
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("photo");
		Thread.sleep(3000);
		driver.quit();
	}

	@Test
	public void ChromeTest() throws InterruptedException
	{ 
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/"); 
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("q")).sendKeys("photo");
		Thread.sleep(3000);
		driver.quit();
	}
}
