package SELENIUM_BASICS;

import java.awt.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CollegeList {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		System.out.println("Please select any option");
		System.out.println("1: Handle Alert");
		System.out.println("2: Handle Table");
		System.out.println("3: Handle iframe");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://www.studyguideindia.com/Colleges/default.asp?ct=163");
	
		System.out.println("URL open successfully");
		
		Scanner input= new Scanner (System.in);
		Integer choice = input.nextInt();
		
		switch(choice)
		{
			case 1: 
				System.out.println("First case");
			
				//Alert Message Handling
				driver.get("file://E://SELENIUM_JAVA//SELENIUM//FileAcess//Newfile.html");
				
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//button[text()='Try It']")).click();
				
				//switch to alert
				Alert alert= driver.switchTo().alert();
				
				//capture alert msg
				String alertMessage= driver.switchTo().alert().getText();
				
				//Displaying alert msg
				
				System.out.println(alertMessage);
				Thread.sleep(5000);
				
				
				//accepting alert
				alert.accept();
				driver.close();
			
		case 2:
				
		//No. of Columns
		java.util.List<WebElement> col = driver.findElements(By.xpath("//table[@class='clg-listing']/tbody/tr[1]/td"));
		System.out.println("No of cols are :" +col.size());
		
		//No. of rows
		java.util.List<WebElement> rows =driver.findElements(By.xpath("//table[@class'clg-listing']/tbody/tr"));
		System.out.println("No of rows are :" +rows.size());
		
		for (int i=1;i<=col.size();i=i+1)
			
		{
			String colval = driver.findElement(By.xpath("//table[@class='clg-listing']/tbody/tr[1]/td["+i+"]")).getText();
			System.out.println("col_value : "+colval);
		}
		System.out.println("########################");
		
		for (int i=2;i<= rows.size();i=i+1)
		{
			String collegeName = driver.findElement(By.xpath("//table[@class= 'clg-listing']/tbody/tr["+i+"]/td[1]")).getText();
			String Location = driver.findElement(By.xpath("//table[@class= 'clg-listing']/tbody/tr["+i+"]/td[2]")).getText();
			String State = driver.findElement(By.xpath("//table[@class= 'clg-listing']/tbody/tr["+i+"]/td[3]")).getText();
			
			System.out.println("College :"+collegeName);
			System.out.println("Location :"+Location);
			System.out.println("State :"+State);
		}
		driver.close();
		break;
		
			case 3:
				 System.out.println("Second case");
		break;
		
		}	


		
		
	}
}
	


