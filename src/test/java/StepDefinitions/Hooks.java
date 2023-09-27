package StepDefinitions;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks
{
	WebDriver driver;
	
	@Before
	//@after
	public void Set_up()
	{
		System.out.println("*********before scenario************");
	}
	
	/*
	 * @AfterStep public void takefailedscreenshot(Scenario scenario) {
	 * if(scenario.isFailed()) { System.out.println("screenshot"); File
	 * src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); byte[]
	 * filecontent; try { filecontent = FileUtils.readFileToByteArray(src); } catch
	 * (IOException e) { // TODO Auto-generated catch block e.printStackTrace(); }
	 * 
	 * scenario.attach(filecontent, "image/png", "image"); }
	 * 
	 * }
	 */
}
