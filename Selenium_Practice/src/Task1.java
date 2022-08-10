import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Task1
{

	@FindBy (xpath = "//div[text() = 'Email or phone']")
		private WebElement email   ;
	
	
	public Task1 (WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
		
		
	}
	
	
	public void email()
	{
		
		email.sendKeys();
	}
}
