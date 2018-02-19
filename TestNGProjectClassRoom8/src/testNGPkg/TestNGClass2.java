package testNGPkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;


public class TestNGClass2 {
		//WebDriver driver= null;
	
	//@Test(invocationCount=1)
	
	public static void main(String[] args)  {
		WebDriver driver= null;
		
		driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		String str=driver.getCurrentUrl();
		System.out.println(str);
		/*String str2=driver.getPageSource();
		System.out.println(str2);*/
		String str3=driver.getTitle();
		System.out.println(str3);
		String str4=driver.getWindowHandle();
		System.out.println(str4);
		Set<String> str5 =driver.getWindowHandles();
		System.out.println("All Windows="+str5);
		
		
		String str10=driver.findElement(By.id("lst-ib")).getText();
		System.out.println(str10);
	//	driver.close();
	//	driver.getWindowHandle();
	}
	
}

	