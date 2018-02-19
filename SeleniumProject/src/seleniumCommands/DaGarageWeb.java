package seleniumCommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DaGarageWeb {
         
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver;
		//System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("http://da.vtsapps.com");
		String act_Title =driver.getTitle();
		System.out.println(act_Title);
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("vts");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("vts");
		driver.findElement(By.xpath("//button[@class='z-button']")).click();
	//	driver.findElement(By.xpath("//span[contains(.,'Transaction')]")).click();
	WebElement element =  driver.findElement(By.linkText("Transaction"));
	element.click();
	/*
	Actions action = new Actions(driver);
	action.build().perform();
	action.moveToElement(element).build().perform();
*/	}

}
