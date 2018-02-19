package assignment8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class SeleniumTestScenario3 {
WebDriver driver=null;
	@BeforeTest(description="open the URL... ")
	public void openURL()
	{
		driver =new FirefoxDriver();
		driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");
	}
	@Test(priority=1,description="Verify The Title... ")
	public void verifyTitle()
	{
		String actTitle=driver.getTitle(); //actTitle='Register page'
		System.out.println(actTitle);
		String expTitle="Register page";
		/*if(actTitle.equals(expTitle))
		{
			System.out.println("Test Case Pass");
		}
		else
		{
			System.out.println("Test Case Fail");// Expected title ="Register Page" Here ,'p' is lower case so test case fail
		}*/
		
		Assert.assertEquals( actTitle,expTitle);
	}
	@Test(priority=2, description="Login Registartion Form 1",enabled=true)
	public void registrationForm1TC2()
	{
		/*System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://seleniumqtpautomation.000webhostapp.com/final.html");*/
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Jagdish");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@name='confirmpassword']")).sendKeys("abc@123");
		driver.findElement(By.xpath("//input[@name='insert']")).click();
	}
	@Test(priority=3,description="Registering Form 2",enabled=true)
	public void registrationForm2()
	{
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
		
	}
	@Test(priority=4,description="Registration Form3",enabled=true)
	public void registrationForm3()
	{
		driver.findElement(By.xpath("//textarea[@name='Address']")).sendKeys("Mantri Housing Complex");
		driver.findElement(By.xpath("//input[@name='City']")).sendKeys("Pune");
		driver.findElement(By.xpath("//input[@name='Pin_Code']")).sendKeys("411012");
		driver.findElement(By.xpath("//input[@name='State']")).sendKeys("Maharashta");
		/*Select sel4 = new Select(driver.findElement(By.name("Country")));
		sel4.selectByVisibleText("India  ");*/
		driver.findElement(By.xpath("//option[@value='IN']")).click();//Handling dropdown by using xpath 
		driver.findElement(By.xpath("//input[@value='NEXT']")).click();
	}
	@Test(priority=5,description="Registration of Form 4",enabled=true)
	public void registrationForm4() //handling checkbox 
	{
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

	} 
	@Test(priority=6, description="verifying welcome page",enabled=true)
 public void verifyWelcomePage()
	 {
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
	@AfterTest
 public void closeURL()
 {
	 //driver.close();
	 driver.quit();
 }

}
