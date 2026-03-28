package WebElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement radio=driver.findElement(By.id("pollanswers-2"));
		//verifying the button is selected or not
		System.out.println("Is the button is selected: "+radio.isSelected());
		//clicking on the button
		radio.click();
		Thread.sleep(2000);
		System.out.println("Is the good button is selected: "+radio.isSelected());
		
		driver.quit();
		

	}

}
