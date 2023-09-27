package PageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchcustomerpage 
{
	public WebDriver ldriver;
	
	 public Searchcustomerpage(WebDriver rdriver) { ldriver=rdriver;
	 PageFactory.initElements(rdriver, this); }
	 
	
	@FindBy(id= "Email")
	WebElement email;
	
	@FindBy(id= "Password")
	WebElement password;
	
	@FindBy(xpath= "//button[@type='submit']")
	WebElement Loginbutton;
	
	@FindBy(xpath="//a[@href='#']//p[contains(text(),'Customers')]")
	WebElement Customermenu;
	
	@FindBy(xpath="//a[@href='/Admin/Customer/List']")
	WebElement Customersselect;
	
	@FindBy(name="SearchEmail")
	WebElement searchemailadd;
	
	@FindBy(id="search-customers")
	WebElement  searchcustomerbtn;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-striped dataTable no-footer']")
	WebElement searchresult;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-striped dataTable no-footer']//tbody//tr")
	List<WebElement> rowtabledata;
	
	@FindBy(xpath="//table[@class='table table-bordered table-hover table-striped dataTable no-footer']//tbody//tr[1]//th")
	List<WebElement> coltabledata;
	
	public void SearchEmailCustomer(String value)
	{
		searchemailadd.sendKeys(value);
	}
	
	public void Clicksearchbtn()
	{
		searchcustomerbtn.click();
	}
	
	public boolean searchcustomerbyemail(String searchemail)
	{
		boolean b= false;
		int rowcount=rowtabledata.size();
		int colcount=coltabledata.size();
		
		for(int i=1;i<=rowcount;i++)//to iterate all the rows of the grid
		{
			System.out.println("Searching row:" +i );

			WebElement webElementEmail = ldriver.findElement(By.xpath("//table[@id='customers-grid']//tbody/tr[" + i  + "]/td[2]"));
			String actualEmailAdd = webElementEmail.getText();
			System.out.println(actualEmailAdd);

			if(actualEmailAdd.equals(email))
			{
				b=true;
			}


		}

		return b;
		
	}
	
	
	
	
}
