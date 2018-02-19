package assignment7;

/*Test Case-1: 
1.	Open https://seleniumqtpautomation.000webhostapp.com/final.html
2.	To verify the page Title.

 * */


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

import java.util.List;


public class SeleniumPageTitle { 

	
public static void main(String[] args) throws InterruptedException {
		
	//	WebDriver driver = new FirefoxDriver();//create firefox driver with istance
	System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
	driver.navigate().to("https://seleniumqtpautomation.000webhostapp.com/final.html");//url
//	driver.navigate().back(); // Perform backward function of browser
//	driver.navigate().forward(); // Perform forward function of browser
//	driver.navigate().refresh(); //refresh the browser
	String actualtitle=driver.getTitle();//for geting the actual title of webpage
	System.out.println("title of the page is"+actualtitle);//print the actual title
	String acceptedtitle="seleniumqtpautomation";//we except the title
	if(actualtitle.equals(acceptedtitle))//if actual and expected title is match 
	{
		System.out.println("test case is done");//true value is print test case is done
	}else
	{
		System.out.println("testcase is fail");//else false condition is done
	}
	driver.findElement(By.xpath("html/body/div/div/form/input[1]"));
    WebElement ele= driver.findElement(By.xpath("html/body/div/div/form/input[1]"));
	ele.sendKeys("Rupa");
	driver.findElement(By.xpath("html/body/div/div/form/input[2]"));
	WebElement e1=driver.findElement(By.xpath("html/body/div/div/form/input[2]"));
	e1.sendKeys("Rupa");
	driver.findElement(By.xpath("html/body/div/div/form/input[3]"));
	WebElement e2=driver.findElement(By.xpath("html/body/div/div/form/input[3]"));
	e2.sendKeys("Rupa");
	driver.findElement(By.xpath("html/body/div/div/form/input[4]"));
	WebElement submit=driver.findElement(By.xpath("html/body/div/div/form/input[4]"));
	submit.click();
	driver.findElement(By.name("First_Name")).sendKeys("Rahul");
	driver.findElement(By.name("Last_Name")).sendKeys("Aware");
	driver.findElement(By.xpath(".//*[@id='Birthday_Day']")).click();
	
	
	driver.findElement(By.xpath(".//*[@id='Birthday_Month']")).click();
	driver.findElement(By.xpath(".//*[@id='Birthday_Year']")).click();
	driver.findElement(By.name("Email_Id")).sendKeys("rupahsonawane@gmail.com");
	driver.findElement(By.name("Mobile_Number")).sendKeys("8484924143");
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[2]/input[1]")).click();
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td[2]/input[2]")).click();
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[6]/td/input")).click();
	driver.findElement(By.name("Address")).sendKeys("bhatati visyapeeth katraj pune 46");
	driver.findElement(By.name("City")).sendKeys("bhatati visyapeeth");
	driver.findElement(By.name("Pin_Code")).sendKeys("411046");
	driver.findElement(By.name("State")).sendKeys("Maharashtra");
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[5]/td[2]/select/option[1]")).click();
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[5]/td[2]/select/option[1]")).click();
	driver.findElement(By.name("Hobby_Drawing")).click();
	driver.findElement(By.name("Hobby_Singing")).click();
	driver.findElement(By.name("Hobby_Cooking")).click();
	driver.findElement(By.name("Hobby_Other")).click();
	driver.findElement(By.name("Other_Hobby")).click();
	driver.findElement(By.xpath("html/body/form/table/tbody/tr[2]/td/input")).click();
	
	
	
	
	/*driver.findElement(By.xpath("")).sendKeys("Rulpa");
	driver.findElement(By.name("password")).sendKeys("Rupa");
	driver.findElement(By.name("confirmpassword")).sendKeys("Rupa");
	driver.findElement(By.name("Submit")).click();
	driver.findElement(By.name("Firstname")).sendKeys("Rahul");
	driver.findElement(By.name("Lastname")).sendKeys("Aware");*/
	/*<html>
	<body>
		<select id = "tools">
			<option value = "day">day</option>
			<option value = "month"> Monnth</option>
			<option value = "year"> Year </option>
			</option>
		</select>
	<body>
</html>*/
	Select dropdown=new Select(driver.findElement(By.id("date")));
	// Select by Index
			dropdown.selectByIndex(1);
			//check for gender selection radio button
			WebElement radioButton = driver.findElement(By.id("Gender"));
			radioButton.click();
	
	driver.findElement(By.name("Mobileno")).sendKeys("8484924143");
	JavascriptExecutor jse = (JavascriptExecutor) driver;
	WebElement element = driver.findElement(By.id("checkbox_accept-terms"));
	jse.executeScript("arguments[0].click();", element);

	
	//Thread.sleep(8000);/
	//driver.close();	
}
}


