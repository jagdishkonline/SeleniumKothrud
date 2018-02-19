package seleniumQTPTest.seleniumQTPTest.Register;

import org.testng.annotations.Test;

import seleniumQTPVerification.Register.SeleniumQTP_Register_Verification;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class SeleniumQTP_Register_Test {
	public WebDriver driver;
  @Test
  public void registerTest() {
	  
	  SeleniumQTP_Register_Verification  registerV = new SeleniumQTP_Register_Verification(driver);
	  registerV.verifyRegisterSuccessfully("user", "pass", "confPass");
  }
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
