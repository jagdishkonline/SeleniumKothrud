package seleniumQTP_Verifications;

import org.openqa.selenium.WebDriver;

import seleniumQTP_Actions.SeleniumQTP_RegistrationPage1_Action;
import seleniumQTP_Actions.SeleniumQTP_RegistrationPage2_Action;

public class SeleniumQTP_RegistrationPage2_Verification {

	WebDriver driver = null;
	
	SeleniumQTP_RegistrationPage2_Action regP2A = null; //creating instance Globally

	public SeleniumQTP_RegistrationPage2_Verification(WebDriver driver) {

		this.driver = driver;
		regP2A = new SeleniumQTP_RegistrationPage2_Action(driver);//we assigned this in constructor
	}

	public String verifyTitle() {
		return driver.getTitle();
	}
	public void verifyFirstNameEntered(String firstName)
	{
		regP2A.enterFirstName(firstName);
	}
	public void verifyLastNameEntered(String lastname)
	{
		regP2A.enterLastName(lastname);
	}
	
	public void verifyEmailId(String emailId)
	{
		regP2A.enteremailId(emailId);
	}
	public void verifyMobileNumberEntered(String mobilenumber)
	{
		regP2A.enterMobileNumber(mobilenumber);
	}
	public void verifyNextClicked()
	{
		regP2A.clickNextButton();
	}
	public void verifyEnterPage2Details(String firstName, String lastName,String emailId,String mobileNumber)
	{
		verifyFirstNameEntered(firstName);
		verifyLastNameEntered(lastName);
		verifyEmailId(emailId);
		verifyMobileNumberEntered(mobileNumber);
		verifyNextClicked();
		
	}

	/*public void verifyEnterPage2Details(String string) {
		// TODO Auto-generated method stub
		
	}*/
}
