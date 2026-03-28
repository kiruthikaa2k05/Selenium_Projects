package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMTestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//username
		driver.findElement(By.name("username")).sendKeys("Admin");
		//password
		driver.findElement(By.name("password")).sendKeys("admin123");
		//login button
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(5000);
		//clicking PIM
		driver.findElement(By.xpath("//span[.='PIM' and @class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]")).click();
		Thread.sleep(5000);
		//clicking dropdown 
		driver.findElement(By.cssSelector("[class='oxd-topbar-body-nav-tab --parent']")).click();
		//clicking terminal reasons
		driver.findElement(By.linkText("Termination Reasons")).click();
		//clicking add button
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		
		//reason in name field
		Thread.sleep(8000);
		driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--active\"]/../../../../..//p[.='Add Termination Reason']")).sendKeys("Fever");

		
		//driver.quit();

	}

}
