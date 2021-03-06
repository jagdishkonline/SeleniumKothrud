package seleniumQTP_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.BaseClass;
import seleniumQTP_Verifications.SeleniumQTP_RegistrationPage1_Verification;
import seleniumQTP_Verifications.SeleniumQTP_RegistrationPage2_Verification;

public class SeleniumQTP_RegistrationPage1_Test extends BaseClass {
  @Test
  public void succefullyNavigatePage1() {
	  SeleniumQTP_RegistrationPage1_Verification regPV = new SeleniumQTP_RegistrationPage1_Verification(driver);
	//  driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
	  SeleniumQTP_RegistrationPage2_Verification regP2=  regPV.verifyRegPage1DataEntered("user", "pass", "confPass");//Imp Step we r returning here SeleniumQTP_RegistrationPage2_Verification
	 Assert.assertEquals("Reg2", regP2.verifyTitle());//we are verifying page2 Title
	 regP2.verifyEnterPage2Details("abc","xyz","abc@gmail.com","9762215699");
  
  
  }
}
