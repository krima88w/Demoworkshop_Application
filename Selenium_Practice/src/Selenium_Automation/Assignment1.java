package Selenium_Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 
{
public static void main(String[] args) throws InterruptedException 
{
 
	WebDriver  driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://demoapp.skillrary.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
	WebElement ele = driver.findElement(By.id("cars"));
			//xpath("//option[@value = '199']"));
	Select sec = new Select (ele);
	sec.selectByIndex(2);
	sec.selectByIndex(4);
	sec.selectByIndex(5);
	Thread.sleep(3000);
	boolean mul = sec.isMultiple();
		
	System.out.println(mul);
	
	
	List<WebElement> option = sec.getAllSelectedOptions();
	Thread.sleep(3000);
	
	for (WebElement a : option)  
	{
		System.out.println(a.getText());	
	}
	Thread.sleep(3000);
	sec.deselectAll();
	Thread.sleep(3000);
	List<WebElement> allopt = sec.getOptions();
	Thread.sleep(3000);
	for (WebElement webElement : allopt) 
	{
		System.out.println(webElement.getText());		
	}
	Thread.sleep(3000);
	
	
	driver.close();
	
	
	
	
	
	
	
	
}
	
	
	
	
}
