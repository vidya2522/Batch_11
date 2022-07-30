package Test1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class scrolling {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//scrolling by pixel
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,500)", "");
		//Thread.sleep(2000);
		//js.executeScript("window.scrollBy(0,-500)", "");
		
		//scrolling by Element
		WebElement english_element=driver.findElement(By.xpath("//li[text()='English (UK)']"));
		js.executeScript("arguments[0].scrollIntoView()",english_element);
		
		Thread.sleep(2000);
		//action---->
		WebElement marathi_element=driver.findElement(By.xpath("//a[@class='_sv4']"));
		js.executeScript("arguments[0].scrollIntoView()", marathi_element);
		marathi_element.click();
		
	}
	public static void getScrollIntoView_Element(WebDriver driver, WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView()", element);
		
	}

}
