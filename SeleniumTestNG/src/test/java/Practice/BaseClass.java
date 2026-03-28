package Practice;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("---Executing Before Suite---",true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("---Executing Before---",true);
	}
	
	@BeforeClass
	public void beforeClass() {
		Reporter.log("---Executing Before Class---",true);
	}
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("---Executing Before Class---",true);
	}
	//@AfterMethod
	//@AfterClass
	//@AfterTest

}
