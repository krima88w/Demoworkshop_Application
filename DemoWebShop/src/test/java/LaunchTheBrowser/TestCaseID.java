package LaunchTheBrowser;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.Registration;

public class TestCaseID extends BaseClass {
	@Test

	public void testCaseDescription() throws InterruptedException {

		Registration loginElements  = new Registration(driver);
		driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("//a[text() = 'Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("gender-male")).click();
		loginElements.getFirst_name().sendKeys("manjunath");
		Thread.sleep(3000);
		loginElements.getLast_name().sendKeys("krishna");
		Thread.sleep(3000);
		loginElements.getEmaill().sendKeys("manju29kri@gmail.com");
		Thread.sleep(3000);
		loginElements.getPassword().sendKeys("12345");
		Thread.sleep(3000);
		loginElements.getConfirmpass().sendKeys("12345");
		Thread.sleep(3000);
		driver.findElement(By.id("register-button")).click();


	}


}
