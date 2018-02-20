package commonFunction;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebInputTextBox {
	
	private WebDriver driver;
	private WebElement webEleemnt;
	private String textToEntered;
		
	public WebInputTextBox(WebDriver driver, WebElement webelement, String textToEntered) {
		this.driver = driver;
		this.webEleemnt = webelement;
		this.textToEntered = textToEntered;
		
	}
	
	public static boolean SendInputTextBox(WebDriver driver, 
			WebElement webelement, String textToEntered) {	
		boolean exists = false;

		try {
			webelement.sendKeys(textToEntered);
			exists = true;
		} catch (NoSuchElementException e) {
			// nothing to do.
		}
		return exists;
	}
	
}
