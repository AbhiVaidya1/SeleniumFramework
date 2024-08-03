package utils;
//How to create Excel Data Provider function
//Step1: Create a new class ExcelDataProvider
//Step2: Create method and create object for ExcelUtilsNotHardCoded
//Step3: Get row and column count
//Step4: Run a loop to get all date in an Object Array
//Note: This Class has ERRORS and CODE is INCOMPLETE, Refer 22 Course from FrameworkFrom Scratch Raghav
public class ExcelDataProvider {
	
	public static void main(String[] args) {
		String excelPath = "E:\\Study\\WorkSpace_Eclipse\\StepByStep\\excel\\data.xlsx";
		testData(excelPath, "Sheet1");
	}
	
	public static void testData(String excelPath, String sheetName) {
		ExcelUtilsNotHardCoded excel = new ExcelUtilsNotHardCoded(excelPath	, sheetName);
		
		int rowCount = excel.getRowCount();
		int colCount = excel.getColCount();
		
		Object data[][] = new Object[rowCount-1][colCount];
		
		for(int i=1;i<rowCount;i++)
		{
			for(int j=0;j<colCount;j++)
			{
				String cellData = excel.getCellDataString(i, j);
				System.out.print(cellData+ " ");
			}
			System.out.println();
		}
	}

}
