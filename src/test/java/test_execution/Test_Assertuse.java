package test_execution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_Assertuse {

	@Test
	public void A1() {
		System.out.println("Username");
		System.out.println("Password");		
		System.out.println("Login button");
		String Expectedtitle="Test";
		String Actualtitle="Test";
		
		//verify
		Assert.assertEquals(Actualtitle, Expectedtitle); //Hard Assert or Assert
		System.out.println("Browser close");
		
	}
	@Test
	public void B1() {
		
		System.out.println("B1");
	}
}
