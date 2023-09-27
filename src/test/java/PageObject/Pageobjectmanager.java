package PageObject;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager 
{
	
	public WebDriver driver;
	public Login_obj login_page;
	public AddCustomer_obj Addcust;

	public Pageobjectmanager(WebDriver driver)
	{
		this.driver=driver; 
	}
	
	public  Login_obj LoginPage()
	{
		login_page=new Login_obj(driver);
		return login_page;
	}
	
	public AddCustomer_obj  customerpage()
	{
		Addcust=new  AddCustomer_obj(driver);
				return Addcust;
	}
}
