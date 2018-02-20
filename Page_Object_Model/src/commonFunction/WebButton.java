package commonFunction;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebButton {
	
	public static boolean isButtonVisible(WebDriver driver, By by){
	    WebDriverWait zeroWait = new WebDriverWait(driver, 10);
	    ExpectedCondition<org.openqa.selenium.WebElement> c = ExpectedConditions.presenceOfElementLocated(by);
	    try {
	        zeroWait.until(c);
	        //logger.debug("Create New Application button is visible");
	        return true;
	    } catch (TimeoutException e) {
	        //logger.debug("Create New Application button is not visible");
	        return false;
	    }
	}
	
	public static void Button_Click(WebDriver driver, WebElement element){
	   //custom explicit wait for search field   
		/*if (isButtonVisible(driver, by)){
			element.click();
			
		}*/
		try {
			element.click();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
