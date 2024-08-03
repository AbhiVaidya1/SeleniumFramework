package utils;

public class NewClassforExcelUtilsNHC {

	public static void main(String[] args) {
		
		ExcelUtilsNotHardCoded excel = new ExcelUtilsNotHardCoded("E:\\Study\\WorkSpace_Eclipse\\StepByStep\\excel\\data.xlsx", "Sheet1");
		excel.getRowCount();
		excel.getColCount();
		excel.getCellDataString(0, 0);
		excel.getCellDataNumber(1,1);
	}

}
