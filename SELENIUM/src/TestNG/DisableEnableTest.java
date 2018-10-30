package TestNG;

import org.testng.annotations.Test;

public class DisableEnableTest {
  @Test
  public void hotel() {
	  System.out.println("Execute the hotel test");
  }
  
  @Test (enabled=false)
  public void flight() {
	  System.out.println("Execute the flight test");
  }
  @Test
  public void car() {
	  System.out.println("Execute the car test");
  }
 

}
