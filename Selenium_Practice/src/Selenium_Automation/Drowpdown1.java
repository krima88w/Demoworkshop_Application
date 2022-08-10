package Selenium_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drowpdown1 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/Selenium%20Software/Dropdown1.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ele = driver.findElement(By.id("Movies"));
		Thread.sleep(3000);
		Select sec = new Select(ele);
		Thread.sleep(3000);
		sec.selectByVisibleText("Thor");
		Thread.sleep(3000);
		driver.close();
	}
}
