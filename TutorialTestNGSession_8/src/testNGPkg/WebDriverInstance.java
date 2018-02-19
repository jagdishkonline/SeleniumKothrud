package testNGPkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class WebDriverInstance {
	
	public WebDriver driver;
  @Test
  public void FirefoxDriver() {
	  //Open Firefox
	  //driver = new firefoxDriver();
  }
  
  @Test
  public void ChromeDriver() {
	  //Open Chrome
	  //driver = new ChromeDriver();
  }
  
  @Test
  public void InterNetExplorerDriver() {
	  //Open IE
	  //driver = new InternetExplorerDriver();
  }
}
