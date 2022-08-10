package Actitons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 
{
	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/product.php?product=selenium-training");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	Actions a  = new Actions(driver);
	Thread.sleep(2000);
	WebElement ele1 = driver.findElement(By.id("add"));
	a.doubleClick(ele1).perform();
	driver.close();
	
	
	
	
	
	
	
	}
}
