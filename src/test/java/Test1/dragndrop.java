package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dragndrop {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
	
		Actions act = new Actions(driver);
		
		//Debit side Account
		WebElement  src = driver.findElement(By.xpath("(//a[@class='button button-orange'])[5]"));
		WebElement target = driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		act.dragAndDrop(src, target).build().perform();
		Thread.sleep(2000);	
		
		//Debit side Amount
		WebElement  src1 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement target1 = driver.findElement(By.xpath("(//div[@id='shoppingCart4'])[1]"));
		act.dragAndDrop(src1, target1).build().perform();
		Thread.sleep(2000);
		
		//Credit side Account
		WebElement src2 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[6]"));
		WebElement target2 = driver.findElement(By.xpath("//div[@id='shoppingCart3'])"));
		act.dragAndDrop(src2, target2).build().perform();
		Thread.sleep(2000);
		
		//Credit side Amount
		WebElement src3 = driver.findElement(By.xpath("(//a[@class='button button-orange'])[2]"));
		WebElement target3 = driver.findElement(By.xpath("(//div[@id='shoppingCart4'])[2]"));
		act.dragAndDrop(src3, target3).build().perform();
		Thread.sleep(2000);
		
		driver.quit();
		
		
		
		

	}

}
