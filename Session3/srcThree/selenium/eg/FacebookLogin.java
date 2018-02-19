package selenium.eg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookLogin {
public static void main(String[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("http://www.facebook.com/");
	driver.findElement(By.id("email")).sendKeys("9762215699");
	driver.findElement(By.id("pass")).sendKeys("jk");
	driver.findElement(By.id("u_0_2")).click();
	
	
}
}
