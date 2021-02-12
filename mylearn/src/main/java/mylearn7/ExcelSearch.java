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

public class ExcelSearch {

//To read the excel in the column	
@Test
	public void Exceldata() throws IOException{
		File loc =  new File ("E:\\SearchData.xlsx");
		FileInputStream fin = new FileInputStream (loc);
		Workbook wb= new XSSFWorkbook (fin);
		Sheet sh = wb.getSheet("Sheet1");
		for (int i=0; i<=sh.getPhysicalNumberOfRows(); i++) {
			Row eachrow = sh.getRow(i);	
		System.out.println(eachrow.getCell(3).getStringCellValue());
			
		}
}
}
		

	
	/* To read the excel in the rows
	@Test
	public void Exceldata() throws IOException{
		File loc =  new File ("E:\\SearchData.xlsx");
		FileInputStream fin = new FileInputStream (loc);
		Workbook wb= new XSSFWorkbook (fin);
		Sheet sh = wb.getSheet("Sheet1");
		
		Cell cell=sh.getRow(2).getCell(7);
		/*Row row=sh.getRow(4);
		for (int i=0; i<row.getPhysicalNumberOfCells(); i++) {

		String text =row.getCell(i).getStringCellValue();	
		
		System.out.println(text);
		
		System.out.println(cell.getStringCellValue());
		
}}*/




