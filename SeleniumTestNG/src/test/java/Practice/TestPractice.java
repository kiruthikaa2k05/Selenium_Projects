package Practice;

import org.testng.annotations.Test;

public class TestPractice {
	
	@Test
	
	public void TestMethod() {
		System.out.println("----Executing Test Method----");
	}
	
	@Test
	public void loginTest() {
		System.out.println("---Executing Login----");
	}
	
	@Test(dependsOnMethods = "loginTest")
	public void logoutTest() {
		System.out.println("---Executing logout----");
	}

}
