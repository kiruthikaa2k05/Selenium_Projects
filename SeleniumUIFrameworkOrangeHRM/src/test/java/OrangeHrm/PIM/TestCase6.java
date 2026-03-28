package OrangeHrm.PIM;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class TestCase6 {
	
	WebDriver driver=null;
	
	@Test(priority = -1)
	public void launchingBrowser() {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	
	@Test(priority = 1,dependsOnMethods = "launchingBrowser")
	public void login() throws InterruptedException {
		//url
		driver.get("https://opensource-demo.orangehrmlive.com/");
		//username
		driver.findElement(By.name("username")).sendKeys("Admin");
		//password
		driver.findElement(By.name("password")).sendKeys("admin123");
		//login button
		driver.findElement(By.cssSelector("[type='submit']")).click();
		Thread.sleep(5000);
	}
	
	
	@Test(priority = 3,dependsOnMethods = "login")
	public void PIM() throws InterruptedException {
		//clicking PIM
		driver.findElement(By.xpath("//span[.='PIM' and @class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]")).click();
		Thread.sleep(5000);
		//clicking dropdown 
		driver.findElement(By.cssSelector("[class='oxd-topbar-body-nav-tab --parent']")).click();
		//clicking terminal reasons
		driver.findElement(By.linkText("Termination Reasons")).click();
		//clicking add button
		driver.findElement(By.cssSelector("[class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
	}
	
	@Test(priority = 4,dependsOnMethods = "PIM")
	public void addTerminal() throws InterruptedException {
		//clicking name field
		Thread.sleep(5000);
		 WebElement namefield = driver.findElement(By.xpath("//p[text()='Add Termination Reason' and @class=\"oxd-text oxd-text--p orangehrm-main-title\"]"));
		 WebElement name = driver.findElement(RelativeLocator.with(By.xpath("//div[@class=\"oxd-input-group__label-wrapper\"]")).below(namefield));
		 WebElement reason = driver.findElement(RelativeLocator.with(By.xpath("//input[@class='oxd-input oxd-input--active']")).below(name));
		 reason.sendKeys("Resignation");
		 String ResonField = reason.getText();
		 //clicking save button
		 driver.findElement(By.xpath("//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")).click();
		 //verification
		 WebElement records = driver.findElement(By.xpath("//span[.=' (14) Records Found' and @class=\"oxd-text oxd-text--span\"]"));
		 List<WebElement> RecordData = driver.findElements(RelativeLocator.with(By.xpath("//div[@class=\"orangehrm-container\"]")).below(records));
		 
		 for (WebElement data : RecordData) {
			 if(data.equals(ResonField)) {
				 System.out.println("Validated");	 
			 }
			 else {
				 System.out.println("Not Validated");
			 }
			
		}
		 
	}
	@Test(priority = 8,dependsOnMethods = "login")
	public void logout() {
		driver.findElement(By.cssSelector("[class=\"oxd-userdropdown-name\"]")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
	}

}
