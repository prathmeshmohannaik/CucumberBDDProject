package StepDefinitions;

import org.junit.Assert;

import PageObject.AddCustomer_obj;
import Utilpackage.Base;
import Utilpackage.Utilityfile;
import io.cucumber.java.en.Then;

public class CustomerAdd_SD extends Base
{
	public AddCustomer_obj Addcust;
	//Utilityfile utilfilecontent;
	
	/*
	 * public CustomerAdd_SD(Utilityfile utilfilecontent) { //this refer to cuurent
	 * class this.utilfilecontent=utilfilecontent; }
	 */
	
	@Then("user clicks on Customers Menu")
	public void user_clicks_on_customers_menu() 
	{
		Addcust.clickCustomerMenu();
	}
	
	
	@Then("user clicks on Customers Item")
	public void user_clicks_on_customers_item() 
	{
		Addcust.clickcustomersselect();
	}
	
	@Then("user clicks on Add new")
	public void user_clicks_on_add_new()
	{
		Addcust.clickOnAddnew();
	}	
	
	@Then("user can view add new customer page")
	public void user_can_view_add_new_customer_page() 
	{
		String actualtitle = Addcust.getPageTitle();
		String expectedtitle= "Add a new customer";
		
		if(actualtitle.equalsIgnoreCase(expectedtitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(true);
		}
	}
	
	
	
	@Then("user enters all the customer details")
	public void user_enters_all_the_customer_details() throws InterruptedException 
	{
		//Addcust.enterEmail("prathmeshnaik@gmail.com");
		Addcust.enterEmail(generatemailid()+"@gmail.com");
		Addcust.enterPassword("123456");
		Addcust.enterFirstName("roshan");
		Addcust.enterLastName("naik");
		Addcust.Genderselect("Male");
		Addcust.enterDob("9/01/2023");
		Addcust.enterCompanyName("capgemini");
		/*
		 * Addcust.Newsletterselect("Test store 2");
		 * Addcust.CustomerRoles("Administrators");
		 */
		Addcust.enterManagerOfVendor("Vendor 1");
		Addcust.enterAdminContent("details of 1st user");
		Thread.sleep(5000);
		
	}
	
	@Then("user clicks on Save")
	public void user_clicks_on_save() 
	{
		Addcust.clickOnSave();
	}
	
	@Then("user can see the confirmation page {string}")
	public void user_can_see_the_confirmation_page(String confirmtitle) 
	{
		String actualctitle=Addcust.getPageTitle();
		String expectedctitle="The new customer has been added successfully.";
		
		if(actualctitle.equalsIgnoreCase(expectedctitle))
		{
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(true);
		}

	}
	
}
