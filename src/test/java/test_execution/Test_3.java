package test_execution;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_3 {
	
	@Test(priority=1,invocationCount=2)
	public void m1() {
		
		System.out.println("m1 Test");
	}
	
	@Test(priority=-1,enabled=false)
	public void m2() {
		
		System.out.println("m2 Test");

	}
	
	@Test(priority=0)
	public void m3() {
		
		System.out.println("m3 Test");
		Assert.assertTrue(false);
	}

 	@Test(priority=0,dependsOnMethods= {"m3"})
    public void m4() {
		
		System.out.println("m4 Test");
	}

}
