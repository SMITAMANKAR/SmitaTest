package antpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestA {
  @Test
  public void testOne() {
	  System.out.println("Hello A one");
  }
  @Test
  public void testTwo() {
	  System.out.println("Hello A Two");
  }
 

  @BeforeClass
  public void setUp() {
	  System.out.println("****In case---Test A");
	  
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("_____End of class____");
	  
  }

 

}
