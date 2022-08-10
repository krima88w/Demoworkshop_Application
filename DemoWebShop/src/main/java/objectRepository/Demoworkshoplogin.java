package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Demoworkshoplogin {

	@FindBy(className = "ico-login")
			private WebElement login;
	
	@FindBy(id  = "Email")
		private WebElement Email;
	
	@FindBy(id = "Password")
		private WebElement password;
	
	@FindBy(xpath = "//input[@value = 'Log in']")
		private WebElement loginButton;
	
	public Demoworkshoplogin(WebDriver Driver) {
		PageFactory.initElements(Driver,this);
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginButton() {
		return loginButton;
	}
	
	
	

}


