package com.orangehrm.seleniumiuframwork.generic_utility;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class ScreenshotUtility {

	WebDriver driver;
	public ScreenshotUtility(WebDriver driver) {
		this.driver=driver;
	}
	
	@Test
	public String captureScreenshot(WebDriver driver, String testName) {
		
		//creating a method for time-stamp
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd[hh-mm-ss]").format(new Date());
		String path = System.getProperty("./Reports/"+timeStamp+".png");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			File perm = new File(path);
			FileHandler.copy(temp, perm);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return path;
	}
	
	//capture web element
	public String captureScreenshot(WebElement element, String elementName) {
		String timeStamp = new SimpleDateFormat("yyyy-MM-dd[hh-mm-ss]").format(new Date());
		String path = System.getProperty("./Reports/"+elementName+""+timeStamp+".png");
		File temp = element.getScreenshotAs(OutputType.FILE);
		try {
			File perm = new File(path);
			FileHandler.copy(temp, perm);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return path;
	}

}

