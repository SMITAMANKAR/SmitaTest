package SELENIUM_BASICS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		WebDriver driver= new ChromeDriver();
		
		//Explicit driver object
		WebDriverWait wait = new WebDriverWait(driver, 30);
		
		
		//fluent driver object
		FluentWait<WebDriver> fwait = new FluentWait<WebDriver>(driver).withTimeout(30, TimeUnit.SECONDS).pollingEvery(10, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
		
		
		//Web elements
		String GoogleSearch ="//*[@name='btnk']";
		String SearchBox= "//input[@name='q']";
		
		
		
		//Test Data
		String SearchText="WebDriver Test Successfull";
	//	System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver\\chromedriver.exe");
		
		try
		{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\supriya\\eclipse\\java-oxygen\\eclipse\\selenium_drivers\\chromedriver\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.google.com");
		
		if(driver.findElement(By.xpath(SearchBox)).isEnabled())
		{
		System.out.println("Google search textbox is enabled");
		
		//Use of fluent wait
		fwait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(SearchBox)));
		driver.findElement(By.xpath(SearchBox)).clear();
		driver.findElement(By.xpath(SearchBox)).sendKeys(SearchText);
		
		
		//static wait
		Thread.sleep(3000);
		
		
		//Use of explicit wait
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(GoogleSearch)));
		driver.findElement(By.xpath(GoogleSearch)).click();
		System.out.println("Google search Completed");
		}
		 
		else
		{
			System.out.println("Google seach text box is not enabled ");
			
		}
		
		}
		catch(Exception e)
		{
			//driver.quit();
			throw(e);
			
		}
		driver.quit();
	}

}
