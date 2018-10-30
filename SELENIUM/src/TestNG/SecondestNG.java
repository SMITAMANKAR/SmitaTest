package TestNG;

import org.testng.annotations.*;
import java.io.File;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;


public class SecondestNG {
	
	WebDriver driver = new ChromeDriver();
	
  @Test
  public void f() throws Exception {
	  
	  try {
		   
		  System.out.println("Start fun");
		  
		  driver.navigate().to("http://www.calculator.net/percent.calculator.html");
		  java.util.List<WebElement> links = (List<WebElement>) driver.findElements(By.tagName("a"));
		  System.out.println("Number of links in the page is" +links.size());
		  System.out.println("_________________________________________");
		  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshot, new File("C:\\software2\\SMITA\\screenshotfun1.jpg"));
		  
		  for(int i = 0; i<links.size(); i = i+1) {
			  System.out.println("Name of Link#" + i + links.get(i).getText());
		  }
		  
		  
	  }
	  
	  catch(Exception e) {
		  throw(e);
	  }
  }
  
  @Test
  public void fun2() throws Exception {
	  
	  try {
		  
		  System.out.println("start fun2");
		  
		  driver.navigate().to("http://www.calculator.net/percent.calculator.html");
		  
		  //selcting an item from drop down list box
		  
		  Select dropdown = new Select (driver.findElement(By.id("ccompound")));
		  dropdown.selectByVisibleText("continuously");
		  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshot, new File("C:\\software2\\SMITA\\screenshotfun2.jpg"));
		  Thread.sleep(3000);
		  
		  dropdown.selectByIndex(1);
		  }
	  catch (Exception e)
	  {
		  throw(e); 
	  }
  }
  
  @Test
  public void fun3() throws Exception {
	  try {
		  System.out.println("start fun3");
		  
		  driver.navigate().to("http://www.calculator.net/mortgage-payoff-calculator.html");
		  Thread.sleep(5000);
		  System.out.println("The output of the IsSelected :" +driver.findElement(By.id("cpayoff3")).isSelected());
		  System.out.println("The output of the IsEnabled :" +driver.findElement(By.id("cpayoff4")).isEnabled());
		  System.out.println("The output of the IsDisplayed :" +driver.findElement(By.id("cpayoff5")).isDisplayed());
		  System.out.println("____________________________________________________");
		  
		  File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  FileUtils.copyFile(screenshot, new File("C:\\software2\\SMITA\\screenshotfun3.jpg"));
		  //click on radio button.
		  driver.findElement(By.id("cpayoff1")).click();
		  Thread.sleep(3000);
		  
		  System.out.println("The output of the IsSelected :" +driver.findElement(By.id("cpayoff1")).isSelected());
		  System.out.println("The output of the IsEnabled :" +driver.findElement(By.id("cpayoff1")).isEnabled());
		  System.out.println("The output of the IsDisplayed :" +driver.findElement(By.id("cpayoff1")).isDisplayed()); 
		  
	  }
	  catch(Exception e) {
		  throw(e);
	  }
  }
  
  @BeforeTest
  public void beforeTest() throws InterruptedException {
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

 
  }


