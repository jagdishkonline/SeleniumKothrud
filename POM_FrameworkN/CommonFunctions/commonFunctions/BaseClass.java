package commonFunctions;


import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class BaseClass {
public WebDriver driver = null;
String url= "https://seleniumqtpautomation.000webhostapp.com/final.html";

  @BeforeMethod
  public void beforeMethod() {
	  driver = new FirefoxDriver();
	//  driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
	  WebBrowser.openBrowser(driver, url);
  }

  @AfterMethod
  public void afterMethod() {
	//  driver.close();
  }

}
