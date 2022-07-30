package test_execution;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class Test_1 extends Baseclass{

	@Test
	public void Test_2() {
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("test@123gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("12345");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}
	@Test
	public void Test_3() {
		
		driver.findElement(By.xpath("//a[text()='Forgotten password?']")).click();
	}
	@Test
	public void Text_4() throws Exception {
		
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,-500)", "");
		
	}
}
