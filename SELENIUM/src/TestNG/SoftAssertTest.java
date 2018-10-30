package TestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.BeforeMethod;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class SoftAssertTest {
	
	SoftAssert softAssert = new SoftAssert();
	
	@BeforeMethod
	  public void beforeMethod() {
		
		System.out.println("_________BeforeMethod_______________");
		
	  }
	@AfterMethod
	  public void afterMethod() {
		System.out.println("_________AfterMethod_______________");
	  }
	  
  @Test
 
  public void Test2() {
	  
	  int a = 2;
	  int b = 3;
	  System.out.println("Executing Test2");
	  String Actualtitle = "Amazon";
	  System.out.println("Actualtitle :" + Actualtitle);
	  System.out.println("A \n");
	  
	  if(a != b) {
		  
		//HardAssert
		Assert.fail("Both values are same failing test cases");
		  
	  }
	  System.out.println("B \n");
	  softAssert.assertEquals(a,b);
	  System.out.println("C \n");
	  softAssert.assertAll();
  }

  

}
