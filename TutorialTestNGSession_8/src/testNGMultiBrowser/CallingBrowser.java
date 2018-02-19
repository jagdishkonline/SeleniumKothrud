package testNGMultiBrowser;


import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CallingBrowser {
	public String URL = "http://www.google.co.in";
	public WebDriver driver;
	
  @BeforeTest
  public void beforeTest() {
	  
  }
	
  @Test
  public void TC1() {
	  String browserName = "chrome";
	  driver = LocalDriverFactory.createInstance(browserName);
	  driver.get(URL);
	  String expected = "Google";
	  String actual = driver.getTitle();
	  Assert.assertEquals(actual, expected);
  }
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
