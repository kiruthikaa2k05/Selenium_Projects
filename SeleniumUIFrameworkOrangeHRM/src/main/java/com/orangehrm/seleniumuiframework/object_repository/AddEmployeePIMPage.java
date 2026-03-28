package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddEmployeePIMPage {
	

	WebDriver driver;
	public AddEmployeePIMPage(WebDriver driver){
		PageFactory.initElements( driver,this);
	}
	 
	 @FindBy(name="firstName")
	 private WebElement firstName;
	 
	 @FindBy(name="middleName")
	 private WebElement middleName;
	 
	 @FindBy(name="lastName")
	 private WebElement lastName;
	 
	 @FindBy(xpath="//input[@class='oxd-input oxd-input--active']/../..//input")
	 private WebElement empId;
	 
	 @FindBy(css="[class='oxd-switch-wrapper']")
	 private WebElement createLoginDetailsButton;
	 
	 @FindBy(xpath="//label[.='Username']/../..//input")
	 private WebElement userName;
	 
	 @FindBy(xpath="//label[.='Password']/../..//input")
	 private WebElement password;
	 
	 @FindBy(xpath="//label[.='Confirm Password']/../..//input")
	 private WebElement confirmpassword;
	 
	 @FindBy(css="[type='submit']")
	 private WebElement saveButton;
	
	 

	 
	public WebElement getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
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

	public void setlastName(String lastName) {
		getLastName().sendKeys(lastName);
	}

	public WebElement getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		getEmpId().sendKeys(empId);;
	}

	public WebElement getCreateLoginDetailsButton() {
		return createLoginDetailsButton;
	}

	public void clickCreateLoginDetailsButton() {
		getCreateLoginDetailsButton().click();
	}

	public WebElement getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		getUserName().sendKeys(userName);
	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(String password) {
		getPassword().sendKeys(password);
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public void setConfirmpassword(String confirmpassword) {
         getConfirmpassword().sendKeys(confirmpassword);
	}

	public WebElement getSaveButton() {
		return saveButton;
	}

	public void clickSaveButton() {
		getSaveButton().click();
	}
	
	//Business Logic to add employee
	
	public void addEmployee(String firstName,String middleName,String lastName,String empId) {
		setFirstName(firstName);
		setMiddleName(middleName);
		setlastName(lastName);
		setEmpId(empId);
		clickCreateLoginDetailsButton();
	}
	
	//create credentials
	public void createCredentials(String userName,String password,String confirmPassword) {
		setUserName(userName);
		setPassword(password);
		setConfirmpassword(confirmPassword);
		clickSaveButton();
	}
	 
	

}
