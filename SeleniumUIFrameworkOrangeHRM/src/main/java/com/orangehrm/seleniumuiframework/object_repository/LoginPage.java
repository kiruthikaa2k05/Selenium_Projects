package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements( driver,this);
	}
	
	//username
	@FindBy(name="username")
	private WebElement username;
	
     //password
	@FindBy(name="password")
	private WebElement passWord;
	
    //login button
	@FindBy(css="[type='submit']")
	private WebElement loginBtn ;
	
     //forgot password
	@FindBy(xpath="//p[.='Forgot your password? ']")
	private WebElement forgotPwd;
	
	//LinkedIn 
	@FindBy(xpath="//a[@href='https://www.linkedin.com/company/orangehrm/mycompany/']")
	private WebElement linkedInLink;
	
	//FaceBook
	@FindBy(css="[href=\"https://www.facebook.com/OrangeHRM/\"]")
	private WebElement faceBookLink;
	
	//Twitter
	@FindBy(xpath="[href=\"https://twitter.com/orangehrm?lang=en\"]")
	private WebElement twitterLink;
	
    //Youtube
	@FindBy(xpath="[href=\"https://www.youtube.com/c/OrangeHRMInc\"]")
	private WebElement youtubeLink;


	public WebElement getUsername() {
		return username;
	}


	public void setUsername(String validUserName) {
		getUsername().sendKeys(validUserName);
	}


	public WebElement getPassWord() {
		return passWord;
	}


	public void setPassWord(String validPassword) {
		getPassWord().sendKeys(validPassword);
	}


	public WebElement getLoginBtn() {
		return loginBtn;
	}


	public void clickLoginBtn() {
		getLoginBtn().click();
	}


	public WebElement getForgotPwd() {
		return forgotPwd;
	}


	public void clickForgotPwd() {
		getForgotPwd().click();
	}


	public WebElement getLinkedInLink() {
		return linkedInLink;
	}


	public void clickLinkedInLink() {
	getLinkedInLink().click();
	}


	public WebElement getFaceBookLink() {
		return faceBookLink;
	}


	public void clickFaceBookLink() {
		getFaceBookLink().click();
	}


	public WebElement getTwitterLink() {
		return twitterLink;
	}


	public void clickTwitterLink() {
	getTwitterLink().click();
	}


	public WebElement getYoutubeLink() {
		return youtubeLink;
	}


	public void clickYoutubeLink() {
		getYoutubeLink().click();
	}
	
	
	//Business Logic 
	//Login
	
	public void login(String validUserName,String validPassword) {
		setUsername(validUserName);
		setPassWord(validPassword);
		clickLoginBtn();
		
	}
	
	
	

}
