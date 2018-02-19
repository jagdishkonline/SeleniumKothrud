package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HMSPR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://selenium4testing.com/hms/");
		driver.findElement(By.name("username")).sendKeys("user1");
		driver.findElement(By.name("password")).sendKeys("user1");
		driver.findElement(By.name("submit")).click();
		
		driver.findElement(By.linkText("Registration")).click();
		driver.findElement(By.linkText("Permanent Registration")).click();
//Dropdown		
new Select(driver.findElement(By.name("PATIENT_CAT"))).
                                              selectByVisibleText("Insurance");
new Select(driver.findElement(By.name("RELATION"))).
                                                 selectByVisibleText("Father");
new Select(driver.findElement(By.name("TITLE"))).selectByVisibleText("Mr.");

driver.findElement(By.name("PNT_NAME")).sendKeys("John");

driver.findElement(By.name("DOB")).click();
driver.findElement(By.className("tcalSelected")).click();
//Upload a file
driver.findElement(By.name("image")).sendKeys("E:\\Photos\\Indian.png");

	}

}










