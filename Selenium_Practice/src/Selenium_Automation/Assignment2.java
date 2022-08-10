package Selenium_Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("cars"));
		Select sec = new Select(ele);
		Thread.sleep(3000);
		sec.selectByIndex(0);
		sec.selectByIndex(1);
		sec.selectByIndex(2);
		Thread.sleep(3000);
		List<WebElement> opt = sec.getAllSelectedOptions();
		for (WebElement WB : opt) 
		{
		    System.out.println(WB.getText());			
		}
		Thread.sleep(3000);
		sec.getFirstSelectedOption();
		Thread.sleep(3000);
		sec.deselectByIndex(0);
		Thread.sleep(3000);
		sec.deselectByIndex(1);
		Thread.sleep(3000);
		sec.deselectByIndex(2);
		Thread.sleep(3000);
		driver.close();
	}
	
}
