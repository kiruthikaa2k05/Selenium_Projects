package com.orangehrm.seleniumiuframwork.generic_utility;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	WebDriver driver;
	WebDriverWait wait;
	//Manage
	//maximize
	
	public WebDriverUtility(WebDriver driver) {
		this.driver=driver;
	}
	public void configMaximizedBrowser() {
		driver.manage().window().maximize();
	}
	
	public void cofigMinimizedBrowser() {
		driver.manage().window().minimize();
	}
	//set full screen
	public void cofigFullScreenBrowser() {
		driver.manage().window().fullscreen();
	}
	//get dimension
	public Dimension fetchSize() {
		Dimension dimension = driver.manage().window().getSize();
		return dimension;
	}
	//set dimension
	public void configBrowserSize(int width,int height) {
		driver.manage().window().setSize(new Dimension(width, height));
		
	}
	//get position
	public Point fetchBrowserCoordiantes() {
		Point position = driver.manage().window().getPosition();
		return position;
	}
	//set position
	public void configBrowserCoordiantes(int  Xoffset,int  Yoffset) {
		driver.manage().window().setPosition(new Point(Xoffset,Yoffset));
	}
	//navigate
	//navigate to 
	public void navigateToApplication(String fullUrl) {
		driver.navigate().to(fullUrl);
	}
	//forward
	public void navigatForward() {
		driver.navigate().forward();
	}
	//backward
	public void navigatBackward() {
		driver.navigate().back();
	}
	//refresh
	public void refreshCurrentPage() {
		driver.navigate().refresh();
	}
	//get
	public void enterUrl(String url) {
		driver.get(url);
	}
	//get title
	public void getTitle() {
		driver.getTitle();
	}
	//get current url
	public void getCurrentUrl() {
		driver.getCurrentUrl();
	}
	
	//close
	public void closeTab() {
		driver.close();;
	}
	//quit
	public void quitTab() {
		driver.quit();
	}
	//timeouts
	public void waitForElementsToLoad(long TimeInSecond) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeInSecond));
	}
	//explicit wait
	public void waitTillElementIsClickable(WebDriver element,long maximumTimeToWait) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(maximumTimeToWait));
		wait.until(ExpectedConditions.elementToBeClickable((By) element));
	}
	
	public void waitTillElementIsVisible(WebDriver element,long maximumTimeToWait) {
		wait=new WebDriverWait(driver, Duration.ofSeconds(maximumTimeToWait));
		wait.until(ExpectedConditions.visibilityOf((WebElement) element));
	}
	//popups
	public void clickOnAccept() {
		driver.switchTo().alert().accept();	
	}
	public void clickOnDismiss() {
		driver.switchTo().alert().dismiss();
	}
	public void typeMessageInJavaScriptPopup(String text) {
		driver.switchTo().alert().sendKeys(text);
	}
	public String fetchJavaScriptPopupMessgae(){
		String message=driver.switchTo().alert().getText();
		return message;
	}
	
	//swtiching child window
	
	public void childWindowSwitchingByUrl(String childApplicationTitle) {
		String parentWindow=driver.getWindowHandle();
		Set<String> childwindows=driver.getWindowHandles();
		//childwindows.remove(parentWindow);
		
		for (String childWindow : childwindows) {
            driver.switchTo().window(childWindow);
            String title=driver.getCurrentUrl();
			if(title.contains(childApplicationTitle)) {
				break;
			}
			
		}
	}
	
	public void childWindowSwitchingByTitle(String childApplicationTitle) {
		String parentWindow=driver.getWindowHandle();
		Set<String> childwindows=driver.getWindowHandles();
		//childwindows.remove(parentWindow);
		
		for (String childWindow : childwindows) {
            driver.switchTo().window(childWindow);
            String title=driver.getTitle();
			if(title.contains(childApplicationTitle)) {
				break;
			}
			
		}
	}
	
	

}
