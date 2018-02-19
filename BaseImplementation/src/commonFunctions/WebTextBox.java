package commonFunctions;

import org.openqa.selenium.WebElement;

public class WebTextBox {
	public static void senInput(WebElement ele, String text)
	{
		ele.sendKeys(text);
	}

}
