package webdriverBasics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HMSAdmission {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");		
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
driver.get("http://selenium4testing.com/hms/");

driver.findElement(By.name("username")).sendKeys("admin");
driver.findElement(By.name("password")).sendKeys("admin");
driver.findElement(By.name("submit")).click();

driver.findElement(By.linkText("ADT")).click();

driver.findElement(By.name("PNT_ID")).sendKeys("John ahc");
driver.findElement(By.id("MR_NO")).sendKeys("PR3942636577");
new Select(driver.findElement(By.name("ADM_TPYE"))).selectByVisibleText("Illness");
new Select(driver.findElement(By.name("PNT_CLASS"))).selectByVisibleText("2nd Class");
driver.findElement(By.name("EXP_DATE")).click();
driver.findElement(By.xpath("//table[@id='tcalGrid']/tbody/tr[3]/td[4]")).click();

	}

}









