package com.swaglabs.seleniumiuframework.generic_utility;

import org.openqa.selenium.WebDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.swaglabs.seleniumuiframework.object_repository.LoginPage;

public class BaseClass_SwagLabs {
	
	public WebDriver driver;
	
	@BeforeSuite
	public void configBeforeSuite() {
		Reporter.log("Executing beforeSuite ",true);
	}
	
	@BeforeTest
	public void configBeforeTest() {
		Reporter.log("Executing BeforeTest",true);
	}
	
	@BeforeClass
	public void configBeforeClass() {
		Reporter.log("------ Launching Browser  -----");

		
		//logging the browser
		LoginPage lp=new LoginPage(driver);
		
		
	}

}
