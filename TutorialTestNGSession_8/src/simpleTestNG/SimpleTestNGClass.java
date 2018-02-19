package simpleTestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class SimpleTestNGClass {
  @Test
  public void LoginTest() {
	  System.out.println("In LoginTest");
  }
  
  @Test
  public void LoginTest1() {
	  System.out.println("In LoginTest1");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("In beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("In afterMethod");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("In beforeClass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("In afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("In beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("In afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("In beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("In afterSuite");
  }

}
