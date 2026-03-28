package com.swaglabs.seleniumuiframwork.test;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.LoginPage;
import com.swaglabs.seleniumuiframwork.practice.HomePage;
import com.swaglabs.seleniumuiframwork.practice.SwagLabsLoginPage;
import com.swaglabs.seleniumuiframwork.practice.addToCartPage;

public class addNewEmployee {
	
	WebDriver driver;
	
	@Test
	public void addNewEmp() {
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		SwagLabsLoginPage lp=new SwagLabsLoginPage(driver);
		HomePage hp=new HomePage(driver);
		addToCartPage atcp=new addToCartPage(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.saucedemo.com/");
		
		//login
		lp.loginCredentails("standard_user", "secret_sauce");
		//adding product to cart
		hp.clickAddProductToCart();
		//clicking cart button
		hp.clickCartButton();
		//removing product from cart
		atcp.clickRemovefromCart();
//		//clikcing continue shopping
//		atcp.clickCheckOut();
//		//logout
//		hp.clickLogOut();
		atcp.clickMenuButton();
		//logout 
		//atcp.clickLogOut();
		
		
	}

}
