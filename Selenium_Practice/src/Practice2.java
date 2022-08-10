import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Practice2 
{

	public static void main(String[] args) {
		
	
	
	//ChromeOptions options= new ChromeOptions();
//	options.addArguments("--disable-notifications");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://accounts.google.com/servicelogin/signinchooser?flowName=GlifWebSignIn&flowEntry=ServiceLogin");

//	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//	driver.findElement(By.xpath("//div[@class='dropdown']//a[text()='Select Product Type']")).click();
//	driver.findElement(By.xpath("//ul[@class = 'dropdown1 dropdown-menu']//li[text() = 'Loans']")).click();
//	driver.findElement(By.xpath("//a[text() = 'Select Product']")).click();
//	driver.findElement(By.xpath("//ul[@class = 'dropdown2 dropdown-menu']//li[text() = 'Loan on Credit Card']")).click();
//	//driver.close();
	
	
	
	
	}
	
	
	
}
