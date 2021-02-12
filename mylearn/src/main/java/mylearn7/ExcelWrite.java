package mylearn7;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelWrite {
		
		@Test
		public void excelWrite() throws IOException {
			File loc = new File ("E:\\Book1.xlsx");
			FileInputStream fin = new FileInputStream (loc);
			Workbook wb = new XSSFWorkbook (fin);
			Sheet sh = wb.getSheet("Sheet1");
			int RowIndex = 8;
			int CellIndex = 8;
			Row row = sh.getRow(RowIndex);
			if (row == null) {
				sh.createRow(RowIndex).createCell(CellIndex).setCellValue("Geetha");
			}else {
				sh.getRow(RowIndex).getCell(CellIndex).setCellValue("Geetha");
			}
FileOutputStream output = new FileOutputStream (loc);
wb.write(output);
}
}
