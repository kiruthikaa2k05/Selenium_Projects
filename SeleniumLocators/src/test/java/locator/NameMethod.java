package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(8000);//time to load the webpage or synchronization
		
		//locating username text field
		
		driver.findElement(By.name("username")).sendKeys("Admin");
		//locating password
		driver.findElement(By.name("password")).sendKeys("admin123");
		
		//navigating to google
		
		driver.get("https://www.google.com/");
		//locate the search text field
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		
		driver.get("");
		driver.findElement(By.name("")).sendKeys("");
		
	}

}
