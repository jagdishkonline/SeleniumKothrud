package testNGPkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterTest;

public class PriorityTestNGClass {
	public String URL = "http://www.google.co.in";
	public WebDriver driver = new FirefoxDriver();
	
  @BeforeTest
  public void beforeTest() {
	  driver.get(URL);
  }
	
  @Test(priority = 3)
  public void TC1() {
	  String expected = "Google";
	  String actual = driver.getTitle();
	  Assert.assertEquals(actual, expected);
  }
  @Test(priority = 1)
  public void TC2() {
	  throw new SkipException("We are skipping Test Case 2");
	 
  }
  @Test(priority = 30)
  public void TC3() {
	  Assert.fail();
  }
  
  @Test(priority = 13)
  public void TC4() {
	  throw new SkipException("We are skipping Test Case 4");
  }
  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
