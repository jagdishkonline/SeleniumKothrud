package webElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CheckBoxEx {
	////*[@type="checkbox"]
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "D:/Lib/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("https://seleniumqtpautomation.000webhostapp.com/final.html");
	//	driver.navigate().back();
		Thread.sleep(3000);
	//	driver.navigate().forward();
		driver.findElement(By.xpath("//*[@name='insert']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@name='insert']")).click();
		Thread.sleep(3000);
		List<WebElement> list = driver.findElements(By.xpath("//*[@type='checkbox']"));
		System.out.println("Number of Checjboxes Present="  +list.size());
		/*for(int i=0; i<=list.size();i++)
		{
			System.out.println(list.get(i).isSelected());
		//	System.out.println(list.get(i).isDisplayed());		
		//	System.out.println(list.get(i).isEnabled());
		
			
		}*/
		//by using for each loop
		for (WebElement ele : list) {
			
			//by using value checkbox is selected
			/*if(ele.getAttribute("value").equalsIgnoreCase("Dancing"))
			{
				System.out.println(ele.isSelected());
					ele.click();
			}*/
			
			//If any checkbox is already selected
		if(!ele.isSelected())
		{
			ele.click();
		}
		}
		}
	}

