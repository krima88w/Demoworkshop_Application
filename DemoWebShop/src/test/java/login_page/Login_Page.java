package login_page;
import static org.testng.Assert.fail;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericUtilities.BaseClass;
import objectRepository.Demoworkshoplogin;
import objectRepository.Registration;

public class Login_Page extends BaseClass {
	@Test(dataProvider = "test data1", dataProviderClass = ReadExcel1.class)
	public void readingData1(String usr, String pwd) throws InterruptedException {
		
		
		driver.findElement(By.xpath("//a[text() = 'Log in']")).click();
		Demoworkshoplogin logi = new Demoworkshoplogin(driver);
		driver.findElement(By.id("Email")).sendKeys(usr);
		driver.findElement(By.id("Password")).sendKeys(pwd);
		driver.findElement(By.xpath("//input[@value = 'Log in']")).click();
		String actualTitle  = driver.getTitle();
		String expectedTitle = "Demo Web Shop";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualTitle, expectedTitle,"Test Cases which are passed/failed");
		sa.assertAll();
		
		
		
	
	}
	
}

