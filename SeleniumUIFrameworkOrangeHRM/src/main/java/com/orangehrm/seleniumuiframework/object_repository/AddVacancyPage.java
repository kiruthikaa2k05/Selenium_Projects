package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddVacancyPage {
	WebDriver driver;
	
	public AddVacancyPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//vacancy text field
	@FindBy(xpath="//label[text()='Vacancy Name']/../..//input")
	WebElement vacancyNameTextField;
	//job title
	@FindBy(xpath="//label[text()='Job Title']/../..//i")
	WebElement jobTitle;
	//description text field
	@FindBy(css="[placeholder='Type description here']")
	WebElement descriptionTextField;
	//hiring manager
	@FindBy(css="[placeholder='Type for hints...']")
	WebElement hiringManagerTextField;
	//no.of.positions text field
	@FindBy(xpath="//label[text()='Number of Positions']/../..//input")
	WebElement numberOfPositionTextField;
	//save button
	@FindBy(css="[type=submit]")
	WebElement SaveBtn;
	
	
	public WebElement getVacancyNameTextField() {
		return vacancyNameTextField;
	}

	public void setVacancyNameTextField(String vacancyNameTextField) {
		getVacancyNameTextField().sendKeys(vacancyNameTextField);
	}

	public WebElement getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(WebElement jobTitle) {
		this.jobTitle = jobTitle;
	}

	public WebElement getDescriptionTextField() {
		return descriptionTextField;
	}

	public void setDescriptionTextField(String descriptionTextField) {
		getDescriptionTextField().sendKeys(descriptionTextField);
	}

	public WebElement getHiringManagerTextField() {
		return hiringManagerTextField;
	}

	public void setHiringManagerTextField(String hiringManagerTextField) {
		getHiringManagerTextField().sendKeys(hiringManagerTextField);
	}

	public WebElement getNumberOfPositionTextField() {
		return numberOfPositionTextField;
	}

	public void setNumberOfPositionTextField(String numberOfPositionTextField) {
		getNumberOfPositionTextField().sendKeys(numberOfPositionTextField);
	}

	public WebElement getSaveBtn() {
		return SaveBtn;
	}

	public void clickSaveBtn() {
		getSaveBtn().click();
	}

}
