package SELENIUM_BASICS;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	 public static XSSFSheet ExcelWSheet;
	 public static XSSFWorkbook ExcelWBook;
	 public static XSSFCell Cell;
	 public static XSSFRow Row;
	 
//This method is to set the file path and to open the excel files,pass excel path and sheet name as arguments to this method
	 
	 public ReadDataFromExcel(String Path,String SheetName) throws Exception {
		 try {
			 //open the excel file
			 FileInputStream ExcelFile = new FileInputStream(Path);
			 //Access the required test data sheet
			 ExcelWBook = new XSSFWorkbook(ExcelFile);
			 ExcelWSheet = ExcelWBook.getSheet(SheetName);
		 }catch (Exception e) {
			 throw (e);
		 }
		 
	 }
	 //This method is to read the test data from excel cell,in this we are passing parameters as row num and col num
	 
	 public String getCellData(int RowNum, int ColNum) throws Exception{
		 try {
			 Cell = ExcelWSheet.getRow(RowNum).getCell(ColNum);
			 String CellData = Cell.getStringCellValue();
			 //System.out.println("CellData:"+CellData");
			 return CellData;
		 }catch (Exception e) {
			 return "";		 }
		 
		 
	 }
			public static void main(String[] args) throws Exception {
				 ReadDataFromExcel dd = new ReadDataFromExcel ("C:\\software2\\xcel\\Book1.xlsx","Sheet1");
		 
		 System.out.println(dd.getCellData(0, 0)+" : "+ dd.getCellData(0, 1)+ "\n");
		 System.out.println(dd.getCellData(1, 0)+" : "+ dd.getCellData(1, 1)+ "\n");
		 System.out.println(dd.getCellData(2, 0)+" : "+ dd.getCellData(2, 1)+ "\n");
			}

	 }
	 
	


