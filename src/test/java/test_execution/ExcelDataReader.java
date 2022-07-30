package test_execution;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExcelDataReader {
	
	@Test
	public void test_read() throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		String path = "C:\\Users\\Yogesh Sirsath\\eclipse-workspace\\Batch_11\\TestData\\Data.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
		String textdata = wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		String textdata1 = wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
		
		System.out.println(textdata);
		System.out.println(textdata1);
		
		WebElement email = driver.findElement(By.name("email"));
		WebElement password = driver.findElement(By.name("pass"));
		email.sendKeys(textdata);
		password.sendKeys(textdata1);
	}

}
