package project_Page_Action;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import project_Page_Factory.Gmail_Login_Page_Factory;

public class Gmail_Login_Page_Action {
	public WebDriver driver;
	private Logger logger;
	private WebElement element;
	private String elementText;
	

	// Constructor

	public Gmail_Login_Page_Action(WebDriver driver, Logger logger) {

		this.driver = driver;

		this.logger = logger;
	}
	
	public void openBrowser(String BaseURL) {
		
		driver.get(BaseURL);
		
	}
	public String getEmail(String EmailID) {
		
		Gmail_Login_Page_Factory gmailLoginPF = new 
				Gmail_Login_Page_Factory(driver);
		
		element = gmailLoginPF.getEmailID();
		
		if(element!= null){
			commonFunction.WebInputTextBox.SendInputTextBox(
					driver, element, EmailID);
			logger.info("Get the Current Space Name");   
		}else{
			logger.info("Getting current Space Name is Failed");   
		}
		return elementText;
		
	}

	

	public Gmail_Home_Page_Action correctLogin(String BaseURL, 
			String EmailID, String incorrectpassword) {
		// TODO Auto-generated method stub
		openBrowser(BaseURL);
		getEmail(EmailID);
		return new Gmail_Home_Page_Action(driver);
	}
}
