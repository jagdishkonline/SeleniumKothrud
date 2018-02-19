package commonFunctions;


import org.openqa.selenium.WebElement;


public class WebDropDown {
	public static void webDropDown(WebElement ele, String text)
	{
		
		/*Select se = new Select(ele);
		se.deselectByIndex(1);*/
		ele.sendKeys(text);
		
	}
}
