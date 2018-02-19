package commonFunctions;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
  public WebDriver driver  = null;
  
  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	  driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
