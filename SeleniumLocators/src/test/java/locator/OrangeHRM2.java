package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		//fetching username
		driver.findElement(By.name("username")).sendKeys("Admin");
		//fetching password
		driver.findElement(By.name("password")).sendKeys("admin123");
		//clicking login button
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("PIM")).click();
	WebElement name	=driver.findElement(By.xpath("//input[@placeholder='Type for hints...' and @fdprocessedid=\"92qjvh\"]"));
     name.click();
     
	}

}
