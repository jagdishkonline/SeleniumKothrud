package commonWebElements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WebTextBox {

	WebDriver driver = null;
	//Constructor for WebtextBox
	
	public WebTextBox(WebDriver driver)
	{
		this.driver= driver;
	}
	public static void sendInput(WebElement ele, String text)
	{
		ele.sendKeys(text);
	}
	
	

}
