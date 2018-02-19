package seleniumQTPLocators.Register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumQTP_Register_Locators {

	WebDriver driver= null;
	public SeleniumQTP_Register_Locators(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(this.driver, this.getClass());//if this statements not here FindBy Element Will not Locate after FindBy we need to write this line
	}
	
	@FindBy(name="name")//Its annotation in Selenium API e.g its combination of webdriver
	private WebElement userName;
	
	public WebElement getUserName()
	{
		return userName;
	}
	@FindBy(name="password")//Its annotation in Selenium API e.g its combination of webdriver
	private WebElement password;
	
	public WebElement getPassword()
	{
		return getPassword();
	}
	@FindBy(name="confirmpassword")//Its annotation in Selenium API e.g its combination of webdriver
	private WebElement confirmPass;
	
	public WebElement getconfirmPass ()
	{
		return getconfirmPass();
	}
}
