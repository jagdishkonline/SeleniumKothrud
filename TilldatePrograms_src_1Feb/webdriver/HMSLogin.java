package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HMSLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	webdriver driver=new chromedriver();
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://selenium4testing.com/hms/");
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("submit")).click();
		
	//	driver.quit();

	}

}








