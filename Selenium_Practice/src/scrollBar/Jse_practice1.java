package scrollBar;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Jse_practice1 
{

	public static void main(String[] args) 
	{
	
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		JavascriptExecutor  js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementsByClassName('index-lcHeader')[0].scrollIntoView();");
		js.executeScript("window.scrollBy(0,-100)");
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
}
