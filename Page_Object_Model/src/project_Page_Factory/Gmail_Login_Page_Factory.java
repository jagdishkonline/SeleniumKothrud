package project_Page_Factory;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Gmail_Login_Page_Factory {
	public WebDriver driver;

	// Constructor

	public Gmail_Login_Page_Factory(WebDriver driver) {

		this.driver = driver;

		// This initElements method will create all WebElements

		PageFactory.initElements(driver, this);

	}
	
	/**
	 * 
	 * All WebElements are identified by @FindBy and @FindAll annotation
	 * 
	 */
	
	
	@FindBy(id = "Email")
	WebElement emailID;

	public WebElement getEmailID() {
		return this.emailID;
	}
	
	@FindBy(id = "next")
	WebElement nextButton;

	public WebElement getNextButton() {
		return this.nextButton;
	}
	
	@FindBy(name = "Passwd")
	WebElement passwordID;

	public WebElement getPassword() {
		return this.passwordID;
	}
	
	@FindAll(@FindBy(how = How.NAME, using = "Passwd"))
	List<WebElement> leftMenuList;

	public List<WebElement> getLeftMenuList() {
		return this.leftMenuList;
	}

	@FindBy(how = How.ID, using = "signIn")
	WebElement signINButton;

	public WebElement getSignINButton() {
		return this.signINButton;
	}
}
