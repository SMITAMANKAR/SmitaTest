package TestNG;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


public class xmlparameter {
  @Test
  @Parameters("username")
  public void xmlgetparameter( String username) {
	  
	  System.out.println("username :" +username);
  }
 

}
