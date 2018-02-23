package seleniumCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			WebDriver driver = new FirefoxDriver();
			//driver.findElement(By.name)
			
			driver.get("http://www.google.com");
			List <WebElement> links = driver.findElements(By.tagName("a"));
		//	System.out.println(links.get(0));
			for (int i = 1; i<=links.size(); i=i+1){
				System.out.println(links.get(i).getText());
	 }
	}

}
