package seleniumQTP_Verifications;

import org.openqa.selenium.WebDriver;

import seleniumQTP_Actions.SeleniumQTP_RegistrationPage3_Action;

public class SeleniumQTP_RegistrationPage3_Verification {
WebDriver driver = null;
	SeleniumQTP_RegistrationPage3_Action regP3A = null; //creating instance Globally

	public SeleniumQTP_RegistrationPage3_Verification(WebDriver driver) {

		this.driver = driver;
		regP3A = new SeleniumQTP_RegistrationPage3_Action(driver);//we assigned this in constructor
	}

	public String verifyTitle() {
		return driver.getTitle();
	}
	public void verifyAddress(String address)
	{
		regP3A.enterAddress(address);
	}
	public void verifyCity(String city)
	{
		regP3A.enterCity(city);
	}
		public void verifyPinCode(String pincode)
	{
		regP3A.enterPinCode(pincode);
	}
		@SuppressWarnings("null")
		public SeleniumQTP_RegistrationPage3_Verification  verifyRegPage3DataEntered(String address, String city, String pincode)//we are returning here SeleniumQTP_RegistrationPage2_Verification class
		{
			
			try{
			verifyAddress(address);
			verifyCity(city);
			verifyPinCode(pincode);
				
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			return null;
			
			
			
		}
}
