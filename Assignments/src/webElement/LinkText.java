package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkText {
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.google.com");
		List<WebElement>  linksCount =driver.findElements(By.tagName("a"));
		
		
		System.out.println("Link Count is ="+linksCount.size());
		
		for (WebElement webElement : linksCount) {
			
			System.out.println(webElement.getText());
			
		}
	}

}
