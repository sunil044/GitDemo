package Academy;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

import PageObject.SignupPage;
import Resources.BrowserINIT;

public class Homepage extends BrowserINIT{
	private static Logger Log = (Logger) LogManager.getLogger(Homepage.class.getName());
	@BeforeTest
	public void INIT() throws IOException
	{
		driver = INITBrowser();
		driver.get(prop.getProperty("url"));
		Log.info("enterer URL");
		
	}
	
	@Test(dataProvider="getdata")
	public void basepagenevigation(String name,String lastname) throws IOException
	{
		SignupPage hp = new SignupPage(driver);
		hp.name().sendKeys(name);
		hp.lastname().sendKeys(lastname);
	}
	
	@DataProvider
	public Object[][] getdata()
	{
		Object[][] data = new Object[2][2];
		
		data[0][0]="sunil";
		data[0][1]="raddi";
		
		data[1][0]="shivani";
		data[1][1]="sunil";
		
		return data;
	}
	
	@AfterTest
	public void clse()
	{
		driver.close();
	}
	

}
