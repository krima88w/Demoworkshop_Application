package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popups2 
{

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		driver.switchTo().frame(1);
		
		driver.findElement(By.xpath("//button[@onclick='myFunction()']")).click();
		Alert a = driver.switchTo().alert();
		a.sendKeys("Manjunath");
		a.accept();
		WebElement ele = driver.findElement(By.id("demo"));
		System.out.println(ele.getText());
		driver.close();
		
		
		
		
		
	}
}
