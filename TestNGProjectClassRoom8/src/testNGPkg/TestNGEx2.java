package testNGPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGEx2 {
	WebDriver driver=null;
  @BeforeMethod
	public void openURL()
	{
		/*driver =new FirefoxDriver();
		driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");*/
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
	}
  @Test(priority = 1)
	public void verifyTitle()
	{
		String actTitle=driver.getTitle(); //actTitle='Register page'
		System.out.println(actTitle);
		String expTitle="Register Page";
	/*	if(actTitle.equals(expTitle))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");// Expected title ="Register Page" Here ,'p' is lower case so test case fail
		}
		
*/		//Assertion 
		Assert.assertEquals(actTitle, expTitle,"Pass");
		
	}
  @Test(priority=2, enabled=false)
	public void registrationForm1TC2()
	{
		/*System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
	*/
		
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Jagdish");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("abc@123");
	//	driver.findElement(By.xpath("//input[@name='insert']")).click();
	}
  @AfterMethod
  public void close()
  {
	//  driver.close();
	  
  }
}

