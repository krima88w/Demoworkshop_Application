package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task1 
{

	//Declaration
	@FindBy (xpath = "//a[text() = 'LOGIN']")
		private WebElement Login;
	
	@FindBy (id = "email")
		private WebElement email;
	
	@FindBy (id = "password")
		private WebElement pass;
	
	@FindBy (id = "last")
		private WebElement Login1;
	
	@FindBy (xpath = "//span[contains(text(), 'SkillRary Admin')]")
		private WebElement signoutclick;
	
	@FindBy (xpath = "//a[text() =  'Sign out']")
	private WebElement logout;
	
	//initialisation
	public Task1 (WebDriver driver)
	{
			PageFactory.initElements(driver,this);
			
	}
	
	//utilisation
	
	public void Login()
	{
		Login.click();
	}
	public void email()
	{
		email.sendKeys("admin");
	}
	
	public void pass()
	{
		pass.sendKeys("admin");
	}
	public void Login1()
	{
		Login1.click();
	}
	public void clicklogout()
	{
		signoutclick.click();	
	}		
	
	public void logout()
	{
		logout.click();
	}
}
	
	
	

