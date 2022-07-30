package test_execution;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test_SoftAssert {

	@Test
	public void P1() {
		
		SoftAssert soft = new SoftAssert(); //Soft Assert or Verify
		
		System.out.println("Username");
		System.out.println("Password");		
		System.out.println("Login button");
		String Expectedtitle="Test";
		String Actualtitle="Test1";
		
		soft.assertEquals(Actualtitle, Expectedtitle);
		
		System.out.println("Browser close");
		soft.assertAll();
		
	}
}
