package Selenium_Automation;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment3 
{

	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapp.skillrary.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		WebElement ele = driver.findElement(By.id("cars"));
		Select sec = new Select(ele);
		Thread.sleep(3000);
		
		sec.selectByIndex(0);
		sec.selectByIndex(1);
		sec.selectByIndex(2);
		//ele.is
		
		//		//List<WebElement> all = sec.getAllSelectedOptions();
//		for (WebElement a : all) 
//		{
//			String text1 = a.getText();
//			System.out.println(text1);
//			
//
//			}
//		 boolean v=ele.isSelected();
//		 if(v)
//		 {
//			 System.out.println("listbox is selected"); 
//		 }
//		 else
//		 {
//			 System.out.println("listbox is not selected"); 
//		 }
//
//			
//		
//		
}
}
