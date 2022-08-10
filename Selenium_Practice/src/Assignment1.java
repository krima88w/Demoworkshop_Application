import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[text() = '✕']")).click();
		WebElement ele = driver.findElement(By.name("q"));
		ele.sendKeys("Iphone");
		driver.findElement(By.xpath("//button[@type = 'submit']")).click();
		
		//Robot r = new Robot();
		//r.keyPress(KeyEvent.VK_ENTER);
		//r.keyRelease(KeyEvent.VK_ENTER);
		
		//ele.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text() = 'APPLE iPhone 11 (White, 128 GB)']")).click();
		String parent = driver.getWindowHandle();
		Set<String> all = driver.getWindowHandles();
		for (String s : all) 
		{
		 if (!s.equals(parent)) 
		 	{
		
			 driver.switchTo().window(s);
			 		 
		 	}
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text() = 'Add to Cart']")).click();
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.switchTo().defaultContent().close();
				
	}
	
}
