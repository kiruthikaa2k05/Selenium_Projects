package com.demo.seleniumgrid.launching.browser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingChrome {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		ChromeOptions options=new ChromeOptions();
		//options.addArguments("-maximized");
		WebDriver driver=new RemoteWebDriver(new URL("http://10.12.93.84:4444"), options);
		//navigating to an applications
		driver.get("https://www.selenium.dev/");
		Thread.sleep(4000);
		driver.quit();
		
	}
	
	
	


}
