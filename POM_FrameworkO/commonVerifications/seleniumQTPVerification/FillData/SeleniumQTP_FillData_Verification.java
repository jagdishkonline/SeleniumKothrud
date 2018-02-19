package seleniumQTPVerification.FillData;

import org.openqa.selenium.WebDriver;

public class SeleniumQTP_FillData_Verification {
	WebDriver driver= null;
	public SeleniumQTP_FillData_Verification(WebDriver driver)
	{
		this.driver = driver;
		
	}
	public String verifyTitle()
	{
		return driver.getTitle();
		
	}
}
