package test_execution;

import org.testng.annotations.Test;

public class Test_4 {

	@Test(groups="sanity")
	public void m1() {
		System.out.println("Test m1");
	}
	@Test(groups="Regression")
	public void m2() {
		System.out.println("Test m2");
	}
	@Test(groups="sanity,Regression")
	public void m3() {
		System.out.println("Test m3");
	}
}
