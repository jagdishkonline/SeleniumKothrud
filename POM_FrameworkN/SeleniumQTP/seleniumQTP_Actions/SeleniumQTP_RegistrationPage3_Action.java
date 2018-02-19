package seleniumQTP_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonFunctions.WebTextBox;
import seleniumQTP_Locators.SeleniumQTP_RegistrationPage3_Locators;

public class SeleniumQTP_RegistrationPage3_Action {
	WebDriver driver=null;
	WebElement ele = null;
	public SeleniumQTP_RegistrationPage3_Action(WebDriver driver) {
		// TODO Auto-generated constructor stub
		
		this.driver= driver;
	}
	public void enterAddress(String address)
	{
		SeleniumQTP_RegistrationPage3_Locators reg3PL= new SeleniumQTP_RegistrationPage3_Locators(driver);//creating instatce of locatoe class
		ele = reg3PL.getAddress();
		if(ele!=null)
		{
			WebTextBox.sendInput(ele, address);
		}
	}
	public void enterCity(String city)
	{
		SeleniumQTP_RegistrationPage3_Locators reg3PL= new SeleniumQTP_RegistrationPage3_Locators(driver);//creating instatce of locatoe class
		ele = reg3PL.getCity();
		if(ele!=null)
		{
			WebTextBox.sendInput(ele, city);
		}
	}
	public void enterPinCode(String pincode)
	{
		SeleniumQTP_RegistrationPage3_Locators reg3PL= new SeleniumQTP_RegistrationPage3_Locators(driver);//creating instatce of locatoe class
		ele = reg3PL.getPinCode();
		if(ele!=null)
		{
			WebTextBox.sendInput(ele, pincode);
		}
	}
	

}
