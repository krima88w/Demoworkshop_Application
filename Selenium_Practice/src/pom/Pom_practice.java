package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom_practice 
{

	@FindBy(id= "FirstName")
	private WebElement First_name;

	@FindBy(id= "LastName")
	private WebElement Last_name;


	@FindBy(id= "Email")
	private WebElement Emaill;
	
	@FindBy(id= "Password")
	private WebElement password;


	@FindBy(id= "ConfirmPassword")
	private WebElement confirmpass;



	public WebElement getPassword() {
		return password;
	}


	public WebElement getConfirmpass() {
		return confirmpass;
	}


	public Pom_practice (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}


	public WebElement getFirst_name() {
		return First_name;
	}


	public WebElement getLast_name() {
		return Last_name;
	}


	public WebElement getEmaill() {
		return Emaill;
	}








}
