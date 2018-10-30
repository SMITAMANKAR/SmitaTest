package SELENIUM_BASICS;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Basicswitchcase {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Please select any option");
		System.out.println("1: Waits");
		System.out.println("2:RadioButton");
		System.out.println("3.DropDown");
		
		Scanner input= new Scanner (System.in);
		Integer choice = input.nextInt();
		
		switch(choice)
		{
		
		case 1:
		System.out.println("First case");	
		
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
		
		break;
		
		
		case 2:
			System.out.println("Second case");	
			
			
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.navigate().to("http://calculator.net/mortgage-payoff-calculator.html");
			Thread.sleep(5000);

			
			System.out.println("The Output of the IsSelected :" + driver.findElement(By.id("cpayoff1")).isSelected());
			System.out.println("The Output of the IsEnabled :" + driver.findElement(By.id("cpayoff1")).isEnabled());
			System.out.println("The Output of the IsDisplayed :" + driver.findElement(By.id("cpayoff1")).isDisplayed());
			System.out.println("########################################################");

			boolean val = driver.findElement(By.id("cpayoff1")).isSelected();

			if (val == true) {
				System.out.println("Option already Selected");
			} 
			
			else {
				driver.findElement(By.id("cpayoff1")).click();
				boolean val2 = driver.findElement(By.id("cpayoff1")).isSelected();

				
				if (val2 == true) {
					System.out.println("Thanks you have selected the option");

				}

				else {
					System.out.println("There is issue with UI, option is enable to select");
				}

			}
			
			
			//click on radio button
			
			driver.findElement(By.id("cpayoff1"));
			Thread.sleep(5000);
			
			System.out.println("The output of Is Selected: " +driver.findElement(By.id("cpayoff1")).isSelected());
			System.out.println("The output of Is Enabled: " +driver.findElement(By.id("cpayoff1")).isEnabled());
			System.out.println("The output of Is Displayed: " +driver.findElement(By.id("cpayoff1")).isDisplayed());
			
			driver.close();
				
			break;
			
			
		case 3:
			System.out.println("Third case");
	
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			driver.navigate().to("http://calculator.net/interest-calculator.html");

			Thread.sleep(5000);

			// Dropdown by id
			Select dropdown = new Select(driver.findElement(By.id("ccompound")));

			// By text
			dropdown.selectByVisibleText("continuously");

			Thread.sleep(5000);

			// By Index value
			dropdown.selectByIndex(1);

			Thread.sleep(5000);

			// By actual Value
			dropdown.selectByValue("quarterly");

			Thread.sleep(3000);
			
			break;
		}
	}

}
