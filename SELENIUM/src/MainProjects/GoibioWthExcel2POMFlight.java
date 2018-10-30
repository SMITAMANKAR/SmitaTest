package MainProjects;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import SELENIUM_BASICS.ReadDataFromExcel;

public class GoibioWthExcel2POMFlight {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub


		WebDriver driver = new ChromeDriver();
		
		// webdriver commands
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.goibibo.com");
		
		driver.findElement(By.xpath("//*[text()='Flights']")).click();
		Thread.sleep(3000);
		
		
		
ReadDataFromExcel obj = new ReadDataFromExcel ("C:\\software2\\Gibio\\goibo1.xlsx","Sheet1");
	    
		String per1 = obj.getCellData(1,1);
		String per2 = obj.getCellData(2,1);
		String per3 = obj.getCellData(3,1);
		
		String val1 = obj.getCellData(1,2);
		String val2 = obj.getCellData(2,2);
		String val3 = obj.getCellData(3,2);
		
		String result1 = obj.getCellData(1,3);
		String result2 = obj.getCellData(2,3);
		String result3 = obj.getCellData(3,3);
		
		System.out.println("Per1:" +per1);
		
		ArrayList<String> Per_list = new ArrayList<String>();
		Per_list.add(per1);
		Per_list.add(per2);
		Per_list.add(per3);
		
		System.out.println("Per_list:"+Per_list);
		
		
		ArrayList<String> val_list = new ArrayList<String>();
		val_list.add(val1);
		val_list.add(val2);
		val_list.add(val3);
		
		System.out.println("val_list:"+val_list);
		
		ArrayList<String> result_list = new ArrayList<String>();
		result_list.add(result1);
		result_list.add(result2);
		result_list.add(result3);
		
		System.out.println("result_list:"+result_list);
		
		try {
			for(int i=0; i<=Per_list.size(); i = i+1) {
				 Thread.sleep(5000);
					
				 
					PageObjectsGoibioFlight.source(driver).clear();
					PageObjectsGoibioFlight.source(driver).sendKeys(Per_list.get(i));
					Thread.sleep(3000);
					
					PageObjectsGoibioFlight.source(driver).sendKeys(Keys.RETURN);
					
					
					

					PageObjectsGoibioFlight.destination(driver).clear();
					PageObjectsGoibioFlight.destination(driver).sendKeys(val_list.get(i));
					Thread.sleep(3000);
					PageObjectsGoibioFlight.destination(driver).sendKeys(Keys.RETURN);
					
					
					PageObjectsGoibioFlight.date(driver).clear();
					PageObjectsGoibioFlight.date(driver).sendKeys(val_list.get(i));
					Thread.sleep(3000);
					
					PageObjectsGoibioFlight.getsetgo(driver).clear();
					PageObjectsGoibioFlight.getsetgo(driver).sendKeys(val_list.get(i));
					Thread.sleep(3000);
					
					
					File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(screenshot, new File("C:\\software2\\Goibiosnappom\\flightwithExcel.jpg"));
							
			}					
					
			
		}
		catch (Exception e) {
				
			driver.close();
			throw (e);
			}
		driver.close();
		}
		
				
		
		
		
		
		
}