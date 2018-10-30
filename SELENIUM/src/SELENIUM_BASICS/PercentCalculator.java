package SELENIUM_BASICS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PercentCalculator {
	
	private static WebDriver driver = null;

	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.get("http://www.calculator.net/percent.calculator.html");

		//Use page object library now
		
		PageObjectsPerCalc.txt_num1(driver).clear();
		PageObjectsPerCalc.txt_num1(driver).sendKeys("10");

		PageObjectsPerCalc.txt_num2(driver).clear();
		PageObjectsPerCalc.txt_num2(driver).sendKeys("50");
		
		PageObjectsPerCalc.btn_calc(driver).click();
		String result = PageObjectsPerCalc.web_result(driver).getText();
		
		if(result.equals("5")) {
			System.out.println("Result is pass : "+result);
			}
		else {
			
			System.out.println("Result is fail : "+result);
		    }
		Thread.sleep(5000);
		 
		driver.close();

	}

}
