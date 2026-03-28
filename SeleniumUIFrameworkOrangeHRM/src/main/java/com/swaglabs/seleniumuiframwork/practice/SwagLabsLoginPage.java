package com.swaglabs.seleniumuiframwork.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage {
	
	WebDriver driver;
	
	 public SwagLabsLoginPage( WebDriver driver) {
		 PageFactory.initElements(driver, this);
		 
	 }
	 
	//username
	@FindBy(id="user-name")
	private WebElement userName;
	//password
	@FindBy(name="password")
	private WebElement passWord;
	
	//login button
	@FindBy(name="login-button")
	private WebElement loginButton;
	

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		getUserName().sendKeys(userName);
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		getPassWord().sendKeys(passWord);
	}

	public WebElement getLoginButton() {
		return loginButton;
	}

	public void clickLoginButton() {
		getLoginButton().click();
	}
	
	
	//Business Logic
	public void loginCredentails(String username,String password) {
		setUserName(username);
		setPassWord(password);
		clickLoginButton();
	}
	

}
