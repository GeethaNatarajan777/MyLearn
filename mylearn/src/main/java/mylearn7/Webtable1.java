package mylearn7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//to fetch the webtable data

public class Webtable1 {
	
	public static void Main (String args []) {
		System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\Geetha Natarajan\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.toolsqa.com/automation-practice-table/");
		List <WebElement> tablerows = driver.findElements(By.xpath("//table//tr"));
		for (WebElement rows:tablerows) {
			List <WebElement> celldata= driver.findElements(By.xpath(".//td"));
			for (WebElement cell:celldata) {
				System.out.println(cell);
			}
		}
		
	}

}
