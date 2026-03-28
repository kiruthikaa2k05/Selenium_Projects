package WebElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisplayed {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(20000);
		WebElement btn=driver.findElement(By.xpath("//button[.='Register']"));
		//verify the button is displayed
		System.out.println("the button is displayed: "+btn.isDisplayed());
		driver.quit();

	}

}
