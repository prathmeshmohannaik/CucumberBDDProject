package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_obj
{
	 public WebDriver ldriver;

	 //initialize the webdriver 
	 
	 public Login_obj(WebDriver rdriver) 
	 {
	 ldriver=rdriver; 
	 PageFactory.initElements(rdriver, this); 
	 }

	
	//identify locators - webelements on login page
	@FindBy(id= "Email")
	WebElement email;
	
	@FindBy(id= "Password")
	WebElement password;
	
	@FindBy(xpath= "//button[@type='submit']")
	WebElement Loginbutton;
	
	//Actions methods for each elements located
	public void enterEmail(String emailAdd)
	{
		email.clear();
		email.sendKeys(emailAdd);
	}
	
	public void enterPassword(String passAdd)
	{
		password.clear(); 
		password.sendKeys(passAdd);
	}
	
	public void clickbutton()
	{
		Loginbutton.click();
	}
	
	
}
