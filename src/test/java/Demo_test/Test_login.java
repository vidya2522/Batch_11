package Demo_test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import PageObject.LoginPom;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_login {

	@Test
	public void Test_1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		login.getTxt_email().sendKeys("Test1");
		login.getTxt_password().sendKeys("12345");
		login.getBtn_login().click();
		
	}
}
