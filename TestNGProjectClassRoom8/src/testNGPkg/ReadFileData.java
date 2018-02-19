package testNGPkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadFileData {
	
  public static void main(String[] args)  {
	  File file = new File("config.properties");
	  
		FileInputStream fileInput = null;
		try {
			fileInput = new FileInputStream(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		Properties prop = new Properties();
		//String str = prop.getProperty(key);
		//load properties file
		try {
			prop.load(fileInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		WebDriver driver = new FirefoxDriver();

		driver.get(prop.getProperty("URL"));
		driver.findElement(By.id("identifierId")).sendKeys(prop.getProperty("username"));
		driver.findElement(By.id("identifierNext")).click();
	//	driver.findElement(By.xpath("//input[@name='password']")).sendKeys(prop.getProperty("password"));
	//	driver.findElement(By.xpath(".//*[@id='passwordNext']/div[2]")).click();
		
		
		System.out.println("URL ::" + prop.getProperty("URL"));
		System.out.println("User name::" +prop.getProperty("username"));
	    System.out.println("Password::" +prop.getProperty("password"));
  }
}