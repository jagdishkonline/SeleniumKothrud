package assignment9;


import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CallingBrowser {
	public String URL = "https://seleniumqtpautomation.000webhostapp.com/final.html";
	public WebDriver driver;
	public static String CONFIG = "config";
    GetPropertyValue properties = new GetPropertyValue();
	
  @BeforeMethod
  public void beforeTest() throws IOException {
	  String browserName = properties.getPropValues(CONFIG,"browser");
	  driver = LocalDriverFactory.createInstance(browserName);
	  driver.get(URL);
  }
  @Test(description="Verify Registration page")
  public void TC1() throws IOException, InterruptedException {
		  String expected = "Register page";
	  String actual = driver.getTitle();
	  System.out.println("Title Of The Page=" +actual);
	  Assert.assertEquals(actual, expected);
	/*String act =driver.findElement(By.name("name")).getText();
	System.out.println("name is ="+act);*/
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Jagdish");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@name='insert']")).click();
		driver.findElement(By.xpath("//input[@name='First_Name']")).sendKeys("Ganesh");
		driver.findElement(By.xpath("//input[@name='Last_Name']")).sendKeys("Kumar");
/*		Select sel = new Select(driver.findElement(By.xpath("//select[@id='Birthday_Day']")));
		sel.selectByValue("16");*/
		new Select(driver.findElement(By.xpath("//select[@id='Birthday_Day']"))).selectByValue("16");
		Select sel2 = new Select(driver.findElement(By.xpath("//select[@id='Birthday_Month']")));
		sel2.selectByValue("June");
		Select sel3 = new Select(driver.findElement(By.xpath("//select[@id='Birthday_Year']")));
		sel3.selectByValue("1988");
		driver.findElement(By.xpath("//input[@name='Email_Id']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//input[@name='Mobile_Number']")).sendKeys("9762215699");
	driver.findElement(By.xpath("//input[@value='Male']")).click();
	//	driver.findElement(By.xpath("//input[@value='Female']")).click();
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.xpath("//textarea[@name='Address']")).sendKeys("Mantri Housing Complex");
		driver.findElement(By.xpath("//input[@name='City']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='Pin_Code']")).sendKeys("411012");
		driver.findElement(By.xpath("//input[@name='State']")).sendKeys("Maharashta");
		Thread.sleep(2000);
		/*Select sel4 = new Select(driver.findElement(By.name("Country")));
		sel4.selectByVisibleText("India  ");*/
		driver.findElement(By.xpath("//option[@value='IN']")).click();//Handling dropdown by using xpath 
		driver.findElement(By.xpath("//input[@value='NEXT']")).click();
		driver.findElement(By.xpath("//input[@name='Hobby_Drawing']")).click();
		driver.findElement(By.xpath("//input[@name='Hobby_Singing']")).click();
		driver.findElement(By.xpath("//input[@name='Hobby_Dancing']")).click();
		driver.findElement(By.xpath("//input[@name='Hobby_Cooking']")).click();
		driver.findElement(By.xpath("//input[@name='Hobby_Other']")).click();
		driver.findElement(By.xpath("//input[@name='Other_Hobby']")).sendKeys("Sketching");
	    driver.findElement(By.xpath("//input[@value='Registor']")).click();
	  /*  WebElement chkBox=driver.findElement(By.xpath("html/body/form/table/tbody/tr[1]/td[2]"));
	    for(int i=0; i<=chkBox.size(); i++){
	    	chkBox.get(i).click();
	    	}*/
		 String str = "Welcome To Selenium Automation Testing";
		if(str.equals("Welcome To Selenium Automation Testing"))
		{
		 System.out.println("PASS");
		}
		else
		{
			System.out.println("FAIL");
		}

	 }
  
  @AfterMethod
  public void afterTest() {
	  driver.close();
	  //8149259721
  }

}
