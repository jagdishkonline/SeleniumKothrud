package testNGPkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class TestNGInvocationClass {
	public String URL = "http://www.google.co.in";
	  public WebDriver driver = new FirefoxDriver();
		
	  @BeforeTest
	  public void setup() {
		  driver.get(URL);
	  }
	  
	  @Test(invocationCount = 2)
	  public void TitleVerification() {
		  String expected = "Google";
		  String actual = driver.getTitle();
		  Assert.assertEquals(actual, expected);
	  }
	  
	  @AfterTest
	  public void destroyBrowser(){
		  driver.close();
	  }

}
