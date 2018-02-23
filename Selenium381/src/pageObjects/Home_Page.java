package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_Page {
	
	WebDriver driver;

	@FindBy(id = "account_icon")
	static WebElement by_account_icon;
	
	
	@FindBy(id = "account_logout")
	static WebElement logoutEle;

	public Home_Page(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	/*
	 * Home_Page(WebDriver driver){ this.driver=driver; }
	 */
	private static WebElement element = null;

	// Driver is being passed as an Argument so that Selenium is able to locate
	// the element on the browser (driver).

	// Element is returned, so that an Action can be performed on it.

	// Method is declared as Public Static, so that it can be called in any
	// other method without instantiate the class.

	/*public static WebElement lnk_MyAccount(WebDriver driver) {
		element = driver.findElement(by_account_icon);
		return element;
	}*/

	public static String pageTitle(WebDriver driver) {
		String title = driver.getTitle();
		return title;
	}

	// setting of all test boxes

	public static WebElement lnk_LogOut(WebDriver driver) {
		return logoutEle;
	}

	public boolean varifyTitle(WebDriver driver) {
		if (pageTitle(driver).equals("Login")) {
			return true;
		}
		return false;
	}

	public static WebElement lnk_MyAccount(WebDriver driver2) {
		// TODO Auto-generated method stub
		return null;
	}

}
