package test_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNG_Baseclass {

	WebDriver driver;
	@Parameters({"BrowserName"})
	@BeforeMethod
	public void BM(String BrowserName) {
		
		if(BrowserName.equalsIgnoreCase("Chrome")) {
			
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		}
		else if(BrowserName.equalsIgnoreCase("Firefox")) {
		
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
	}
	
	
	@AfterMethod
	public void AM() {
		
		driver.close();
	}
}

