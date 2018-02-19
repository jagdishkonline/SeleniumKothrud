package selenium381pack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Selenium381Ex {
	 static WebDriver driver;
	
	public void chrome()
	{
		System.out.println("launching chrome browser");
		System.setProperty("webdriver.chrome.driver", "D:\\Lib\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver = new FirefoxDriver();
		//driver.manage().window().maximize();
		driver.navigate().to("https://seleniumqtpautomation.000webhostapp.com/final.html");
		driver.findElement(By.name("name")).sendKeys("jk");
		driver.findElement(By.name("password")).sendKeys("jk");
		driver.findElement(By.name("confirmpassword")).sendKeys("jk");
		driver.findElement(By.name("insert")).click();
		String str = driver.findElement(By.name("First_Name")).getText();
		System.out.println("String is= "+str);
		/*String str =driver.getPageSource();
		System.out.println(str);
		if (str.contentEquals("Username"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
		System.out.println(str);*/
	//	System.out.println("String is ="+str);
		driver.close();
		System.out.println("Browser Closed");
		
		
	}
	public void mozilla()
	{
		System.out.println("launching Mozilla browser");
	//	System.setProperty("webdriver.gecko.driver", "D:\\Lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		//driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.navigate().to("http://www.toolsqa.com");
		driver.close();
		System.out.println("Browser Closed");
	}
	public static void main(String[] args) {
		Selenium381Ex se = new Selenium381Ex();
	se.chrome();
//	se.mozilla();
		
		
		

	}

}
