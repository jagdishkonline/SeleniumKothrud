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
	public void verifyDateofBirth(String birthday)
	{
		regP2A.getdateOfBirth(birthday);
	}
	public void verifyDateofBirthM(String birthdayM)
	{
		regP2A.getdateOfBirthM(birthdayM);
	}
	public void verifyDateofBirthY(String birthdayY)
	{
		regP2A.getdateOfBirthY(birthdayY);
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
	public void verifyGender()
	{
		regP2A.clickGender();
	}
	public void verifyEnterPage2Details(String firstName, String lastName,String birthday,String birthdayM,String birthdayY,String emailId,String mobileNumber)
	{
		verifyFirstNameEntered(firstName);
		verifyLastNameEntered(lastName);
		verifyDateofBirth(birthday);
		verifyDateofBirthM(birthdayM);
		verifyDateofBirthY(birthdayY);
		verifyEmailId(emailId);
		verifyMobileNumberEntered(mobileNumber);
		verifyGender();
		verifyNextClicked();
		
	}

	
}
