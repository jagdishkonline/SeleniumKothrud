package webdriver;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");		
WebDriver driver=new ChromeDriver();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://mail.yahoo.com");
driver.findElement(By.id("login-username")).sendKeys("selenium4u");
driver.findElement(By.id("login-signin")).click();

driver.findElement(By.id("login-passwd")).sendKeys("selenium@123");
driver.findElement(By.id("login-signin")).click();
	}

}
