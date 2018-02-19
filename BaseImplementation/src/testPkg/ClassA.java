package testPkg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import commonFunctions.WebButton;
import commonFunctions.WebTextBox;

public class ClassA  extends BaseClass{//hierarchical Inheritance
  @Test
   public void TC1() {
	  System.out.println("TC1");
	 WebElement ele=  driver.findElement(By.id("username"));
	 WebTextBox.senInput(ele, "config");//abc return from config file
	 WebElement sub = driver.findElement(By.id("Submit"));
	 WebButton.click(sub);
	 //Assignment
	 //Base Class with LocalDriverFactory
	 //Base Class With GetProperty for Browser
	 //common functions for all other WebElements
	 //Test Data Input from config
  }
  @Test
  public void TC2() {
	  System.out.println("TC2");
	  
  }
}
