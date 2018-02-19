package seleniumQTPAction.Register;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonWebElements.WebTextBox;
import seleniumQTPLocators.Register.SeleniumQTP_Register_Locators;


public class SeleniumQTP_Register_Actions {
	
	WebDriver driver= null;
	public SeleniumQTP_Register_Actions(WebDriver driver)
	{
		this.driver = driver;
		
	}
	public void enterUserName(String user)
	{
		SeleniumQTP_Register_Locators registerPL = new SeleniumQTP_Register_Locators(driver);
		WebElement ele = registerPL.getUserName();
		if(ele != null)
		{
			WebTextBox.sendInput(ele, user);
		}
		else
		{
			System.out.println("User Name is Not Present");
		}
	}
	public void enterPassword(String password)
	{
		SeleniumQTP_Register_Locators registerPL = new SeleniumQTP_Register_Locators(driver);
		WebElement ele = registerPL.getPassword();
		if(ele != null)
		{
			WebTextBox.sendInput(ele, password);
		}
		else
		{
			System.out.println("User Name is Not Present");
		}
	}
	public void enterConfPassword(String confPassword)
	{
		SeleniumQTP_Register_Locators registerPL = new SeleniumQTP_Register_Locators(driver);
		WebElement ele = registerPL.getconfirmPass();
		if(ele != null)
		{
			WebTextBox.sendInput(ele, confPassword);
		}
		else
		{
			System.out.println("User Name is Not Present");
		}
	}


}
