import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.j2objc.annotations.Property;

public class Task34 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		Properties p = new Properties();
		FileInputStream inpt = new FileInputStream("./Data.properties");
		p.load(inpt);
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("URL1"));
		String un1 = p.getProperty("Username1 ");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//List<WebElement> ele = driver.findElements(By.xpath("//span[contains(text(),'Sign In')]"));
		driver.findElement(By.xpath("//a[@aria-label='Google apps']")).click();
		driver.switchTo().frame(1);
		driver.findElement(By.xpath("//span[text()='Gmail']")).click();
		driver.findElement(By.xpath("//a[text() = 'Sign in']")).click();
		Thread.sleep(3000);
		Task1 tk = new Task1(driver);
		//tk.email(p.getProperty("Username1"));
		
//		WebElement ele1 = driver.findElement(By.xpath("//div[text() = 'Email or phone']"));
//		WebDriverWait t = new WebDriverWait(driver,Duration.ofSeconds(20)); 
//		t.until(ExpectedConditions.visibilityOf(ele1));
//		ele1.sendKeys(p.getProperty("Username1"));
//		//t.until(ExpectedConditions.elementToBeClickable(element));
//		
//		Thread.sleep(3000);
//		WebElement ele2 = driver.findElement(By.xpath("//input[@aria-label='Enter your password']"));
//		t.until(ExpectedConditions.visibilityOf(ele2));
//		ele2.sendKeys(p.getProperty("password1"));
//		driver.findElement(By.xpath("//span[text()='Next']")).click();
//		driver.findElement(By.xpath("//div[text()='Compose']")).click();
//		
		
		
		
		
		
		
	}
}
