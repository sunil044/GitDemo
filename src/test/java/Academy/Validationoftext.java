package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import PageObject.SignupPage;
import Resources.BrowserINIT;


public class Validationoftext extends BrowserINIT{
	private static Logger Log = (Logger) LogManager.getLogger(Validationoftext.class.getName());
	@BeforeTest
	public void INIT() throws IOException
	{
		driver = INITBrowser();
		driver.get(prop.getProperty("url"));
		
	}
	
	@Test
	public void basepagenevigation() throws IOException
	{
		
		SignupPage hp = new SignupPage(driver);
		hp.title().getText();
		Assert.assertEquals(hp.title().getText(), "Create a new account123");
		Log.error("text is wrong");
	}
	
	
	@AfterTest
	public void clse()
	{
		driver.close();
	}

}
