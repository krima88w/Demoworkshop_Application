package LaunchTheBrowser;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import io.github.bonigarcia.wdm.WebDriverManager;

@Test

public class TC_Test extends BaseClass{

	public void Launch_Browser() throws InterruptedException
	{
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		assertEquals(false, true);
		Thread.sleep(3000);
		driver.close();
		


	}

}
