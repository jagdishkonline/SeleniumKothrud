package seleniumQTP_Verifications;

import org.openqa.selenium.WebDriver;

import seleniumQTP_Actions.SeleniumQTP_RegistrationPage1_Action;

public class SeleniumQTP_RegistrationPage1_Verification {
	WebDriver driver = null;
	SeleniumQTP_RegistrationPage1_Action regPA = null;
	
	public SeleniumQTP_RegistrationPage1_Verification(WebDriver driver) {
		this.driver = driver;
		regPA = new SeleniumQTP_RegistrationPage1_Action(this.driver);
	}
	
	public void verifyUserEntered(String user){
		regPA.enterUserName(user);
	}
	
	public void verifyPasswordEntered(String pass){
		regPA.enterPassword(pass);
	}
	
	public void verifyConfPassEntered(String confPass){
		regPA.enterConfirmPass(confPass);
	}
	
	public void verifyRegPage1DataEntered(String user, String pass,
			String confPass){
		verifyUserEntered(user);
		verifyPasswordEntered(pass);
		verifyConfPassEntered(confPass);
	}
}
