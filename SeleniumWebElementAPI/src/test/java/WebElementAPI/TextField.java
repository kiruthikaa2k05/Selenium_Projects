package WebElementAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextField {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		//firstname
		WebElement firstname=driver.findElement(By.cssSelector("[placeholder=\"First Name\"]"));
		firstname.sendKeys("tim");
		//last name
		driver.findElement(By.cssSelector("[placeholder=\"Last Name\"]")).sendKeys("tom");
		Thread.sleep(2000);
		//clearing first name
		firstname.clear();
		Thread.sleep(2000);
		//re-writing firstname
		firstname.sendKeys("max");
		
		
		

	}

}
