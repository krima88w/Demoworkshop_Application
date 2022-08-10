package scrollBar;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		
	WebDriver driver = new	ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.selenium.dev/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	
	//js.executeScript("window.scrollTo(0,500);");
	//js.executeScript("window.scrollBy(0,500);");
	js.executeScript("document.getElementsByClassName('selenium text-center')[0].scrollIntoView();");
	Thread.sleep(3000);
	js.executeScript("window.scrollBy(0,-80);");
	WebElement ele1 = driver.findElement(By.xpath("//h2[text() = 'Selenium Level Sponsors']"));
	ele1.click();
	
	
	
	
	
	
	
	
	
		
		
		
	}
	
	
	
}
