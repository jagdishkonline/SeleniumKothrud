package pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

// Import package pageObject.*

import pageObjects.Home_Page;

import pageObjects.LogIn_Page;

public class PageObjectModelTestCases{
	
	private static WebDriver driver = null;

	public static void main(String[] args) {
		
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://javabykiran.com/jbksel");
		
		Home_Page.lnk_MyAccount(driver).click();

		LogIn_Page.txtbx_UserName(driver).sendKeys("testuser_1");

		LogIn_Page.txtbx_Password(driver).sendKeys("Test@123");

		WebDriverWait wait=new WebDriverWait(driver, 10);
		
		WebElement element=wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("login"))));
		
		element.click();
		
		//LogIn_Page.btn_LogIn(driver).click();

		System.out.println(" Login Successfully, now it is the time to Log Off buddy.");

		Home_Page.lnk_LogOut(driver).click(); 

		driver.quit();
		
	}
	
}




