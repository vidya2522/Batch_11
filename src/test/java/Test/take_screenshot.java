package Test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.utility.RandomString;

public class take_screenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/accounts/login/");
		
		
		String rm=RandomString.make(5);
		
		String path= "C:\\Users\\Yogesh Sirsath\\eclipse-workspace\\Batch_11\\screenshot";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"//"+rm+".png");
		FileUtils.copyFile(src, destn);
				
		
	}
	public static void getCapture(WebDriver driver) throws IOException {
		
		String rm=RandomString.make(5);
		
		String path= "C:\\Users\\Yogesh Sirsath\\eclipse-workspace\\Batch_11\\screenshot";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File destn=new File(path+"//"+rm+".png");
		FileUtils.copyFile(src, destn);
		
	}

}
