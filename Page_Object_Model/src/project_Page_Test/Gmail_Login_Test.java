package project_Page_Test;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import project_Page_Action.Gmail_Home_Page_Action;
import project_Page_Action.Gmail_Login_Page_Action;

public class Gmail_Login_Test {
	private WebDriver driver;
	public String baseUrl = "https://www.gmail.com";
	private Logger logger;
	private StringBuffer verificationErrors = new StringBuffer();
	
	
	@BeforeMethod
	public void setUp() throws Exception {
		// Here we need to create logger instance so we need to pass Class name for 
		logger=Logger.getLogger("MUI_Login_Test");
		
		// configure log4j properties file
		PropertyConfigurator.configure("Log4j.properties");
		
		
	}
	
    @Test(description="Performs a successful login and checks whether the Home page is opened")
	public void testSuccessfulLogin(){
			
		driver = new FirefoxDriver();
		Gmail_Login_Page_Action loginPA = new Gmail_Login_Page_Action(this.driver, logger);
		Gmail_Home_Page_Action homePA = loginPA.correctLogin(
				baseUrl, "automationlearned", "AutomationSkip");
		Assert.assertEquals(homePA.isAt(), true);
	}
	
	@AfterMethod
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			Assert.fail(verificationErrorString);
		}
	}
}
