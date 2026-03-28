package com.demo.seleniumgrid.launching.browser;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxCommandContext;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingFireFox {
	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		
		FirefoxOptions options=new FirefoxOptions();
		WebDriver driver=new RemoteWebDriver(new URL("http://10.12.93.84:4444"), options);
		//navigating to an applications
		driver.get("https://www.selenium.dev/");
		Thread.sleep(4000);
		driver.quit();
		
	}

}
