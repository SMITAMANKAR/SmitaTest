package TestNG;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import SELENIUM_BASICS.PageObjectsPerCalc;
import SELENIUM_BASICS.ReadDataFromExcel;

public class TestNGMultiPackage {
	
	@BeforeTest
	public WebDriver InitiateDriver() {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
		
	}
  @Test
  public void ReadDataFromXLS() throws Exception {
	  
	  WebDriver driver = InitiateDriver();
	  
	  driver.get("http://www.calculator.net/percent.calculator.html");
	  
	//ReadDataFromExcel
			ReadDataFromExcel obj = new ReadDataFromExcel ("C:\\software2\\per.xlsx","Sheet1");
		    
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
					
					 PageObjectsPerCalc.txt_num1(driver).clear();
					 PageObjectsPerCalc.txt_num1(driver).sendKeys(Per_list.get(i));

					PageObjectsPerCalc.txt_num2(driver).clear();
					PageObjectsPerCalc.txt_num2(driver).sendKeys(val_list.get(i));
					
					PageObjectsPerCalc.btn_calc(driver).click();
					String result = PageObjectsPerCalc.web_result(driver).getText();
					
					if(result.equals(result_list.get(i))) {
						System.out.println("-------------------------------");
						System.out.println("Result is pass : "+result);
						}
					else {
						System.out.println("-------------------------------");
						System.out.println("Result is fail : "+result);
					    }
					
				}
				
			}
			catch (Exception e) {
					
				driver.close();
				throw (e);
				}
			driver.close();
  }
	 
  
  
  @Test
  public void GetCollegeNameList() throws InterruptedException
  {
  
	  WebDriver driver = InitiateDriver();
	  
	  driver.get("http://www.studyguideindia.com/Colleges/default.asp?ct=163");
	    WebElement element = driver.findElement(By.xpath("//a[text()='Colleges']"));
	    Actions action = new Actions(driver);
	    action.moveToElement(element).moveToElement(driver.findElement(By.xpath("//a[@title='Arts & Science Colleges']"))).click().build().perform();
		Thread.sleep(4000);
		System.out.println("Opened Arts & Science Colleges Page Successfully ! ");
	  List rows = driver.findElements(By.xpath("//table[@class='clg-listing']/tbody/tr"));

	for (int j = 1; j < rows.size(); j = j + 1) {
			String collegename = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[1]")).getText();
			String district = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[2]")).getText();
			String state = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[3]")).getText();
			System.out.println("College :"+collegename);
			
			System.out.println("College name: " + collegename);
			System.out.println("District: " + district);
			System.out.println("State: " + state);
			System.out.println("_____________________________________________________________________");		
	}  
	  
}
  @AfterTest
  public void CloseBrowser()
  {
	  InitiateDriver().quit();
  }
  
  
} 
  
 
  