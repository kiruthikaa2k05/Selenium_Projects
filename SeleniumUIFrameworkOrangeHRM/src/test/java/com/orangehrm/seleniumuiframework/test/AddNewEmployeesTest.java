package com.orangehrm.seleniumuiframework.test;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.AddEmployeePIMPage;
import com.orangehrm.seleniumuiframework.object_repository.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;
import com.orangehrm.seleniumuiframework.object_repository.PIMPage;

public class AddNewEmployeesTest {
	
	WebDriver driver;
	@Test
	private void addNewEmployee() {
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10)) ;
		JavascriptExecutor js= (JavascriptExecutor)driver; 
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		LoginPage lp=new LoginPage(driver);
		DashBoardPage dp=new DashBoardPage(driver);
		PIMPage pim=new PIMPage(driver);
		AddEmployeePIMPage aemp=new AddEmployeePIMPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//login
		lp.login("Admin","admin123");
		
		//Pim
		dp.clickPimLink();
		pim.clickAddButton();
		//add emp
		wait.until(ExpectedConditions.elementToBeClickable(aemp.getCreateLoginDetailsButton()));
		aemp.addEmployee("abc", "mno", "z","12335");
		
		//js.executeScript("arguments[0].click()",aemp.getCreateLoginDetailsButton());
		
		//after toggle
		aemp.createCredentials("ABC","abc123","abc123");
		
	}
	

}
