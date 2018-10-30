package SELENIUM_BASICS;

public class ReadExcelData {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
 ReadDataFromExcel dd = new ReadDataFromExcel ("C:\\software2\\xcel\\Book1.xlsx","Sheet1");
 //System.out.println("The row count is " + dd.Get_Excel_Rows());
 
 System.out.println(dd.getCellData(0, 0)+" : "+ dd.getCellData(0, 1)+ "\n");
 System.out.println(dd.getCellData(1, 0)+" : "+ dd.getCellData(1, 1)+ "\n");
 System.out.println(dd.getCellData(2, 0)+" : "+ dd.getCellData(2, 1)+ "\n");
	}

}
