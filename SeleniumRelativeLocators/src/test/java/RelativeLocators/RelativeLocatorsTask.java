package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorsTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(2000);
		WebElement name =driver.findElement(By.id("name"));
		name.sendKeys("Tom");
		Thread.sleep(2000);
		WebElement email=driver.findElement(RelativeLocator.with(By.id("email")).below(name));
		email.sendKeys("abc@gmail.com");
		Thread.sleep(2000);
		WebElement pass=driver.findElement(RelativeLocator.with(By.id("password")).below(email));
		pass.sendKeys("pass123");
		Thread.sleep(2000);
		WebElement reg=driver.findElement(RelativeLocator.with(By.xpath("//button[.='Register']")).below(pass));
		reg.click();
		

	}

}
