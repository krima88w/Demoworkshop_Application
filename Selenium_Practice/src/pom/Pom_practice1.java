package pom;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pom_practice1 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text() = 'Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("gender-male")).click();
		Pom_practice pra = new Pom_practice(driver);
		Thread.sleep(3000);
		pra.getFirst_name().sendKeys("manjunath");
		Thread.sleep(3000);
		pra.getLast_name().sendKeys("krishna");
		Thread.sleep(3000);
		pra.getEmaill().sendKeys("manju29kri@gmail.com");
		Thread.sleep(3000);
		pra.getPassword().sendKeys("12345");
		Thread.sleep(3000);
		pra.getConfirmpass().sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.id("register-button")).click();
		Thread.sleep(3000);
		driver.close();
				
	}
	
	
}
