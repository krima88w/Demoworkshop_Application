package excel;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import dataDrivenTesting.Google;

public class Task1 
{

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.co.in/");
		//WebElement ele = driver.findElement(By.xpath("//input [@name = 'q']"));
		Google g = new Google(driver);
		
		driver.navigate().refresh();
		g.google();
		//ele.sendKeys("food");
		
		
		
		
	}
	
	
	
}
