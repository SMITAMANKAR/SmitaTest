package MainProjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectsGoibioFlight {
	
	private static WebElement element = null;
	
	 
	//number source box
	
	public static WebElement source(WebDriver driver) {                                  
		element = driver.findElement(By.xpath("//*[@id='gosuggest_inputSrc']"));
		return element;
	}
	
	//number destination  box
	
		public static WebElement destination(WebDriver driver) {
			element = driver.findElement(By.xpath(" //*[@id='gosuggest_inputDest']"));
			return element;
		}
		
		//number date  box                            
		
		public static WebElement date(WebDriver driver) {
			element = driver.findElement(By.xpath("//*[@id='fare_20181025']"));
			return element;
		}
		
		//number getsetgo  box                            
		
				public static WebElement getsetgo(WebDriver driver) {
					element = driver.findElement(By.xpath("//*[@id='gi_search_btn']"));
					return element;
				}
				
				
		
		
		
}
