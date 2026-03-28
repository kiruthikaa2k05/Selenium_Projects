package OrangeHrm.RecruitmentLink;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestCase3 {
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
	
	@Test(priority = 2,dependsOnMethods = "login")
	public void ClickingRecruitmentLink() throws InterruptedException {
		
		//clicking recruitment link
		driver.findElement(By.xpath("//span[.='Recruitment']")).click();
		Thread.sleep(5000);
		
	}
	
	@Test(priority = 3,dependsOnMethods = "ClickingRecruitmentLink")
	public void vacancies() throws InterruptedException {
		//clicking vacancies link
		driver.findElement(By.cssSelector("[class=\"oxd-topbar-body-nav-tab\"]")).click();
		Thread.sleep(5000);
		//clicking add button
		driver.findElement(By.xpath("//div[@class='orangehrm-header-container']")).click();
		
	}

}
