package pageObjects.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Home_Page;
import pageObjects.LogIn_Page;

public class TestCasesByTestNG {
	private static WebDriver driver = null;

	@BeforeClass
	public void openBrowser() {
		System.out.println("before class");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.javabykiran.com");
	}
	
	@Test
	public void test_Home_page(){
		
		LogIn_Page logIn_Page=new LogIn_Page(driver);
		logIn_Page.setTextForAnyTextBox(logIn_Page.txtbx_Password1(driver), "");
		logIn_Page.clickLoginButton(logIn_Page.txtbx_Password1(driver));
		
		Assert.assertEquals(logIn_Page.varifyPasswordError(driver), true); 
		
		
		logIn_Page.setTextForAnyTextBox(logIn_Page.txtbx_Password1(driver), "kiran");
		Home_Page home_Page=logIn_Page.clickLoginButton(logIn_Page.txtbx_Password1(driver));
	
		
	}
	
	
	
	
	

}

