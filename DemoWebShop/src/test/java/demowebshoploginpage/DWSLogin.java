package demowebshoploginpage;

import org.testng.annotations.Test;

import genericUtilities.BaseClass;
import objectRepository.Demoworkshoplogin;

public class DWSLogin extends BaseClass {

	@Test
	public void logintestcase() throws InterruptedException{
		
		Demoworkshoplogin log = new Demoworkshoplogin(driver);
		
		log.getLogin().click();
		log.getEmail().sendKeys("manju29kri@gmail.com");
		log.getPassword().sendKeys("Chaturvi@713");
		log.getLoginButton().click();
		driver.close();
				
		


	}



	}

