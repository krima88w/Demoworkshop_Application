package Actitons;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Actions a  = new Actions(driver);
		Thread.sleep(2000);
		WebElement source = driver.findElement(By.xpath("(//h1[@class='draghandle'])[1]"));
		WebElement target = driver.findElement(By.xpath("(//h1[@class='draghandle'])[4]"));
		a.dragAndDrop(source, target).perform();
		driver.close();
		
		
		
	
	
	}
}
