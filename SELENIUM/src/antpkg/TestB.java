package antpkg;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class TestB {
	  @Test
	  public void testOne() {
		  System.out.println("Hello B one");
	  }
	  @Test
	  public void testTwo() {
		  System.out.println("Hello B Two");
	  }
	 

	  @BeforeClass
	  public void setUp() {
		  System.out.println("****In case---Test B");
		  
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("_____End of class B____");
		  
	  }

}
