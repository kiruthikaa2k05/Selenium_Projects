package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RecruimentPage {
	WebDriver driver;
	public RecruimentPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	@FindBy(linkText="Vacancies")
	private WebElement vancanciesLink;
	
	@FindBy(xpath = "//button[contains(@class,'oxd-button') and .=' Add ']")
	private WebElement addButton;
	
	
	public WebElement getVancanciesLink() {
		return vancanciesLink;
	}
	public void clickVancanciesLink() {
		getVancanciesLink().click();
	}
	
	public WebElement getAddButton() {
		return addButton;
	}
	public void clickAddButton() {
		getAddButton().click();
	}
	

}
