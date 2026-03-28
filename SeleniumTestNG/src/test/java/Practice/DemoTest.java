package Practice;

import java.lang.reflect.Method;

import org.testng.annotations.Test;

import GenericUtility.DemoBaseClass;

public class DemoTest  extends DemoBaseClass{
	
	@Test(priority =-5)
	public void logIn(Method m1) {
             System.out.println("Executing " + m1);		
	}
	
	@Test(priority = 1,dependsOnMethods = "logIn")
	public void addEmployee(Method m2) {
             System.out.println("Executing " + m2);		
	}
	
	@Test(priority = 3,dependsOnMethods = "logIn")
	public void logOut(Method m3) {
             System.out.println("Executing " + m3);		
	}

}
