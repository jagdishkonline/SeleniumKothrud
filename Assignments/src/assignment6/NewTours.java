package assignment6;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class NewTours {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://newtours.demoaut.com/mercuryregister.php");
		//Thread.sleep(9000);
	//	driver.navigate().refresh();
		/*Thread.sleep(9000);
		driver.navigate().back();
	Thread.sleep(8000);
	driver.navigate().back();*/
		String act_title= driver.getTitle();
		System.out.println("Title of the page=" +act_title);//Mercury Tours
		String exp_title = "Register: Mercury Tours";
		if(exp_title.equalsIgnoreCase(act_title))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC Fail");
		}
	
		driver.findElement(By.name("firstName")).sendKeys("Jagdish");
			driver.findElement(By.name("lastName")).sendKeys("Kumar");
		driver.findElement(By.name("phone")).sendKeys("9762215699");
		driver.findElement(By.name("userName")).sendKeys("jagdishkonline@gmail.com");
		driver.findElement(By.name("address1")).sendKeys("Mantri Housing Complex");
		driver.findElement(By.name("address2")).sendKeys("F C Road");
		driver.findElement(By.name("city")).sendKeys("Pune");
		driver.findElement(By.name("state")).sendKeys("Maharashtra");
		driver.findElement(By.name("postalCode")).sendKeys("411042");
		//driver.findElement(By.name("userName")).sendKeys("jagdishkonline@gmail.com");
		Select sel = new Select(driver.findElement(By.name("country")));
		sel.selectByVisibleText("INDIA");
		driver.findElement(By.name("email")).sendKeys("jagdishkonline@gmail.com");
		driver.findElement(By.name("password")).sendKeys("India123");
		driver.findElement(By.name("confirmPassword")).sendKeys("India123");
		driver.findElement(By.name("register")).click();
		driver.findElement(By.partialLinkText("sign-in")).click();
		driver.findElement(By.name("userName")).sendKeys("jagdishkonline@gmail.com");
		driver.findElement(By.name("password")).sendKeys("India123");
		driver.findElement(By.name("login")).click();
		
		
		
		//sel.deselectByIndex(94);
		//sel.selectByIndex(92);
		
		Thread.sleep(8000);
		driver.close();	
		
	}
}
