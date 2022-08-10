package Selenium_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Amazon 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ele = driver.findElement(By.name("url"));
		ele.click();
		Thread.sleep(3000);
		Select  sel = new Select(ele);
		Thread.sleep(3000);
		sel.selectByIndex(5);
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
	}
	
}
