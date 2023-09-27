package Utilpackage;

import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObject.AddCustomer_obj;
import PageObject.Login_obj;
import PageObject.Searchcustomerpage;

public class Base 
{
	
	Utilityfile utilfilecontent;
	//generate random email id
	public String generatemailid()
	{
		return (RandomStringUtils.randomAlphabetic(8));
	}


}
