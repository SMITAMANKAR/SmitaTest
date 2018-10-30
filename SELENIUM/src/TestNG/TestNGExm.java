package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class TestNGExm {
  
  @BeforeMethod
  public void beforeClassMethod() {
	  System.out.println("Execute before class method");
  }

  @AfterMethod
  public void afterClassMethod() {
	  System.out.println("Execute after class method");
  }

  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Execute before test method");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("Execute after test method");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Execute before test suite  method");
	  // example: 1. set system property.
	  //installation like java,python,browser,jar.
	  //set browser and their driver property.
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("Execute after test suite  method");
	  //1. clean process, destroy the VM/ machine for iteration.
  }
  
  @Test
  
  public void loginTest() {
	  System.out.println("Execute login test1");
	  System.out.println("__________________________________________");
  }
 @Test
  
  public void homeTest() {
	  System.out.println("Execute home navigation test2");
	  System.out.println("__________________________________________");
  }
 @Test
 
 public void logooutTest() {
	  System.out.println("Execute the logout test3");
	  System.out.println("__________________________________________");
 }

}
