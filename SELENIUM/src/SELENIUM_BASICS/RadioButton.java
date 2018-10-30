package SELENIUM_BASICS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
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
		
		
		
		
		
	}

}
