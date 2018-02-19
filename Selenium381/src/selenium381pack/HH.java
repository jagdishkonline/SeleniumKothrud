package selenium381pack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HH {
	  public WebDriver driver  = null;
	  
	  @BeforeMethod
	  public void beforeMethod() {
		  driver = new FirefoxDriver();
		  //driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
	  }
	  @Test
	  public void jk()
	  {
		  //driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
		 driver.get("https://www.facebook.com/");
		String str2= driver.findElement(By.xpath("//label[@for='pass']")).getText();
	//	 String str= driver.findElement(By.xpath("//input[@name='name']")).getTagName();
		 System.out.println("String is ="+str2);
		  
	  }

	  @AfterMethod
	  public void afterMethod() {
		  driver.close();
	  }

	}

