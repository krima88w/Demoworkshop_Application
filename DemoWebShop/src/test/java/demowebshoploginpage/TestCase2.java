package demowebshoploginpage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotEquals;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import genericUtilities.UtilityClass;
import objectRepository.Registration;

public class TestCase2 extends BaseClass {
	@Test
	public void registration() throws IOException, InterruptedException{
		Registration login = new Registration(driver);
		UtilityClass  utility = new UtilityClass();
		driver.findElement(By.xpath("//a[text() = 'Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("gender-male")).click();
		login.getFirst_name().sendKeys("Firstname");
		Thread.sleep(3000);
		login.getLast_name().sendKeys("lastname");
		Thread.sleep(3000);
		login.getEmaill().sendKeys("Email");
		Thread.sleep(3000);
		login.getPassword().sendKeys("password");
		Thread.sleep(3000);
		login.getConfirmpass().sendKeys("confirm_password");
		Thread.sleep(3000);
		driver.findElement(By.id("register-button")).click();
		

		
		
		

	}

}