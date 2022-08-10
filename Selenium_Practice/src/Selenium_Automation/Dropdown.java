package Selenium_Automation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement ele = driver.findElement(By.xpath("//a [@aria-label = 'Google apps']"));
		ele.click();
		Thread.sleep(3000);
	    WebElement ele1 = driver.findElement(By.name("app"));
		Thread.sleep(3000);
		//driver.switchTo().frame(e
		driver.switchTo().frame(ele1);
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span [text() = 'Calendar']")).click();
		Thread.sleep(3000);
		
		driver.close();
		
		
		
		
		
	}
	
	
}
