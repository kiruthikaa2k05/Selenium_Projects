package com.orangehrm.seleniumiuframwork.generic_utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
	
	public WebDriver driver;
	@BeforeSuite

	public void beforeSuite() {
		Reporter.log("Executing beforeSuite ",true);
	}
	
	@BeforeTest
    public void beforeTest() {
		Reporter.log("Executing  beforeTest" ,true);
		
	}


	@BeforeClass
    public void beforeClass() {
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	
		Reporter.log("Executing beforeClass");
		
	}
	

	@BeforeMethod
    public void beforeMethod() {
		Reporter.log("Executing beforeMethod",true);
		//login
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.cssSelector("[type='submit']")).click();
	}
	
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("Logging out",true);
	}
	
	
	@AfterClass
	public void afterClass() {
		Reporter.log("Executing afterClass",true);
		driver.quit();
	}
	
	
	@AfterTest
	public void afterTest() {
		Reporter.log("Executing afterTest",true);
	}
	
	
	@AfterSuite
	public void afterSuite() {
		Reporter.log("Executing afterSuite",true);
	}
	

}
