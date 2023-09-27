package Runner;


import io.cucumber.testng.CucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
features={"src/test/resources/Features/Login.feature"},
glue={"StepDefinitions"},
monochrome= true,
tags="@LoginSuite",
//plugin={"pretty", "html:target/HtmlReports/report.html"}

 plugin={"html:target/cucumber.html",
 "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
 }
 
)



//@RunWith(Cucumber.class)

//import testng cucumber
//@CucumberOptions(features="src/test/resources/Features/SearchCustomer.feature",glue={"StepDefinitions"},
//or
//@CucumberOptions(features=".//Features/SearchCustomer.feature",glue={"StepDefinitions"},
//or
//plugin={"pretty", "html:target/HtmlReports/report.html"}
//tags="@logindemoL1"
//tags="@logindemoL1 and xyztag"
//tags="@logindemoL1 or xyztag"
//tags="not @DatadrivenTestDemo"
//monochrome is basically to get the proper format in console

//for json report
//plugin={"pretty", "json:target/JSONReports/report.json"}


public class TestRunner extends AbstractTestNGCucumberTests
{
	/*
	 * @Override
	 * 
	 * @DataProvider(parallel=true) public Object[][] scenarios() { return
	 * super.scenarios(); }
	 */
}