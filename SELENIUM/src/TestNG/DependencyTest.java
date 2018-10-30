package TestNG;

import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DependencyTest {
	
	WebDriver driver = new ChromeDriver();
	
  @Test(priority = 3)
  public void loginTest() {
	  
	  System.out.println("Execute the login test");
	 
  }
  
  @Test(priority = 1, dependsOnMethods= {"logoutTest"})
  public void ChangePassTest() {
	  
	  System.out.println("Execute the Change password test");
	 
  }
  @Test(priority = 2)
  public void logoutTest() {
	  
	  System.out.println("Execute the logout test");
	  driver.get("https://google.com");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.name("q")).clear();
	  driver.close();
  }
  
}
