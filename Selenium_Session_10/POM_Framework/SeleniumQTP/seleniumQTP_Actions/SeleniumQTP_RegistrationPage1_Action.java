package seleniumQTP_Actions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import commonFunctions.WebButton;
import commonFunctions.WebTextBox;
import seleniumQTP_Locators.SeleniumQTP_RegistrationPage1_Locators;

public class SeleniumQTP_RegistrationPage1_Action {
	WebDriver driver  = null;
	WebElement ele = null;
	public SeleniumQTP_RegistrationPage1_Action(WebDriver driver) {
		this.driver = driver;
	}
	
	public void enterUserName(String user){
		SeleniumQTP_RegistrationPage1_Locators reg1PL =
				new SeleniumQTP_RegistrationPage1_Locators(driver);
		ele = reg1PL.getUserName();
		if(ele!=null){
			WebTextBox.sendInput(ele, user);
		}
	}
	
	public void enterPassword(String pass){
		SeleniumQTP_RegistrationPage1_Locators reg1PL =
				new SeleniumQTP_RegistrationPage1_Locators(driver);
		ele = reg1PL.getPassword();
		if(ele!=null){
			WebTextBox.sendInput(ele, pass);
		}
	}
	
	public void enterConfirmPass(String confPass){
		SeleniumQTP_RegistrationPage1_Locators reg1PL =
				new SeleniumQTP_RegistrationPage1_Locators(driver);
		ele = reg1PL.getConfPassword();
		if(ele!=null){
			WebTextBox.sendInput(ele, confPass);
		}
	}
	
	public void clickSubmit(){
		SeleniumQTP_RegistrationPage1_Locators reg1PL =
				new SeleniumQTP_RegistrationPage1_Locators(driver);
		ele = reg1PL.getSubmit();
		if(ele!=null){
			WebButton.click(ele);
		}
	}
}
