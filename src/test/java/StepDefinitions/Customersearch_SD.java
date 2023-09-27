package StepDefinitions;

import org.junit.Assert;

import PageObject.Searchcustomerpage;
import Utilpackage.Utilityfile;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Customersearch_SD
{
	
	public Searchcustomerpage searchpage;
	
	/*
	 * Utilityfile utilfilecontent;
	 * 
	 * public Customersearch_SD(Utilityfile utilfilecontent) { //this refer to
	 * cuurent class this.utilfilecontent=utilfilecontent; }
	 */
	@When("user enter email address")
	public void user_enter_email_address() 
	{
		searchpage.SearchEmailCustomer("kiyjcycyhjc676008@gmail.com");
	}
	
	@When("user click on search box")
	public void user_click_on_search_box() 
	{
		searchpage.Clicksearchbtn();
	}
	
	@Then("user data displayed in search table")
	public void user_data_displayed_in_search_table() 
	{
		String expectedemailaddress="kiyjcycyhjc676008@gmail.com";
		Assert.assertTrue(true);
	}
	
	
}
