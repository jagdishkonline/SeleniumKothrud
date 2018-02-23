package pageObjects;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogIn_Page {
	// webelement
	// ooperations

	private WebDriver driver;
	//private By passwd = By.id("password");
	private By passwordLabel = By.id("passwordLabel");
	private By passwordErrorLabel = By.id("passwordErrorLabel");
	
	@FindBy(id="password")
	private WebElement passwdEle;
	
	
	

	private WebElement element = null;

	public LogIn_Page(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}

	public WebElement txtbx_Password1(WebDriver driver) {
		//element = driver.findElement(passwd);
		return passwdEle;
	}

	public WebElement label_Password(WebDriver driver) {
		element = driver.findElement(passwordLabel);
		return element;
	}

	public void setTextForAnyTextBox(WebElement element, String text) {
		element.sendKeys(text);
	}

	public Home_Page clickLoginButton(WebElement element) {
		element.click();
		Home_Page hm = new Home_Page(driver);
		return hm;
	}

	public WebElement label_error_Password(WebDriver driver) {
		element = driver.findElement(passwordErrorLabel);
		return element;
	}

	public boolean varifyPasswordError(WebDriver driver) {
		return label_error_Password(driver).getText().equals("Your password is wrong");
	}

	/*
	 * public Forgot_Password__Page clickForgotButton(WebElement element ){
	 * element.click(); return new Forgot_Password__Page(driver); }
	 */

}








