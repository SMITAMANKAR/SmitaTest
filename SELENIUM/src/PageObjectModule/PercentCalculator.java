package PageObjectModule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PercentCalculator {

	private static WebElement element = null;
	
	 
	//number 1 text box
	
	public static WebElement txt_num1(WebDriver driver) {
		element = driver.findElement(By.id("cpar1"));
		return element;
	}
	
	//number 2 text box
	
		public static WebElement txt_num2(WebDriver driver) {
			element = driver.findElement(By.id("cpar2"));
			return element;
		}
		
		//calculate button
		
			public static WebElement btn_calc(WebDriver driver) {
				element = driver.findElement(By.xpath("(.//input[@value=\"Calculate\"])"));
				return element;
			}
			
			//Result
			
			public static WebElement web_result(WebDriver driver) {
				element = driver.findElement(By.xpath("//*[@id=\"content\"]//font/b"));
				return element;
				}
}

