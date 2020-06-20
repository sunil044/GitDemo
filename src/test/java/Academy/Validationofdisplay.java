package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import PageObject.SignupPage;
import Resources.BrowserINIT;

public class Validationofdisplay extends BrowserINIT{
	private static Logger Log = (Logger) LogManager.getLogger(Validationofdisplay.class.getName());
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
		Assert.assertTrue(hp.signup().isDisplayed());
		Log.error("text is displayed");
		
	}
	
	@AfterTest
	public void clse()
	{
		driver.close();
	}
	
	

}
