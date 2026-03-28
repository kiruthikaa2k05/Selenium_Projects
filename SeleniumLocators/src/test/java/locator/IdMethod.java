package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
//		driver.get("https://www.google.com/");//1
//		Thread.sleep(2000);
		//typing selenium in the search text field
		
//WebElement we=	driver.findElement(By.id("APjFqb"));
//we.sendKeys("Selenium Training");
//
//		driver.get("https://www.amazon.com/");//2
//		Thread.sleep(2000);
//	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("watch");
		

//		driver.get("https://chatgpt.com/");//3
//		Thread.sleep(2000);
//	driver.findElement(By.id("prompt-textarea")).sendKeys("watch");
	
//	driver.get("https://www.olacabs.com");//4
//	driver.findElement(By.id("textbox1")).sendKeys("chennai");
		
		driver.get("https://www.swiggy.com/");//5
		driver.findElement(By.id("location")).sendKeys("Chennai");
	
	}

	
}
