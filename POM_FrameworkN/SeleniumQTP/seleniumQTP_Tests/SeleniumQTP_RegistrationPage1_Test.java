package seleniumQTP_Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import commonFunctions.BaseClass;
import seleniumQTP_Verifications.SeleniumQTP_RegistrationPage1_Verification;
import seleniumQTP_Verifications.SeleniumQTP_RegistrationPage2_Verification;
import seleniumQTP_Verifications.SeleniumQTP_RegistrationPage3_Verification;

public class SeleniumQTP_RegistrationPage1_Test extends BaseClass {
  @Test
  public void succefullyNavigatePage1() {
	  SeleniumQTP_RegistrationPage1_Verification regPV = new SeleniumQTP_RegistrationPage1_Verification(driver);
	//  driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
	   SeleniumQTP_RegistrationPage2_Verification regP2=  regPV.verifyRegPage1DataEntered("user", "pass", "confPass");//Imp Step we r returning here SeleniumQTP_RegistrationPage2_Verification
	 Assert.assertEquals("Reg2", regP2.verifyTitle());//we are verifying page2 Title
	 regP2.verifyEnterPage2Details("Jagdish","Kk","16","Jun","1988","jagdishkonline@gmail.com","9762215699");
	
	 SeleniumQTP_RegistrationPage3_Verification regP3 = new SeleniumQTP_RegistrationPage3_Verification(driver);
	 Assert.assertEquals("Reg3", regP3.verifyTitle());
	 regP3.verifyRegPage3DataEntered("Mantri", "Mumbai", "411012");

  }
}
