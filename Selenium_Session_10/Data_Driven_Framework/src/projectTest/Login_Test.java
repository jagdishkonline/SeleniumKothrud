package projectTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import inputTestData.TestDataConstant;
import junit.framework.Assert;
import pageClasses.Login_Page_Action;
import utilities.*;

public class Login_Test {
	
	public static void main(String[] args) throws Exception {
		 
        /*This is to open the Excel file. 
		Excel path, file name and the sheet name*/
 
        ExcelUtilities.setExcelFile(
        		TestDataConstant.Path_TestData + 
        		TestDataConstant.File_TestData,"Sheet1");
      /*  System.setProperty("webdriver.gecko.driver", 
				"D:/Lib/geckodriver.exe");
		DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);*/
		WebDriver driver = new FirefoxDriver();
 
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
 
        driver.get(TestDataConstant.URL);
 
        Login_Page_Action.succesfullLogin(driver);
 
        System.out.println("Login Successfully");
 
         //Writing result into Excel sheet.
        String expected = "reg 2";
        ExcelUtilities.setCellData("pass", 
        		1, 6);
        driver.quit();
		}
}
