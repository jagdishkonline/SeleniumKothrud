package waitSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.base.Function;

public class ConditionalFluentWait {
	public String URL = "http://newtours.demoaut.com/";
	  public WebDriver driver = new FirefoxDriver();
		
	  @BeforeTest
	  public void setup() {
		  driver.get(URL);
	  }
	  
	  @Test
	  public void TitleVerification() {
		  WebElement userName = driver.findElement(
                  By.name("userName"));

			new WebDriverWait(driver,10).
			     until(ExpectedConditions.visibilityOf(userName));
			
			new FluentWait<WebElement>(userName).
			     withTimeout(10, TimeUnit.SECONDS).
			     pollingEvery(100,TimeUnit.MILLISECONDS).
			     until(new Function<WebElement  , Boolean>() {
			         @Override
			         public Boolean apply(WebElement element) {
			             return element.getText().endsWith("04");
			         }
			     }
			     );
			
			/*Syntax
			 * Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
					//Wait for the condition
				       .withTimeout(30, TimeUnit.SECONDS) 
				         // which to check for the condition with interval of 5 seconds. 
				       .pollingEvery(5, TimeUnit.SECONDS) 
				     //Which will ignore the NoSuchElementException
				       .ignoring(NoSuchElementException.class);
			 */
	  }
	  
	  @AfterTest
	  public void destroyBrowser(){
		  driver.close();
	  }
}
