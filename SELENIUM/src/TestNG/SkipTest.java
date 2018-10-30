package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTest {
  @Test
  public void logintTest() {
	  System.out.println("Execute the login test");
  }
  @Test
  public void HomeTest() {
	  System.out.println("Execute the home navigation test");
	  throw new SkipException("Hold On");
  }
  @Test
  public void logoutTest() {
	  System.out.println("Execute the logout test");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://google.co.in");
	  driver.findElement(By.name("R")).click();
	  driver.quit();
	  
  } @Test
  public void FlightTest() {
	  System.out.println("Execute the Flight test");
	
	  }
  @Test
  public void BusTest() {
	  System.out.println("Execute the Bus test");
	 
  }
	  
}
