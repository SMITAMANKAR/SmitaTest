package TestNG;

import org.testng.annotations.Test;

import junit.framework.*;

import org.testng.annotations.BeforeTest;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.Assert;

public class GridTest2 {
	
	WebDriver driver;
	String baseURL, nodeURL;
	
  
  @BeforeTest
  public void setUp() throws MalformedURLException {
	  baseURL = "http://itpreneurpune.com/services/";
	  nodeURL = "http:/localhost:5566/wd/hub";
	  DesiredCapabilities capability = DesiredCapabilities.chrome();
	  capability.setBrowserName("chrome");
	  driver = new RemoteWebDriver(new URL(nodeURL),capability);
  }

   
  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  
  @Test
  public void sampleTest() {
	  driver.get(baseURL);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  
	  if(driver.getPageSource().contains("Services")) {
		  Assert.assertTrue(true);
	  }
	  else {
		  Assert.assertTrue(false);
	  }
  }

}
