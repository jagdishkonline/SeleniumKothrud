package seleniumQTPVerification.Register;

import org.openqa.selenium.WebDriver;

import seleniumQTPAction.Register.SeleniumQTP_Register_Actions;

public class SeleniumQTP_Register_Verification {
	WebDriver driver= null;
	public SeleniumQTP_Register_Verification(WebDriver driver)
	{
		this.driver = driver;
		
	}
	public void verifyEnterUserName(String user)
	{
		SeleniumQTP_Register_Actions registerPA = new SeleniumQTP_Register_Actions(driver);
		registerPA.enterUserName(user);
	}
	public void verifyEnterPassword(String password)
	{
		SeleniumQTP_Register_Actions registerPA = new SeleniumQTP_Register_Actions(driver);
		registerPA.enterUserName(password);
	}
	public void verifyEnterconfPassword(String confPassword)
	{
		SeleniumQTP_Register_Actions registerPA = new SeleniumQTP_Register_Actions(driver);
		registerPA.enterUserName(confPassword);
	}
	public void verifyRegisterSuccessfully(String user, String pass , String confPass)
	{
		try
		{
			verifyEnterUserName(user);
			verifyEnterPassword(pass);
			verifyEnterconfPassword(confPass);
			
		}catch(Exception e){
			System.out.println("errors");
			
		}
	}
}
