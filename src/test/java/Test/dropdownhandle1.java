package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdownhandle1 {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Test");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("abcd");
		
		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("1234567890");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("Test_0009@gmail.com");
		driver.findElement(By.xpath("//input[@name='address1']")).sendKeys("Test_xyz");
		driver.findElement(By.xpath("//input[@name='city']")).sendKeys("pune");
		driver.findElement(By.xpath("//input[@name='state']")).sendKeys("Maharashtra");
		driver.findElement(By.xpath("//input[@name='postalCode']")).sendKeys("431001");
		
		WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
		Select select=new Select(drp_country);
		select.selectByVisibleText("INDIA");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("xyz");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@name='confirmPassword']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		take_screenshot.getCapture(driver);
		Thread.sleep(4000);
		driver.close();
		
	}

}
