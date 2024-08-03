package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//Step1: Create excel file and add some data/TD
//Step2:Create references for Workbook, XSSFWorkbook workbook = new XSSFWorkbook("excel file location");
//Step3:Create references for worksheet
//Step4: sheet.getPhysicalNumberOfRows();

public class ExcelUtils {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;
	
	public static void main(String[] args) {
		//getRowCount();
		getCellDataString();
		getCellDataNumber();
		
	}
	
	
	public static void getRowCount() {
		try {
		XSSFWorkbook workbook = new XSSFWorkbook("E:\\Study\\WorkSpace_Eclipse\\StepByStep\\excel\\data.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int rowCount = sheet.getPhysicalNumberOfRows();
		System.out.println("No.of rows: "+rowCount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void getColCount() {
		try {
		XSSFWorkbook workbook = new XSSFWorkbook("E:\\Study\\WorkSpace_Eclipse\\StepByStep\\excel\\data.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No.of rows: "+colCount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	
	public static void getCellDataString() {
		try {
		workbook = new XSSFWorkbook("E:\\Study\\WorkSpace_Eclipse\\StepByStep\\excel\\data.xlsx");
		sheet = workbook.getSheet("Sheet1");
		String cellData = sheet.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Cell value: "+cellData);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}
	public static void getCellDataNumber() {
		try {
		workbook = new XSSFWorkbook("E:\\Study\\WorkSpace_Eclipse\\StepByStep\\excel\\data.xlsx");
		sheet = workbook.getSheet("Sheet1");
		double cellData = sheet.getRow(1).getCell(1).getNumericCellValue();
		System.out.println("Cell value: "+cellData);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
	}

}
