package TestNG;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import PropertyFileReader.PropertyFileReader;

public class PropertyFileTest {
	
	public PropertyFileReader datafile;
	public String workingDir = "C:\\Users\\Ketan\\eclipse-workspace\\SELENIUM";
	WebDriver driver;
	public String URL;
	
  @Test
  public void Llogin() {
	  datafile = new PropertyFileReader(workingDir + "\\config\\Configuration.properties");
	  
	  // Create a new instance of  chrome driver
	  driver = new ChromeDriver();
	  URL = datafile.getData("url");
	  System.out.println("url" + URL);
	  driver.get(URL);
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
	  
	  WebElement userid = driver.findElement(By.xpath(".//input[@name='user_namae']"));
	  System.out.println(userid.isEnabled());
	  userid.click();
	  //System.out.println(passwrd.isEnabled());
	  userid.sendKeys(datafile.getData("username"));
	  
	  //Get the password element
	  
	  WebElement passwd = driver.findElement(By.xpath(".//input[@name='password']"));
	  System.out.println(passwd.isEnabled());
	  passwd.click();
	  System.out.println(passwd.isEnabled());
	  passwd.sendKeys(datafile.getData("password"));
	  
	  driver.findElement(By.xpath(".//input[@name='Submit']")).click();
	  
	  driver.quit();	 
  }
}
