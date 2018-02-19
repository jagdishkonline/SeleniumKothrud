package commonWebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebButton {

	WebDriver driver = null;
	//Constructor for WebButton
	
	public WebButton(WebDriver driver)
	{
		this.driver= driver;
	}
	public static void click(WebElement ele)
	{
		ele.click();
	}

}
