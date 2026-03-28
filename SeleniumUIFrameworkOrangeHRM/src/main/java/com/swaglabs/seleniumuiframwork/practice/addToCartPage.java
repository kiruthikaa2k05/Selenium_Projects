 package com.swaglabs.seleniumuiframwork.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class addToCartPage  extends HomePage{
	WebDriver driver;
	public addToCartPage(WebDriver driver) {
		super(driver);
		
	}
	
	
//	 public addToCartPage( WebDriver driver) {
//		 PageFactory.initElements(driver, this);
//		 
//	 }
	
	//cart button
	@FindBy(xpath="[class='shopping_cart_link']")
	private WebElement cartButton;
	//remove product from cart
	@FindBy(id="remove-sauce-labs-backpack")
	private WebElement removefromCart;
	//checkout
	@FindBy(xpath="//button[.='Checkout']")
    private WebElement checkOut;
	//continue shopping 
	@FindBy(name="name=\"continue-shopping\"")
	private WebElement continueShopping;
	
	
	
	public WebElement getCartButton() {
		return cartButton;
	}
	public void clickCartButton() {
		getCartButton().click();
	}
	public WebElement getRemovefromCart() {
		return removefromCart;
	}
	public void clickRemovefromCart() {
		getRemovefromCart().click();
	}
	public WebElement getCheckOut() {
		return checkOut;
	}
	public void clickCheckOut() {
		getCheckOut().click();
		
	}
	public WebElement getContinueShopping() {
		return continueShopping;
	}
	public void clickContinueShopping() {
		getContinueShopping().click();
	}
	
	
	//Business Logic
	public void clickMenuButton() {
		clicktMenuButton();
		clickLogOut();
	}
	
	
}
