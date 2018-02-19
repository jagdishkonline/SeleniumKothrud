package seleniumQTP_Tests;

import org.testng.annotations.Test;

import commonFunctions.BaseClass;
import seleniumQTP_Verifications.SeleniumQTP_RegistrationPage1_Verification;

public class SeleniumQTP_RegistrationPage1_Test extends BaseClass{
  @Test
  public void succefullyNavigatePage1() {
	  SeleniumQTP_RegistrationPage1_Verification regPV = new SeleniumQTP_RegistrationPage1_Verification(driver);
	  regPV.verifyRegPage1DataEntered("jagdish", "jack", "jack");
  }
}
