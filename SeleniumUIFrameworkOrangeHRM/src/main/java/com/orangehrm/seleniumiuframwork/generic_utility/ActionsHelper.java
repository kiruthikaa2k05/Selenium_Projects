package com.orangehrm.seleniumiuframwork.generic_utility;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsHelper {
	WebDriver driver;
	Actions act;
	
	//constructor
	public ActionsHelper(WebDriver driver) {
		this.driver=driver;
		this.act=new Actions(driver);
	}
	
	//MovetoElement and click
	public void clickOnElement(WebElement element) {
		act.moveToElement(element).click().perform();
	}
	
	//navigating dropdowm
	
	public void navigateDownDropDown(WebElement element, int index) {

	    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

	    // Step 1: Open dropdown
	    act.moveToElement(element).click().perform();

	    // Step 2: Wait for options
	    List<WebElement> options = wait.until(
	        ExpectedConditions.visibilityOfAllElementsLocatedBy(
	            By.xpath("//div[@role='listbox']//span")
	        )
	    );

	    // Debug
	    System.out.println("Options count: " + options.size());

	    // Step 3: Click option using Actions
	    if (index < options.size()) {
	        act.moveToElement(options.get(index)).click().perform();
	    } else {
	        throw new RuntimeException("Invalid index: " + index);
	    }
	}
//	public void navigateDownDropDown(WebElement element,long timeInSec,int downArrowIndex) {
//		//act.click(element).pause(3000).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
//	    act.click(element).pause(Duration.ofSeconds(timeInSec)).perform();
//	    
//	    for(int i=1;i<=downArrowIndex;i++) {
//	    	act.keyDown(Keys.DOWN).perform();  	
//	    }
//	    act.sendKeys(Keys.ENTER).perform();
//	}
	
	// Double Click
	 public void doubleClick(WebElement element) {
		 act.doubleClick(element).perform();
		 
	 }
	 
	 //Click and Hold
	 public void clickAndHold(WebElement element) {
		 act.clickAndHold(element).perform();
	 }
	
	public void scrollDownAutoSuggestion(WebElement element,String text,long timeInSec,int downArrowIndex) {
	act.sendKeys(element,text).pause(Duration.ofSeconds(timeInSec)).perform();
	for(int i=1;i<=downArrowIndex;i++) {
		act.keyDown(Keys.DOWN).keyUp(Keys.DOWN).perform();
	    }
	act.keyDown(Keys.ENTER).keyUp(Keys.DOWN).perform();
	
	}
}
