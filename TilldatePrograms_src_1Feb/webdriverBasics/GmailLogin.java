package webdriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GmailLogin {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.get("http://gmail.com");
driver.findElement(By.id("identifierId")).sendKeys("testingse2");
driver.findElement(By.xpath("//div[@id='identifierNext']/content")).click();

driver.findElement(By.name("password")).sendKeys("selenium5");
Thread.sleep(2000);
driver.findElement(By.xpath("//div[2]/div/div/content/span")).click();

	}

}
