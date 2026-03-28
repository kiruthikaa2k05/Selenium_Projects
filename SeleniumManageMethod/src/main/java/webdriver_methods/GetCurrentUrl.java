package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//fetching url of the current webpage
		System.out.println(driver.getCurrentUrl());
		
		//navigating to google
		driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/4.38.0");
		//fetching the url of the webpage
		System.out.println(driver.getCurrentUrl());
		
		//fetching the sourcecode of the webpage
		
		System.out.println(driver.getPageSource());
		
		//closing the driver controlled window
		
		driver.close();
		
	}

}
