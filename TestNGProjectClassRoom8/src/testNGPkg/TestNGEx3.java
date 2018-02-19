package testNGPkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGEx3 {
  @Test(priority=1, description="First f Method",enabled=false)
  public void f() {
	  System.out.println("============First Method===================");
	  System.out.println("You are in f @Test  method");
  }
  @Test(priority=2,description="Second f1 Method")
  public void f1()
  {
	  System.out.println("==============Second Method===============");
	  System.out.println("You are in f1@Test  method");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("You are in @BeforeMethod Method");
  }

  @AfterMethod
  
  public void afterMethod() {
	  System.out.println("You are in @AfterMethod Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("You are @ in BeforeClass Method");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("You are in @AfterClass Method");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("You are in @BeforeTest Method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("You are in @AfterTest Method");
}

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("You are in @BeforeSuite Method");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("You are in @AfterSuite Method");
  }

}
