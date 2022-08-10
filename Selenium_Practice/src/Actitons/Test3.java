package Actitons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions a  = new Actions(driver);
		WebElement ele = driver.findElement(By.name("q"));
		a.contextClick(ele).perform();
		driver.close();
		
		
	}
}
		
		
	
	

