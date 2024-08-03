package utils;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

//This is extended class of ExcelUtil to understand how to call excel functions
//Step1: In all excel functions/methods get rowNum and colNum as parameters
//Step2: Create a constructor
//Step3: parameterize constructor
//Step4: Create new class to call excel functions

public class ExcelUtilsNotHardCoded {
	static XSSFWorkbook workbook;
	static XSSFSheet sheet;

	// Contructor
	public ExcelUtilsNotHardCoded(String excelPath, String sheetName) {
		try {
			workbook = new XSSFWorkbook(excelPath);
			sheet = workbook.getSheet(sheetName);
		} catch (Exception e) {
			
			e.printStackTrace();
		}

	}

//	public static void main(String[] args) {
//		// getRowCount();
//		//getCellDataString(0, 0);
//		//getCellDataNumber(1, 1);
//
//	}

	public static int getRowCount() {
		int rowCount=0;
		try {

			rowCount = sheet.getPhysicalNumberOfRows();
			System.out.println("No.of rows: " + rowCount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return rowCount;
	}
	public static int getColCount() {
		int colCount=0;
		try {
		XSSFWorkbook workbook = new XSSFWorkbook("E:\\Study\\WorkSpace_Eclipse\\StepByStep\\excel\\data.xlsx");
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		colCount = sheet.getRow(0).getPhysicalNumberOfCells();
		System.out.println("No.of columns: "+colCount);
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colCount;
	}

	public String getCellDataString(int rowNum, int colNum) {
		String cellData=null;
		try {

			cellData = sheet.getRow(rowNum).getCell(colNum).getStringCellValue();
			System.out.println("Cell value: " + cellData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		
		return cellData;
	}

	public static double getCellDataNumber(int rowNum, int colNum) {
		
		try {

			double cellData = sheet.getRow(rowNum).getCell(colNum).getNumericCellValue();
			System.out.println("Cell value: " + cellData);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e.getCause());
			e.printStackTrace();
		}
		return colNum;
	}

}
