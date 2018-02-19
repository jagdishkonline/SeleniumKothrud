package seleniumAdvanceCommands;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumAdvanceCommand {

	public static void main(String[] args) {
		
		
		WebDriver driver = new FirefoxDriver();
		
		//Radio Button Automation
		WebElement  radioGrp = driver.findElement(By.id("radioGrp"));
		List<WebElement> broList = radioGrp.findElements(By.id("browser"));
		for (WebElement browser : broList) {
			if(browser.isSelected())//checked radio Button isSelected is true
			{
				if(browser.getText().equals("Chrome")){
					browser.click();
					
				}
				else if(browser.getText().equals("Mozilla")){
					browser.click();
			}
			
		}
		

	}
		//CheckBox Scenario
		//Three CheckBox(ie, mozilla,chrome) is there one is check and two uncheck we want to do vice versa(two check and one uncheck)
		
		WebElement  checkBoxGrp = driver.findElement(By.id("checkGrp"));
		List<WebElement>  choList = checkBoxGrp.findElements(By.id("browser"));//three
		for (WebElement browser : choList) {
				if(browser.getText().equals("Mozilla")  || browser.getText().equals("IE") ){
					if(browser.isSelected())
					{
					}else
					{
						browser.click();
					}
			}
				else if(browser.isSelected()){
					browser.click();
			}
			
		}
		
 //dropdown Automation
		
	//	Select is a Class which implement in  Selenium  API
		
		//deselectAll();
		//getAllSelectedOptions();
		
		
		//JavascriptExecutor
		
		Actions action = new Actions(driver);
		
		
		
	}
		

}
