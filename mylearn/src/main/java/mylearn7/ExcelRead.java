package mylearn7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelRead {
	
@Test
public void excelRead() throws IOException {
	File loc = new File ("E:\\Book1.xlsx");
	FileInputStream fin = new FileInputStream (loc);
	Workbook wb = new XSSFWorkbook (fin);
	Sheet sh = wb.getSheet("Sheet1");
	for (int i=0; i<sh.getPhysicalNumberOfRows();i++) {
		Row eachrow = sh.getRow(i);
		for (int j= 0; j<eachrow.getPhysicalNumberOfCells(); j++) {
			Cell cellData = eachrow.getCell(j);
			if (cellData.getCellType() == 0) {
				System.out.println("The celldata is"+ cellData.getNumericCellValue());
			} else if (cellData.getCellType()== 1) {
				System.out.println("The cell data is" + cellData.getStringCellValue());
			}
		}
	}
	
}


}
