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

public class TestNGClass {
  @Test
  public void TC1() //Which is method comes under @test i.e new TestCase
  {
	  System.out.println("In  TC1");
  }
  @Test
  public void TC2() //@Test Option is Not Here so no new Test Case Here
  {
	  System.out.println("In TC2");
  }
 /* public void TC2() //@Test Option is Not Here so no new Test Case Here
  {
  }*/
  @BeforeMethod//it will executes before each @Test .(If 3 classes it will execute 9 times)
  public void beforeMethod() {
	  System.out.println("In Before Method");
  }

  @AfterMethod//It will executes after each @Test
  public void afterMethod() {
	  System.out.println("In After Method");
  }

  @BeforeClass//It will execute before all @Test Within same class(it will execute only once)
  public void beforeClass() {
	  System.out.println("In Before Class");
  }

  @AfterClass//It will execute after all @Test Within same class(it will execute only once)
  public void afterClass() {
	  System.out.println("In After Class");
  }

  @BeforeTest//It Will Execute Only once before all @Test
  public void beforeTest() {
	  System.out.println("In Before Test");
  }

  @AfterTest//It Will Execute Only once after all @Test
  public void afterTest() {
	  System.out.println("In After Test");
  }

  @BeforeSuite//before each suite execution
  public void beforeSuite()
  {
	  System.out.println("In Before Suit");
  }

  @AfterSuite//after each suit execution
  public void afterSuite() {
	  System.out.println("In After Suit");
  }
 
  

}
//hierarchy of TestNG annotation  execution 
/*In Before Suit
In Before Test
In Before Class
In Before Method
In  TC1
In After Method
In After Class
In After Test*/
