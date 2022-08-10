package Actitons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 
{

	public static void main(String[] args) 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions a  = new Actions(driver);
		WebElement ele1 = driver.findElement(By.linkText("Fashion"));
		a.moveToElement(ele1).perform();
		driver.findElement(By.linkText("Accessories for men")).click();
		driver.close();
	}
	
	
	
	
}
