package seleniumQTP_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonFunctions.WebButton;
import commonFunctions.WebTextBox;
import seleniumQTP_Locators.SeleniumQTP_RegistrationPage1_Locators;
import seleniumQTP_Locators.SeleniumQTP_RegistrationPage2_Locators;

public class SeleniumQTP_RegistrationPage2_Action {
	
	WebDriver driver=null;
	WebElement ele = null;
	public SeleniumQTP_RegistrationPage2_Action(WebDriver driver)
	{
		this.driver= driver;
	}
	public void enterFirstName(String firstname)
	{
		SeleniumQTP_RegistrationPage2_Locators reg2PL= new SeleniumQTP_RegistrationPage2_Locators(driver);//creating instatce of locatoe class
		ele = reg2PL.getFirstName();
		if(ele!=null)
		{
			WebTextBox.sendInput(ele, firstname);
		}
	}
	
	public void enterLastName(String lastname)
	{
		SeleniumQTP_RegistrationPage2_Locators reg2PL= new SeleniumQTP_RegistrationPage2_Locators(driver);//creating instatce of locatoe class
		ele = reg2PL.getLastName();
		if(ele!=null)
		{
			WebTextBox.sendInput(ele, lastname);
		}
	}
	public void enteremailId(String emailId)
	{
		SeleniumQTP_RegistrationPage2_Locators reg2PL= new SeleniumQTP_RegistrationPage2_Locators(driver);//creating instatce of locatoe class
		ele = reg2PL.getemailId();
		if(ele!=null)
		{
			WebTextBox.sendInput(ele, emailId);
		}
	}
	public void enterMobileNumber(String mobilenumber)
	{
		SeleniumQTP_RegistrationPage2_Locators reg2PL= new SeleniumQTP_RegistrationPage2_Locators(driver);//creating instatce of locatoe class
		ele = reg2PL.getMobileNumber();
		if(ele!=null)
		{
			WebTextBox.sendInput(ele, mobilenumber);
		}
	}
	public void clickNextButton()
	{
		SeleniumQTP_RegistrationPage2_Locators reg2PL= new SeleniumQTP_RegistrationPage2_Locators(driver);//creating instatce of locatoe class
		ele = reg2PL.getNextButton();
		if(ele!=null)
		{
			WebButton.click(ele);
		}
	}
	
	
}
