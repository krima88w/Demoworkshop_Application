package LaunchTheBrowser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

@Test

public class TC1_Test extends BaseClass{

	public void Launch_Browser2() throws InterruptedException
	{
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		driver.get("https://www.epfindia.gov.in/site_en/index.php");
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[@title = 'Our Services']"));
		WebElement ele1 = driver.findElement(By.xpath("//a[text()  = 'For Employees']"));
		Thread.sleep(3000);
		a.moveToElement(ele).perform();
		ele1.click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a [text() = 'Member Passbook']")).click();
		//driver.getWindowHandles();
		
		
	}
	
}
