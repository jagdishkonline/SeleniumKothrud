package seleniumCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumBasics {

	public static void main(String[] args) throws InterruptedException {
		
		// 1st Line
		WebDriver driver = new FirefoxDriver();//driver is of type WebDriver Interface Which is referring to object FirefoxDriver(Simple Class not Abstract Class). Here we implement  All WebDriver Abstract Method (only Declaration)
		// 2 nd Line = It Opens Only Browser
		driver.get("");//Base URL i.e. URL Which is  used for Automation
		
		//other way of SecondLine
	//	driver.navigate().to("url");
		Navigation n = driver.navigate();// Navigation Class Refers  to method for particular url
		n.to("http://www.google.com");
		
		
		//navigate Support other methods
		
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		
		//3 rd step
		
		WebElement element =driver.findElement(By.name("name"));//findElement returns single WebElement 
		//eight locatorts implemented by By method
		element.sendKeys("abc");
		
		driver.findElement(By.name("name")).sendKeys("abc");
		
		List<WebElement> list = driver.findElements(By.partialLinkText("google"));
		for (WebElement eachEle : list) {
			eachEle.click();  //click() is command using here
			
		}
		String expectedTitle = "Register Page";
		String actualTitle = driver.getTitle();//getTitle returns Actual Title
	
		if(expectedTitle.equals(actualTitle)){
			System.out.println("TC Pass");
		
	}
		String expectedTerms = "Terms and Conditions";
		String actualTerms = driver.getPageSource();
		if(actualTerms.contains(expectedTerms))
			{
			System.out.println("TC Pass");
		}
		
		//gettext
		
		driver.findElement(By.id("abc")).getText();
		
		//getAttribute= it is method which is available in WebElement Class(It Capture runtime attribute)
		driver.findElement(By.id("username")).getAttribute("size");
		
		//getCurrentURL = It will return actual URL
		String expectedURL = "www.abc.com/abc";
		String actualURL = driver.getCurrentUrl();
		
		driver.close();//It Will Close Current Window
		driver.quit();//It will Close all associated windows
		
	}
}
