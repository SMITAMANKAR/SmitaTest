package MainProjects;

import java.io.BufferedWriter;
import java.io.File;
//import java.io.File;
//import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Switchcase_StoreDataInFile {
	public static void main(String[] args) throws InterruptedException, IOException {
		int n;
		WebDriver driver = new ChromeDriver();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		Actions action = new Actions(driver);
	

		// webdriver commands
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://www.studyguideindia.com/Colleges/default.asp?ct=163");

		System.out.println("URL opened sucessfully!");
		TakeSnapshot(driver, "C:\\software2\\clglist\\testsnap\\snap11.jpg");
		// Accept case no
		System.out.println("Enter case: ");
		n = sc.nextInt();
		// Mouse hover
		WebElement element = driver.findElement(By.xpath("//a[text()='Colleges']"));

		// switch case to select options
		switch (n) {
		case 1:

			String filepath = "C:\\software2\\clglist\\testfile\\sel1.txt";
			BufferedWriter bufferwrt = CreateFile(filepath);

			action.moveToElement(element).moveToElement(driver.findElement(By.xpath("//a[@title='Arts & Science Colleges']"))).click().build().perform();
			Thread.sleep(4000);
			System.out.println("Opened Arts & Science Colleges Page Successfully ! ");
			List rows = driver.findElements(By.xpath("//table[@class='clg-listing']/tbody/tr"));
			for (int j = 1; j < rows.size(); j = j + 1) {
				String collegename = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[1]")).getText();
				String district = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[2]")).getText();
				String state = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[3]")).getText();

				bufferwrt.write(collegename);
				bufferwrt.newLine();
				bufferwrt.write(district);
				bufferwrt.newLine();
				bufferwrt.write(state);
				bufferwrt.newLine();
				bufferwrt.write("____________________________________________________________________________");
				bufferwrt.newLine();

				System.out.println("College name: " + collegename);
				System.out.println("District: " + district);
				System.out.println("State: " + state);
				System.out.println("_____________________________________________________________________");

				TakeSnapshot(driver, "C:\\software2\\clglist\\testsnap\\snap1.jpg");
			}

			bufferwrt.close();
			driver.navigate().back();
		
		case 2:
			
			String filepath2 = "C:\\software2\\clglist\\testfile\\text2.txt";
			BufferedWriter bufferwrt2 = CreateFile(filepath2);

			
			action.moveToElement(element).moveToElement(driver.findElement(By.xpath("//a[@title=\"Universities in India\"]"))).click().build().perform();
			Thread.sleep(4000);
			System.out.println("Opened Universities in India Page Successfully ! ");
			List row2 = driver.findElements(By.xpath("//table[@class='clg-listing']/tbody/tr"));
			for (int j = 1; j < row2.size(); j = j + 1) {
				String collegename = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[1]")).getText();
				String district = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[2]")).getText();
				String state = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[3]")).getText();
				
				bufferwrt2.write(collegename);
				bufferwrt2.newLine();
				bufferwrt2.write(district);
				bufferwrt2.newLine();
				bufferwrt2.write(state);
				bufferwrt2.newLine();
				bufferwrt2.write("____________________________________________________________________________");
				bufferwrt2.newLine();
				
				System.out.println("College name: " + collegename);
				System.out.println("District: " + district);
				System.out.println("State: " + state);
				System.out.println("_____________________________________________________________________");
				TakeSnapshot(driver, "C:\\software2\\clglist\\testsnap\\snap2.jpg");
			}
			bufferwrt2.close();
			driver.navigate().back();
		
		case 3:
			
			String filepath3 = "C:\\software2\\clglist\\testfile\\text3.txt";
			BufferedWriter bufferwrt3 = CreateFile(filepath3);
			
			action.moveToElement(element).moveToElement(driver.findElement(By.xpath("//a[@title=\"Engineering Colleges\"]"))).click().build().perform();
			Thread.sleep(4000);
			System.out.println("Opened Engineering Colleges Page Successfully ! ");
			List row3 = driver.findElements(By.xpath("//table[@class='clg-listing']/tbody/tr"));
			
			for (int j = 1; j < row3.size(); j = j + 1) {
				String collegename = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[1]")).getText();
				String district = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[2]")).getText();
				String state = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[3]")).getText();
			
				
				bufferwrt3.write(collegename);
				bufferwrt3.newLine();
				bufferwrt3.write(district);
				bufferwrt3.newLine();
				bufferwrt3.write(state);
				bufferwrt3.newLine();
				bufferwrt3.write("____________________________________________________________________________");
				bufferwrt3.newLine();
				
				System.out.println("College name: " + collegename);
				System.out.println("District: " + district);
				System.out.println("State: " + state);
				System.out.println("_____________________________________________________________________");
				TakeSnapshot(driver, "C:\\software2\\clglist\\testsnap\\snap3.jpg");
			}
			bufferwrt3.close();
			driver.navigate().back();
	
		case 4:
			
			String filepath4 = "C:\\software2\\clglist\\testfile\\text4.txt";
			BufferedWriter bufferwrt4 = CreateFile(filepath4);
			
			action.moveToElement(element).moveToElement(driver.findElement(By.xpath("//a[@title=\"Management Colleges\"]"))).click().build().perform();
			Thread.sleep(4000);
			System.out.println("Opened Management Colleges Page Successfully ! ");
			List row4 = driver.findElements(By.xpath("//table[@class='clg-listing']/tbody/tr"));
			
			for (int j = 1; j < row4.size(); j = j + 1) {
				String collegename = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[1]")).getText();
				String district = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[2]")).getText();
				String state = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[" + j + "]/td[3]")).getText();
				
				bufferwrt4.write(collegename);
				bufferwrt4.newLine();
				bufferwrt4.write(district);
				bufferwrt4.newLine();
				bufferwrt4.write(state);
				bufferwrt4.newLine();
				bufferwrt4.write("____________________________________________________________________________");
				bufferwrt4.newLine();
				
				System.out.println("College name: " + collegename);
				System.out.println("District: " + district);
				System.out.println("State: " + state);
				System.out.println("_____________________________________________________________________");
				TakeSnapshot(driver, "C:\\software2\\clglist\\testsnap\\snap4.jpg");
			}
			bufferwrt4.close();
			driver.navigate().back();
		
		}
	}

	public static void TakeSnapshot(WebDriver driver, String Filepath) throws IOException {
		File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(screenshot, new File(Filepath));
	}

	public static BufferedWriter CreateFile(String Filepath) throws IOException {
		FileWriter filewriter = new FileWriter(Filepath);
		BufferedWriter bufferwrt = new BufferedWriter(filewriter);
		return bufferwrt;
	}
}
