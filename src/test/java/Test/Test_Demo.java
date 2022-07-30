package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Demo {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///E:/HTML21/loginform.html");
		driver.manage().window().maximize();
		
		driver.findElement(By.name("uname")).sendKeys("admin");
		driver.findElement(By.name("pass")).sendKeys("1234");
		
		driver.findElement(By.xpath("Login")).click();

	}

}
