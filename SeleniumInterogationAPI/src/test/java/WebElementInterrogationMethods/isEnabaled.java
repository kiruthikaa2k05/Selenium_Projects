package WebElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isEnabaled {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/34");
		Thread.sleep(20000);
		WebElement btn=driver.findElement(By.id("Check"));
		//verifying if the button is enabled
		System.out.println("Is my check button enabled: "+btn.isEnabled());
		
		
		
	}

}
