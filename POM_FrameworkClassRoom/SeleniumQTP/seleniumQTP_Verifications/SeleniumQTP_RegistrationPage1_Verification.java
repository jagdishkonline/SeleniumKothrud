package seleniumQTP_Verifications;

import org.openqa.selenium.WebDriver;

import seleniumQTP_Actions.SeleniumQTP_RegistrationPage1_Action;

public class SeleniumQTP_RegistrationPage1_Verification {
WebDriver driver= null;
SeleniumQTP_RegistrationPage1_Action regPA=null;//defined globally


public SeleniumQTP_RegistrationPage1_Verification(WebDriver driver)
{
	this.driver=driver;
	regPA = new SeleniumQTP_RegistrationPage1_Action(driver);
}
public void verifyUserEntered(String user)
{
	regPA.enterUserName(user);
}
public void verifyPasswordEntered(String pass)
{
	regPA.enterPassword(pass);
}
public void verifyConfPasswordEntered(String confPass)
{
	regPA.enterConfPassword(confPass);
}
public void verifySubmitClicked()
{
	regPA.clickSubmit();
}
public SeleniumQTP_RegistrationPage2_Verification verifyRegPage1DataEntered(String user, String pass, String confPass)//we are returning here SeleniumQTP_RegistrationPage2_Verification class
{
	SeleniumQTP_RegistrationPage2_Verification regP2 = null;
	try {
		verifyUserEntered(user);
		verifyPasswordEntered(pass);
		verifyConfPasswordEntered(confPass);
		verifySubmitClicked();
		regP2 = new SeleniumQTP_RegistrationPage2_Verification(driver);
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return regP2;
}
}
