package demo_testNG;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class test_loginpg {
	
	@BeforeMethod
	public void test_1() {
		
		System.out.println("Test 1");
		
	}
	
	@Test
	public void Test_001()
	{
		System.out.println("First test");
		
	}

}
