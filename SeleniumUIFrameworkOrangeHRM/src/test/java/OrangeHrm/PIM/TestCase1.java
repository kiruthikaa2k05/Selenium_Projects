package OrangeHrm.PIM;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class TestCase1 {
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
	
	@Test(priority=3,dependsOnMethods = "login")
	public void PIM() throws InterruptedException {
		//clicking PIM
		driver.findElement(By.xpath("//span[.='PIM' and @class=\"oxd-text oxd-text--span oxd-main-menu-item--name\"]")).click();
		Thread.sleep(5000);
		//clicking add button
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-plus oxd-button-icon\"]")).click();
		
	}
	
	@Test(priority = 4,dependsOnMethods = "PIM")
	public void addEmployee() throws InterruptedException {
		//firstname
		driver.findElement(By.cssSelector("[name=\'firstName\']")).sendKeys("Kate");
		//middle name
		driver.findElement(By.cssSelector("[name=\'middleName\']")).sendKeys("Sharma");
		//last name
		driver.findElement(By.cssSelector("[name=\'lastName\']")).sendKeys("Bridgerton");
		//empId
		driver.findElement(By.xpath("class=\"oxd-input oxd-input--active\"")).sendKeys("0112");
		Thread.sleep(5000);
		//toggle button
		driver.findElement(By.cssSelector("[class='oxd-switch-wrapper']")).click();
		//username
		WebElement Username = driver.findElement(By.xpath("//label[.='Username']"));
		driver.findElement(RelativeLocator.with(By.xpath("//input[@class=\"oxd-input oxd-input--active\" and @data-v-1f99f73c]")).below(Username)).sendKeys("K_sharma2");
		//password
		WebElement password = driver.findElement(By.xpath("//label[text()='Password']"));
		driver.findElement(RelativeLocator.with(By.xpath("//input[@class=\"oxd-input oxd-input--active\" and @type=\"password\"]")).below(password)).sendKeys("Eloise5");
		//confirm password
		driver.findElement(RelativeLocator.with(By.xpath("//input[@class=\"oxd-input oxd-input--active\" and @type=\"password\"]")).toRightOf(password)).sendKeys("Eloise5");
		//save button
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
	}
	
	@Test(priority = 5,dependsOnMethods = "addEmployee")
	public void verify() throws InterruptedException {
		//clicking admin
		driver.findElement(By.xpath("//span[@class=\"oxd-text oxd-text--span oxd-main-menu-item--name\" and text()='Admin']")).click();
		//username
		WebElement username = driver.findElement(By.xpath("//label[.='Username']"));
		driver.findElement(RelativeLocator.with(By.cssSelector("[class='oxd-input oxd-input--active']")).below(username)).sendKeys("Bridgerton");
		//selecting role
		 WebElement role = driver.findElement(By.xpath("//div[.='-- Select --' and  @class=\"oxd-select-text-input\"]"));
		role.click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='ESS']")).click();
		//employee hints
		WebElement empHint = driver.findElement(RelativeLocator.with(By.tagName("input")).toRightOf(role));
		empHint.sendKeys("Kate");
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Kate Sharma Bridgerton']")).click();
		//status
		WebElement status = driver.findElement(By.xpath("//label[.='Status']"));
		driver.findElement(RelativeLocator.with(By.xpath("//div[.='-- Select --' and @class=\"oxd-select-text-input\" ]")).below(status)).click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Enabled']")).click();
		//search button
		driver.findElement(By.xpath("//button[@type='submit']")).click();	
		

		//verify
		WebElement records = driver.findElement(By.xpath("//div[@class=\"orangehrm-container\"]"));
		if(driver.getPageSource().contains("Kate Sharma Bridgerton")) {
			System.out.println("Records found");
		}
		else {
			System.out.println("No records found");
		}
	}
	
	@Test(priority =6,dependsOnMethods = "login")
	public void logout() {
		//clicking logout
		driver.findElement(By.cssSelector("[class=\"oxd-icon bi-caret-down-fill oxd-userdropdown-icon\"]")).click();
		driver.findElement(By.xpath("//a[.='Logout']")).click();
		
	}

}
