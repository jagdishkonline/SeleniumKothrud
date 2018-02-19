package selenium.eg;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class OpenUrl2 {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://da.vtsapps.com");
		driver.findElement(By.name("login")).sendKeys("vts");
		driver.findElement(By.name("password")).sendKeys("vts");
		driver.findElement(By.className("z-button")).click();
		driver.findElement(By.partialLinkText("Transactions")).click();
		//Actions builder = new Actions(driver);
		
	/*JavascriptExecutor js = ((JavascriptExecutor)driver);
	js.executeScript("document.getElementById('wWLQd').click()");*/
		
	//builder.doubleClick();

}
}