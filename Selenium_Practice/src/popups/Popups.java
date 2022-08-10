package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups 

{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/25-virtual-gift-card");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//input[@type = 'submit']")).click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		driver.close();
		
		
		
		
		
		
	}
	
	
}
