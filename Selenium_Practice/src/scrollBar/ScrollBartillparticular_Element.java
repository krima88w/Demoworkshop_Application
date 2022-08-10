package scrollBar;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBartillparticular_Element 
{

	private static org.openqa.selenium.Point loc;

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement ele = driver.findElement(By.xpath("//span[text() = 'Smartwatches & fitness trackers']"));
		//org.openqa.selenium.Point loc = ele.getLocation();
		loc = ele.getLocation();
		int x = loc.getX();
	    int y  = loc.getY();
	    //type casting
		JavascriptExecutor jr = (JavascriptExecutor) driver;
		jr.executeScript("window.scrollBy("+x+","+(y-200)+")");
		//jr.executeScript("window.
		//jr.executeScript(null, "window.scrollBy("+x+","+(y-200)+")");
		ele.click();
		driver.close();
		
	}
	
	
	
}
