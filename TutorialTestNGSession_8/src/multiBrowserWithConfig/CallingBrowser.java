package multiBrowserWithConfig;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CallingBrowser {
	public String URL = "http://www.google.co.in";
	public WebDriver driver;
	public static String CONFIG = "config";
    GetPropertyValue properties = new GetPropertyValue();
	
  @BeforeTest
  public void beforeTest() {
	  
  }
	
  @Test
  public void TC1() throws IOException {
	  String browserName = properties.getPropValues(CONFIG,"browser");
	  driver = LocalDriverFactory.createInstance(browserName);
	  driver.get(URL);
	  String expected = "Google";
	  String actual = driver.getTitle();
	  Assert.assertEquals(actual, expected);
  }
  
  @AfterTest
  public void afterTest() {
	  driver.close();
	  //8149259721
  }

}
