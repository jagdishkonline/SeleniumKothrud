package testNGPkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class MultpleTest {
	public String URL = "http://newtours.demoaut.com/";
	public WebDriver driver = new FirefoxDriver();
	
  @BeforeTest
  public void beforeTest() {
	  driver.get(URL);
  }
	
  @Test
  public void TC1() {
	  String expected = "Welcome: Mercury Tours";
	  String actual = driver.getTitle();
	  Assert.assertEquals(actual, expected);
  }
  @Test
  public void TC2() {
	  driver.findElement(By.name("userName")).sendKeys("mercury");
	  driver.findElement(By.name("password")).sendKeys("1");
	  driver.findElement(By.name("login")).click();
	  String expected = "Sign-on: Mercury Tours";
	  String actual = driver.getTitle();
	  Assert.assertEquals(actual, expected);
  }
  

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
