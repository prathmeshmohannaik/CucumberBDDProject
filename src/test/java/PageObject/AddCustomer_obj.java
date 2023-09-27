package PageObject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCustomer_obj
{
	public WebDriver ldriver;
	
	 public AddCustomer_obj(WebDriver rdriver) 
	 { 
		 ldriver=rdriver;
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
	
	@FindBy(xpath = "//a[@class='btn btn-primary']")	 
	WebElement btnAddnew;


	@FindBy(xpath = "//input[@id='Email']")
	WebElement txtEmail;


	@FindBy(xpath = "//input[@id='Password']")
	WebElement txtPassword;

	@FindBy(xpath = "//input[@id='FirstName']")
	WebElement txtFirstName;


	@FindBy(xpath = "//input[@id='LastName']")
	WebElement txtLastName;
	
	@FindBy(id = "Gender_Male")
	WebElement MaleGender;


	@FindBy(id = "Gender_Female")
	WebElement FeMaleGender;


	@FindBy(xpath = "//input[@id='DateOfBirth']")
	WebElement txtDob;
	
	@FindBy(xpath = "//input[@id='Company']")
	WebElement txtCompanyName;
	
	@FindBy(css="#SelectedNewsletterSubscriptionStoreIds")
	WebElement newsletter;
	
	@FindBy(xpath="//li//span[text()='Test store 2']")
	WebElement listitemnewsletter;
	
	@FindBy(id = "SelectedCustomerRoleIds")
	WebElement txtCustomerRoles;
	
	@FindBy(xpath = "//li[contains(text(),'Administrators')]")
	WebElement listItemAdministrators;
	
	@FindBy(xpath = "//*[@id='VendorId']")
	WebElement dropdownVendorMgr;
	
	@FindBy(xpath="//option[contains(text(),'Vendor 1')]")
	WebElement listitemvendormgr;
	
	@FindBy(id="AdminComment")
	WebElement admincomment;

	@FindBy(xpath = "//button[@name='save']")
	WebElement btnSave;

	//*************************************************************************************************************
	public String getPageTitle()
	{
		return ldriver.getTitle();
	}

	
	public void clickCustomerMenu()
	{
		Customermenu.click();
	}
	
	public void clickcustomersselect()
	{
		Customersselect.click();
	}
	
	public void clickOnAddnew() {
		btnAddnew.click();
	}


	public void enterEmail(String email)
	{
		txtEmail.clear();
		txtEmail.sendKeys(email);
	}

	public void enterPassword(String password)
	{
		txtPassword.clear();
		txtPassword.sendKeys(password);
	}
	public void enterFirstName(String firstName)
	{
		txtFirstName.sendKeys(firstName);
	}

	public void enterLastName(String lastName)
	{
		txtLastName.sendKeys(lastName);
	}
	
	public void Genderselect(String gender)
	{
		if(gender.equalsIgnoreCase("Male"))
		{
			MaleGender.click();
		}
		else
		{
			FeMaleGender.click();
		}
	}
	
	
	public void enterDob(String dob)
	{
		txtDob.sendKeys(dob);
	}

	public void enterCompanyName(String coName)
	{
		txtCompanyName.sendKeys(coName);
	}
	
	
	/*
	 * public void Newsletterselect(String value) {
	 * 
	 * 
	 * Select sc=new Select(newsletter);
	 * 
	 * WebDriver driver=new ChromeDriver(); WebDriverWait wait = new
	 * WebDriverWait(driver, Duration.ofSeconds(10));
	 * wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(
	 * "#ee7fc934-2922-4b10-b065-7ad223a953fd"))); sc.selectByVisibleText(value); }
	 * 
	 * 
	 * public void CustomerRoles(String value) { Select sc=new
	 * Select(txtCustomerRoles); sc.selectByVisibleText(value); }
	 */
	
	public void enterManagerOfVendor(String value)
	{
		Select drp=new Select(dropdownVendorMgr);
		drp.selectByVisibleText(value);
	}
	
	public void enterAdminContent(String content)
	{
		admincomment.sendKeys(content);
	}
	
	public void clickOnSave()
	{
		btnSave.click();
	}
}
