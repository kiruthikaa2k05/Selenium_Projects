package com.orangehrm.seleniumiuframwork.generic_utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;
import com.orangehrm.seleniumuiframework.object_repository.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;
@Listeners(com.orangehrm.seleniumiuframwork.generic_utility.ListenersImplementation.class)
public class BaseClass_Propertites {
	
	public WebDriver driver;
	public FileInputStream fis;
	public Properties prop;
	private String Browser;
	WebDriverUtility wdu;
    FileUtility fiu=new FileUtility();
	DashBoardPage dsp;
	LoginPage lp;
	
	@BeforeSuite

	public void configBeforeSuite() {
		Reporter.log("Executing beforeSuite ",true);
	}
	
	@BeforeTest
    public void configBeforeTest() {
		Reporter.log("Executing  beforeTest" ,true);
		
	}

    @Parameters("BROWSER")
	@BeforeClass(groups={"Regression","Smoke"})
    public void configBeforeClass() throws IOException {
		Reporter.log("----Launching the browser----");
		  
		   //loading the files using  file handling
		
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			options.addArguments("--incognito");
			
			
		     //browser=prop.getProperty("browser");
			Browser=fiu.getPropertyKeyValue("browser");
			
			if(Browser.contains("chrome"))
			{
				driver=new ChromeDriver(options);
			}
			else if(Browser.contains("firefox"))
			{
				driver=new FirefoxDriver();
				
			}
			else if(Browser.contains("edge"))
			{
				driver=new EdgeDriver();
				
			}
			
			dsp=new DashBoardPage(driver);
			lp=new LoginPage(driver);
			wdu=new WebDriverUtility(driver);
			wdu.cofigMinimizedBrowser();
			wdu.waitForElementsToLoad(30);
//			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//			driver.manage().window().maximize();
		
	}
	

	@BeforeMethod
    public void configBeforeMethod() throws IOException {
		Reporter.log("-----navigating to webpage and logging in------",true);
		 
		  
		  
		  String Url=fiu.getPropertyKeyValue("url");
		  String ValidUserName=fiu.getPropertyKeyValue("username");
		  String ValidPassword=fiu.getPropertyKeyValue("password");
		  
		  //login
		  //driver.get(URL);
		  wdu.navigateToApplication(Url);
		  lp.login(ValidUserName, ValidPassword);
	}
	
	
	@AfterMethod
	public void configAfterMethod() {
		Reporter.log("----Logging out-----",true);
		//dsp.logout();
	}
	
	
	@AfterClass
	public void configAfterClass() {
		Reporter.log("----Quiting the tab-----",true);
		//driver.quit();
		//wdu.quitTab();
	}
	
	
	@AfterTest
	public void configAfterTest() {
		Reporter.log("Executing afterTest",true);
	}
	
	
	@AfterSuite
	public void configAfterSuite() {
		Reporter.log("Executing afterSuite",true);
	}
	

}
