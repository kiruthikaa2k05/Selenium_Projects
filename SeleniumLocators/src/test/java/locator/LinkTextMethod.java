package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkTextMethod {

	public static void main(String[] args) throws InterruptedException   {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		//driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(3000);
		//locate FB link
//		
//		driver.findElement(By.linkText("Facebook")).click();
//		
		
		driver.get("https://www.google.com/");
		driver.findElement(By.linkText("Gmail")).click();

	}

}
