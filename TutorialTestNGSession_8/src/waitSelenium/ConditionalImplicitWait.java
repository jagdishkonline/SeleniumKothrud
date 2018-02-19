package waitSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConditionalImplicitWait {
	public String URL = "http://newtours.demoaut.com/";
	  public WebDriver driver;
		
	  @BeforeTest
	  public void setup() {
		  driver = new FirefoxDriver();
		  //add Implicit wait immediate after driver instantiate
		  driver.manage().timeouts().implicitlyWait(10, 
				  TimeUnit.SECONDS);
		  driver.get(URL);
	  }
	  
	  @Test
	  public void UnconditionalImplicit() {
		  driver.findElement(By.name("userName")).sendKeys("mercury");
		  driver.findElement(By.name("password")).sendKeys("1");
		  driver.findElements(By.name("login"));
		  String expected = "Sign-on: Mercury Tours";
		  String actual = driver.getTitle();
		  Assert.assertEquals(actual, expected);
	  }
	  
	  @AfterTest
	  public void destroyBrowser(){
		  driver.close();
	  }
}
