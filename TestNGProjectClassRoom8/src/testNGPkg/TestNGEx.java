package testNGPkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGEx {
	//WebDriver driver=null;
	WebDriver driver= new FirefoxDriver();
	String URL ="https://seleniumqtpautomation.000webhostapp.com/final.html";
	
	@Test
	public void verifyTitle()
	{
		String actTitle=driver.getTitle(); //actTitle='Register page'
		System.out.println(actTitle);
		String expTitle="Register Page";
		if(actTitle.equals(expTitle))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");// Expected title ="Register Page" Here ,'p' is lower case so test case fail
		}
	}
  
  @BeforeMethod
  public void beforeMethod() {
	 driver =new FirefoxDriver();
		driver.get("URL");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

  @BeforeSuite
  public void beforeSuite() {
  }

  @AfterSuite
  public void afterSuite() {
  }

}
