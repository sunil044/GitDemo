package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignupPage { 
	public WebDriver driver;
	@FindBy(name="firstname")
	WebElement name;
	
	@FindBy(name="lastname")
	WebElement lastname;
	
	@FindBy(css="div[class='mbs _52lq fsl fwb fcb']")
	WebElement title;
	
	@FindBy(name="websubmit")
	WebElement signup;	

	public SignupPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement name()
	{
		return name;
	}
	
	public WebElement lastname()
	{
		return lastname;
	}
	
	public WebElement title()
	{
		return title;
	}
	
	public WebElement signup()
	{
		return signup;
	}
}
