package waitSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConditionalExplicitWait {
	public String URL = "http://newtours.demoaut.com/";
	public WebDriver driver = new FirefoxDriver();
		
	  @BeforeTest
	  public void setup() {
		  driver.get(URL);
	  }
	  
	  @Test
	  public void UnconditionExplicitWait() {
		  /*Explicit wait for UserName field*/
	      WebDriverWait wait = new WebDriverWait(driver, 10);
	      wait.until(ExpectedConditions.visibilityOfElementLocated(
		    		By.name("userName")));
		  driver.findElement(By.name("userName")).sendKeys("mercury");
		  driver.findElement(By.name("password")).sendKeys("1");
		  driver.findElement(By.name("login")).click();
		  String expected = "Sign-on: Mercury Tours";
		  String actual = driver.getTitle();
		  Assert.assertEquals(actual, expected);
		  
		 /*Different Expected Conditions for Explicit Wait
		 elementToBeClickable() 
		 textToBePresentInElement()
		 alertIsPresent()
		 titleIs()
		 frameToBeAvailableAndSwitchToIt()*/
	  }
	  
	  @AfterTest
	  public void destroyBrowser(){
		  driver.close();
	  }
}
