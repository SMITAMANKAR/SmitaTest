package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderParameterClass {
	
  @Test(dataProvider="getData")
  public void loginTest(String username,String password, String ExpResult, String Browser) {
	  System.out.println(username+"|"+password+"|"+ExpResult+"|"+Browser);
  
  }
  
  @DataProvider
  public Object[][] getData(){
	  Object[][] data = new Object[3][4];
	
	  //1st row
	  data[0][0] = "U1";
	  data[0][1] = "P1";
	  data[0][2] = "PASS";
	  data[0][3] = "MOZILLA";
	  
	//2st row
	  data[1][0] = "U2";
	  data[1][1] = "P2";
	  data[1][2] = "FAIL";
	  data[1][3] = "CHROME";
	  
	//3st row
	  data[2][0] = "U3";
	  data[2][1] = "P3";
	  data[2][2] = "PASS";
	  data[2][3] = "IE";
	  
	  return data;
	  
  }
  
  
}
