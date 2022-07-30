package test_execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	public static String getStrinData(String Sheetname, int row, int cell) throws IOException  {
		
		String path = "C:\\\\Users\\\\Yogesh Sirsath\\\\eclipse-workspace\\\\Batch_11\\\\TestData\\\\Data.xlsx";
		FileInputStream fis = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		String data = wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
		return data;
		
	}
}
