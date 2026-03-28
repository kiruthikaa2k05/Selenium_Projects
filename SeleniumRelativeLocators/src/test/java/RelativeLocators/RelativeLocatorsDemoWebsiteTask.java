package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsDemoWebsiteTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		WebElement firstname=driver.findElement(By.cssSelector("[placeholder='First Name']"));
		firstname.sendKeys("Abc");
		Thread.sleep(2000);
		WebElement lastname=driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(firstname));
		lastname.sendKeys("Mno");
		Thread.sleep(2000);
		WebElement add=driver.findElement(RelativeLocator.with(By.tagName("textarea")).below(firstname));
		add.sendKeys("Chennai");
		Thread.sleep(2000);
		WebElement email=driver.findElement(RelativeLocator.with(By.cssSelector("[type=\"email\"]")).below(add));
		email.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		WebElement phn=driver.findElement(RelativeLocator.with(By.cssSelector("[type=\"tel\"]")).below(email));
		phn.sendKeys("7967478739");
		WebElement gendermale=driver.findElement(RelativeLocator.with(By.xpath("//input[@value='Male']")).below(phn));
		gendermale.click();
		WebElement genderfemale=driver.findElement(RelativeLocator.with(By.xpath("//input[@value=\"FeMale\"]")).below(phn));
		genderfemale.click();
		
		

	}

}
