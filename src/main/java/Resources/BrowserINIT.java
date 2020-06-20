package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserINIT {
	
	public WebDriver driver;
	public Properties prop;
	public WebDriver INITBrowser() throws IOException
	{
		prop = new Properties();
		FileInputStream fil = new FileInputStream("C:\\Users\\Prasad\\eclipse-workspace\\E2Eproject\\src\\main\\java\\Resources\\Browser.properties");
		prop.load(fil);
		String browserName = prop.getProperty("brower");
		
		if(browserName.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "//C:\\Users\\Prasad\\New folder\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gk.driver", "//C:\\Users\\Prasad\\New folder\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		
		else if(browserName.equalsIgnoreCase("IE"))
		{
			
		}
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
}
