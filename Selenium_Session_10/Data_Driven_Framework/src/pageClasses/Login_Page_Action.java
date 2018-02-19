package pageClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import utilities.ExcelUtilities;

public class Login_Page_Action {
	
	public static void succesfullLogin(WebDriver driver) throws Exception{
		 
		//This is to get the values from Excel sheet, passing parameters (Row num &amp; Col num)to getCellData method

		String sUserName = ExcelUtilities.getCellData(
				1, 1);

		String sPassword = ExcelUtilities.getCellData(
				1, 2);
		
		String cPassword = ExcelUtilities.getCellData(
				1, 3);

		driver.findElement(By.name("name")
				).sendKeys(sUserName);

		driver.findElement(By.name("password")
				).sendKeys(sPassword);

		driver.findElement(By.name("confirmpassword")
				).sendKeys(cPassword);

    }
}
