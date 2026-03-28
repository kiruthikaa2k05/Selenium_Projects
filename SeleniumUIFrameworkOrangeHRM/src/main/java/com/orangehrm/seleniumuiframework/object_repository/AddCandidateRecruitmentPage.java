package com.orangehrm.seleniumuiframework.object_repository;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddCandidateRecruitmentPage {
	
	WebDriver driver;
//	Actions act= new Actions(driver);
//	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	 public AddCandidateRecruitmentPage(WebDriver driver) {
		PageFactory.initElements( driver,this);
	}
	 
	 @FindBy(name="firstName")
	 private WebElement firstName;
	 
	 @FindBy(name="middleName")
	 private WebElement middleName;
	 
	 @FindBy(name="lastName")
	 private WebElement lastName;
	 
	 @FindBy(css="[class='oxd-select-text-input']")
	 private WebElement vacancyDropDown;
	 
	 @FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//child::label[text()='Email']/../../..")
	 private WebElement emailId;
	 
	 @FindBy(xpath="//div[@class='oxd-input-group oxd-input-field-bottom-space']//child::label[text()='Contact Number']/../../..")
	 private WebElement phno;
	 
	 @FindBy(css="[fdprocessedid='giwex']")
	 private WebElement saveButton;
	 
	 
	 
 
	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String  firstName) {
		getFirstName().sendKeys(firstName);
	}

	public WebElement getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		getMiddleName().sendKeys(middleName);
	}

	public WebElement getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		getLastName().sendKeys(lastName);
	}

	public WebElement getVacancyDropDown() {
		return vacancyDropDown;
	}

	public void clickVacancyDropDown() {
	getVacancyDropDown().click();
	}
	 
	
	public WebElement getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		getEmailId().sendKeys(emailId);
	}

	public WebElement getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		getPhno().sendKeys(phno);
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void clickSaveButton() {
		getSaveButton().click();
	}
	 

	 

}
