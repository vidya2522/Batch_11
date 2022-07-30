package test_execution;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_ReadData {

	WebDriver driver;
	@BeforeMethod
	public void BM() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	}
	@Test
	public void test_1() throws IOException {
		
		WebElement email = driver.findElement(By.id("email"));
		String text1 = ExcelDataProvider.getStrinData("Sheet1", 0, 0);
		email.sendKeys(text1);
		WebElement password = driver.findElement(By.id("pass"));
		password.sendKeys(ExcelDataProvider.getStrinData("Sheet1", 0, 1));
		
	}
	@AfterMethod
	public void AM() {
		
		driver.quit();
		
			
		
	}
}
