package com.orangehrm.seleniumuiframework.object_repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {

	WebDriver driver;
	public DashBoardPage(WebDriver driver){
		PageFactory.initElements( driver,this);
	}
	
	@FindBy(linkText="PIM")
	private WebElement pimLink;
	@FindBy(linkText="Recruitment")
	private WebElement recruitmentLink;
	@FindBy(css="li[class='oxd-userdropdown']")
	private WebElement logOutDropdown;
	@FindBy(linkText="Logout")
	private WebElement logoutLink;
	

	public WebElement getPimLink() {
		return pimLink;
	}

	public void clickPimLink() {
		getPimLink().click();
	}

	public WebElement getLogOutDropdown() {
		return logOutDropdown;
	}
	
	

	public WebElement getRecruitmentLink() {
		return recruitmentLink;
	}


	public void clickRecruitmentLink() {
		getRecruitmentLink().click();
		
	}

	public void clickLogOutDropdown() {
		getLogOutDropdown().click();
	}

	public WebElement getLogoutLink() {
		return logoutLink;
	}

	public void clickLogoutLink() {
		getLogoutLink().click();
	}
	
	public void logout() {
		clickLogOutDropdown();
		clickLogoutLink();
	}
	

	
	

}
