package WebElementAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		//clicking on cricket
		 WebElement cricket= driver.findElement(By.cssSelector("[id=\"checkbox1\"]"));
		 cricket.click();
		 //unsend the cricket checkbox
		 Thread.sleep(2000);
		 cricket.click();

	}

}
