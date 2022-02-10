package functionLibrary;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteInExcel {
	public static void main(String[] args) throws IOException {
		
		String path = "F:\\\\DST\\\\SBL electronics\\\\Test_case_Report.xlsx ";
		FileInputStream fis = new FileInputStream(path);
		Workbook workbook = new XSSFWorkbook(fis);
		Sheet sheet = workbook.getSheetAt(0);
		Row row = sheet.getRow(0);
		Cell cell = row.createCell(2);
		cell.setCellValue("SeleniumWrite...");
		FileOutputStream fos = new FileOutputStream(path);
		workbook.write(fos);
		fos.close();
		System.out.println("programme done");
	}
	

}
