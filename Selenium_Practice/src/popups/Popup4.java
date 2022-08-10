package popups;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.grid.Main;

public class Popup4 
{

	public static void main(String[] args) throws InterruptedException 
	
	{
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		//driver.switchTo().alert().accept();
		WebElement ele = driver.findElement(By.className("dateInnerCell"));
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElement(By.className("dateInnerCell")).click();
		driver.manage().timeouts().setScriptTimeout(30,TimeUnit.SECONDS);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeAsyncScript("arguments[0].click();",ele);
		//ele.click();
		Thread.sleep(2000);
		driver.close();
		
		
		
	
	
	}
}
