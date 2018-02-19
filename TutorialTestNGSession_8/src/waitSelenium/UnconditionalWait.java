package waitSelenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class UnconditionalWait {
	public String URL = "http://www.google.co.in";
	  public WebDriver driver = new FirefoxDriver();
		
	  @BeforeTest
	  public void setup() {
		  driver.get(URL);
	  }
	  
	  @Test
	  public void TitleVerificationWait() throws InterruptedException {
		  String expected = "Google";
		  String actual = driver.getTitle();
		  wait(10);
		  Assert.assertEquals(actual, expected);
	  }
	  
	  @Test
	  public void TitleVerificationThread() throws InterruptedException {
		  String expected = "Google";
		  String actual = driver.getTitle();
		  Thread.sleep(1000);
		  Assert.assertEquals(actual, expected);
	  }
	  
	  @AfterTest
	  public void destroyBrowser(){
		  driver.close();
	  }
}
