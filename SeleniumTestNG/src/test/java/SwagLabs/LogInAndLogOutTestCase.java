package SwagLabs;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LogInAndLogOutTestCase {

	WebDriver driver;
	@Test(priority = -1,invocationCount = 10)
	public void login() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		options.addArguments("--headless");//headless will not bother user by doing other works 
		
	    driver= new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//url
		driver.get("https://www.saucedemo.com/");
		//username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//login button
		driver.findElement(By.id("login-button")).click();
	}
	public void logout() {
		driver.findElement(By.xpath("//div[@class=\"bm-burger-button\"]")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}
}
