package seleniumQTP_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumQTP_RegistrationPage3_Locators {
	WebDriver driver=null;
	public SeleniumQTP_RegistrationPage3_Locators(WebDriver driver)// creating constructor
	{
		this.driver= driver;
		PageFactory.initElements(this.driver, this);//very imp line  for initializing locators........
	}
	
	
	@FindBy(name="Address")
	private WebElement address;
	public WebElement getAddress()
	{
		return address;
		
	}
	@FindBy(name="City")
	private WebElement city;
	public WebElement getCity()
	{
		return city;
		
	}
	@FindBy(name="Pin_Code")
	private WebElement pincode;
	public WebElement getPinCode()
	{
		return pincode;
		
	}
	
	
	
}
