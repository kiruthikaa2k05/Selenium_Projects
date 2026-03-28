package WebElementAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		//clicking on skills dropdown
		//driver.findElement(By.cssSelector("[id=\"Skills\"]")).click();
		Thread.sleep(2000);
		//driver.findElement(By.cssSelector("[value=\"C\"]")).click();
		
		WebElement skillsdropdown=driver.findElement(By.cssSelector("[id=\"Skills\"]"));;
		skillsdropdown.click();
		Thread.sleep(2000);
		skillsdropdown.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN.ENTER);
		

	}

}
