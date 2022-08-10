package popups;

import java.awt.Desktop.Action;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Task5 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.id("course"));
		Thread.sleep(3000);
		a.moveToElement(ele).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[text() = 'Selenium Training'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text() = ' Add to Cart']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		driver.close();
		
		
		
		
		
		
		
}
}