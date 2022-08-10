package popups;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.sdk.metrics.data.Data;
import net.bytebuddy.utility.privilege.GetSystemPropertyAction;

public class Task8 
{

	public static void main(String[] args) throws IOException 
	{
	
		Properties p = new Properties();
		FileInputStream  fs = new FileInputStream("./Data.properties");
		p.load(fs);
		
		WebDriver  driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(p.getProperty("URL"));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.findElement(By.id("email")).sendKeys(p.getProperty("Username1"));
		driver.findElement(By.id("pass")).sendKeys(p.getProperty("password1"));
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
}
