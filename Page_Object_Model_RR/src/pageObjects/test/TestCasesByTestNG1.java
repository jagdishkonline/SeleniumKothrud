package pageObjects.test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.AssertJUnit;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.Home_Page;
import pageObjects.LogIn_Page;

public class TestCasesByTestNG1 {
	private static WebDriver driver = null;

	@BeforeClass
	public void openBrowser() {
		driver = new FirefoxDriver();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.get("http://www.javabykiran/cftp");
	}
	
	@Test
	public void test_Home_page(){
		org.openqa.selenium.WebElement webElement= Home_Page.lnk_MyAccount(driver);
		System.out.println(webElement.getText());
		AssertJUnit.assertEquals(webElement.getText(), webElement.getText());
		webElement.click();
		
		
		/*
				Assert(hm.getTitle())*/
				
				
		AssertJUnit.assertEquals(driver.findElement(By.xpath(".//*[@id='ajax_loginform']/p[2]/label")).getText(), "Username:");
		AssertJUnit.assertEquals(driver.findElement(By.xpath("/html/body/div[2]/div/div/div/div/div[1]/article/div/div/div/div[1]/form/p[3]/label")).getText(), "Password1:");
	}
	

}


