package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningGetMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//step1: launching the browser
		WebDriver driver = new ChromeDriver();
		
		//step2:navigate to YT
		
		driver.get("https://www.amazon.in/");

		//wait stmt
		Thread.sleep(2000);
		//fetching the title of webpage
		System.out.println(driver.getTitle());
	}

}
