package mylearn7;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExcelHomeWork {
	@Test
	public void Exceldata() throws IOException{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Geetha Natarajan\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		File loc =  new File ("E:\\SearchData.xlsx");
		FileInputStream fin = new FileInputStream (loc);
		Workbook wb= new XSSFWorkbook (fin);
		Sheet sh = wb.getSheet("Sheet1");
		//for (int i=0; i<=sh.getPhysicalNumberOfRows(); i++) {
			//Row eachrow = sh.getRow(i);	
		//for (int j=0; j<=eachrow.getPhysicalNumberOfCells();j++) {
			//Cell cd = eachrow.getCell(j);
			//String output= cd.getStringCellValue();
		
		String s0= sh.getRow(0).getCell(0).getStringCellValue();
		String s1= sh.getRow(1).getCell(0).getStringCellValue();
		String s2= sh.getRow(2).getCell(0).getStringCellValue();
		String s3= sh.getRow(3).getCell(0).getStringCellValue();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(s0);
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(s1);
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(s2);
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(s3);
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		driver.findElement(By.id("twotabsearchtextbox")).clear();
		/*driver.findElement(By.id("twotabsearchtextbox")).sendKeys();
		for (int i=0; i<=sh.getPhysicalNumberOfRows(); i++) {
			Row eachrow = sh.getRow(i);
			
		}*/
}
}


	


