package SELENIUM_BASICS;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// invokebrowser
				WebDriver driver = new ChromeDriver();
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

	}

}
