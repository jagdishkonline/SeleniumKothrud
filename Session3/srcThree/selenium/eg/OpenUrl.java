package selenium.eg;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OpenUrl {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	//	WebElement element = null;
		WebDriver driver= new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, 30);
		//WebElement element;
		driver.get("http://da.vtsapps.com");
	//	Thread.sleep(3000);
	//	driver.switchTo().frame("wWLQ2-real");
		driver.findElement(By.name("login")).sendKeys("vts");
		driver.findElement(By.name("password")).sendKeys("vts");
		Actions mouseActions = new Actions(driver);
	//	Thread.sleep(10000);
//	mouseActions.moveToElement(driver.findElement(By.xpath(".//*[text()='Sign In']"))).click().build().perform();
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(".//*[normalize-space(text())='Sign In']"))).isSelected();
		//driver.switchTo().frame("wWLQ5-frame");
		
	//	mouseActions.moveToElement(driver.findElement(By.id("wWLQd"))).
//	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("wWLQd"))).click();
		driver.close();

	}

}
