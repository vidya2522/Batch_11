package Test1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleAlert {

	public static void main(String[] args) throws Exception {
		
		//step1: open browser--->
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();
		
		//step2: enter the customer ID
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234567");
		
		//step3: click on submit button
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		//step4: verify text on alert
		Alert alt=driver.switchTo().alert();
		System.out.println(alt.getText());//Do you want delete this customer?
		
		//step5: click on ok button
		alt.accept();// click on ok button
		//alt.dismiss();//click on cancel button
	
		//2nd alert perform actions 
		Thread.sleep(4000);
		System.out.println(alt.getText());
		alt.accept();
	}
	

}
