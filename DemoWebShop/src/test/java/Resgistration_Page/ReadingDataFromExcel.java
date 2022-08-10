package Resgistration_Page;
import static org.testng.Assert.fail;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericUtilities.BaseClass;
import objectRepository.Registration;

public class ReadingDataFromExcel extends BaseClass {
	@Test(dataProvider = "test data", dataProviderClass = ReadExcel.class)
	public void readingData(String first_name, String Last_name, String email, String password, String confirm_pass) throws InterruptedException {
		driver.findElement(By.xpath("//a[text() = 'Register']")).click();
		driver.findElement(By.id("gender-male")).click();
		Registration reg = new Registration(driver);
		reg.getFirst_name().sendKeys(first_name);
		reg.getLast_name().sendKeys(Last_name);
		reg.getEmaill().sendKeys(email);
		reg.getPassword().sendKeys(password);
		reg.getConfirmpass().sendKeys(confirm_pass);
		driver.findElement(By.xpath("//input[@value = 'Register']")).click();
		String actualTitle  = driver.getTitle();
		String expectedTitle = "Demo Web Shop";
		SoftAssert sa = new SoftAssert();
		sa.assertEquals(actualTitle, expectedTitle,"TestCaseswhich are failed");
		sa.assertAll();
		
		
		
	}
}
