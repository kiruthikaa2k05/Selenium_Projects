package SwagLabs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import ObjectRepository.BaseClass;
import ObjectRepository.LoginPage;

public class LoginTest  extends BaseClass{
	
	@Test
	public void login() {
		
		//navigating to the application
		driver.get("https://www.saucedemo.com/");
	LoginPage lp=new LoginPage(driver);
	//username
	lp.enterUserName("standard_user");
	lp.enterPassword("secret_sauce");
	lp.clickLogin();
}
}
