package com.Utility;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	   XSSFWorkbook wb;
	public ExcelDataProvider() throws Exception {
		String excelpath="C:\\Users\\Dell\\eclipse-workspace\\BatchSep_OctDSS\\TestData\\Data.xlsx";
		File src=new File(excelpath);
		FileInputStream file=new FileInputStream(src);
		
		wb=new XSSFWorkbook(file);
		
	}
	public String getStringData(String sheetname,int row,int cell) {
		return wb.getSheet(sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
	public String getNumericData(String sheetname,int row,int cell) {
		double data=wb.getSheet(sheetname).getRow(row).getCell(cell).getNumericCellValue();
		String datastring=Double.toString(data).replace(".0", "");
		return datastring;
	}
}
