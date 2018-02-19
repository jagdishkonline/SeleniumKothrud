package testPkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
  WebDriver driver=null;
  @BeforeMethod
  public void beforeMethod() { //LocalDriverFactory Assignment by using PropertieyFile
	   driver = new FirefoxDriver();
	//   System.setProperty("webdriver.gecko.driver", "D:/Lib/geckodriver.exe");
  }

  @AfterMethod
  public void afterMethod() {
	  driver.close();
  }

}
