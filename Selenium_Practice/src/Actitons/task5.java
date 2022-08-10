package Actitons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class task5
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions a  = new Actions(driver);
		Thread.sleep(2000);	
		WebElement ele = driver.findElement(By.xpath("//a[text() = 'Laundry Bags']"));
		WebElement ele1 = driver.findElement(By.xpath("(//a[text()='Home & Living'])[1]"));
		a.moveToElement(ele1).perform();
		ele.click();
		driver.close();
		
		
		
		
	}
	
	
}
