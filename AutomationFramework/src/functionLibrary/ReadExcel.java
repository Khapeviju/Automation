package functionLibrary;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
	public static void main(String[] args) throws IOException {
		
		// reach till file
		File file =    new File("F:\\DST\\SBL electronics\\Test_case_Report.xlsx"); //F:\DST\SBL electronics\Test_case_Report
		FileInputStream inputStream = new FileInputStream(file);
		
		
		// opem workbook
		XSSFWorkbook wb=new XSSFWorkbook(inputStream);
		
		// Go to sheet via index or name
		//XSSFSheet sheet1=wb.getSheetAt(1);
		XSSFSheet sheet1 = wb.getSheet("Sheet1");
		
		// how many rows are occupied
		int lastRow = sheet1.getLastRowNum();
		System.out.println(lastRow);
		
		// how many columns are occupied in first row
		int lastColumn=sheet1.getRow(1).getLastCellNum();
		System.out.println(lastColumn);
		
		// Get Row and cells
		XSSFRow row1=sheet1.getRow(0);		
		XSSFCell cell1 =row1.getCell(0);		
		 System.out.println(cell1);
		
		
		
	}

}
