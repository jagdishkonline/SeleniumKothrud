package seleniumQTP_Locators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumQTP_RegistrationPage1_Locators {
	WebDriver driver = null;
	
	public SeleniumQTP_RegistrationPage1_Locators(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
	}
	
	@FindBy(name = "name")
	private WebElement userName;
	
	public WebElement getUserName(){
		return userName;
	}
	
	@FindBy(name = "password")
	private WebElement password;
	
	public WebElement getPassword(){
		return password;
	}
	
	@FindBy(name = "confirmpassword")
	private WebElement confPassword;
	
	public WebElement getConfPassword(){
		return confPassword;
	}
	
	@FindBy(name = "insert")
	private WebElement submit;
	
	public WebElement getSubmit(){
		return submit;
	}
}
