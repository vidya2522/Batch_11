package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_dropdownhandle {

	public static void main(String[] args) throws Exception {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/newtours/register.php");
		driver.manage().window().maximize();
		WebElement drp_country=driver.findElement(By.xpath("//select[@name='country']"));
		
		Select sl=new Select(drp_country);
		System.out.println(sl.getFirstSelectedOption().getText());
		sl.selectByIndex(5);
		Thread.sleep(2000);
		
		sl.selectByValue("ANDORRA");
		Thread.sleep(2000);
		
		sl.selectByVisibleText("ANTIGUA AND BARBUDA");
		System.out.println(sl.getFirstSelectedOption().getText());
		
		List<WebElement>list=sl.getOptions();
		for(int i=0;i<list.size();i++) {
			Thread.sleep(3000);
			String value=list.get(i).getText();
			System.out.println(value);
			
			if(value.equals("ANTIGUA AND BARBUDA")) {
				
				sl.selectByVisibleText("ANTIGUA AND BARBUDA");
				break;
			}
		}
		
		custom_handleDropDown(drp_country,"ANDORRA");
	}
		public static void custom_handleDropDown(WebElement element,String text) {
			
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
			
		}
		
	}


