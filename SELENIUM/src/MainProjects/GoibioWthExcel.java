package MainProjects;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


import java.io.File;
import java.util.ArrayList;
import SELENIUM_BASICS.ReadDataFromExcel;

public class GoibioWthExcel {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new ChromeDriver();
		
		Actions action = new Actions(driver);
	

		// webdriver commands
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.goibibo.com");
		
		driver.findElement(By.xpath("//*[text()='Flights']")).click();
		Thread.sleep(3000);
		
		
		
ReadDataFromExcel obj = new ReadDataFromExcel ("C:\\software2\\Gibio\\goibo1.xlsx","Sheet1");
	    
		String src = obj.getCellData(1,1);
		String dest = obj.getCellData(1,2);
		
		System.out.println("src:" +src);
		
		ArrayList<String> src_list = new ArrayList<String>();
		src_list.add(src);
		
		
		System.out.println("src_list:"+src_list);
		

		System.out.println("dest:" +dest);
		
		
		ArrayList<String> dest_list = new ArrayList<String>();
		dest_list.add(dest);
		
		
		System.out.println("dest_list:"+dest_list);
		
		
		
		try {
			for(int i=0; i<=src_list.size(); i = i+1) {
				 Thread.sleep(5000);
		 
					driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).clear();
				
					driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys(src_list.get(i));
		
					Thread.sleep(3000);
				    
					
					driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys(Keys.RETURN);
			    	Thread.sleep(3000);
					
					
					
					driver.findElement(By.xpath("//*[@id='gosuggest_inputDest']")).sendKeys(dest_list.get(i));
					Thread.sleep(3000);
					
					
					driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']")).sendKeys(Keys.RETURN);
			    	Thread.sleep(3000);
				
					
					
					driver.findElement(By.xpath("//*[@id='fare_20181025']")).click();
					
					Thread.sleep(3000);
					
					
					driver.findElement(By.xpath("//*[@id='gi_search_btn']")).click();
					
					
					
					File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
					FileUtils.copyFile(screenshot, new File("C:\\software2\\GoibiosnapwithExcel\\flightwithExcel.jpg"));
					
					
			}					
					
			
		}
		catch (Exception e) {
				
			driver.close();
			throw (e);
			}
		driver.close();
		}
		
				
		
		
		
		
		
}