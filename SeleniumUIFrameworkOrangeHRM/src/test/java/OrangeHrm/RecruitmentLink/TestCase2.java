package OrangeHrm.RecruitmentLink;

import java.time.Duration;

import javax.print.DocFlavor.READER;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

public class TestCase2 {
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
		//clicking add button
		driver.findElement(By.cssSelector("[class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		
	}
	
	@Test(priority = 3,dependsOnMethods = "ClickingRecruitmentLink")
	public void recruitmentLink() throws InterruptedException {
		//firstname
		driver.findElement(By.cssSelector("[name=\"firstName\"]")).sendKeys("Eloise");
		//middle name
		driver.findElement(By.cssSelector("[name=\"middleName\"]")).sendKeys("John");
		//lastname
		driver.findElement(By.cssSelector("[name=\"lastName\"]")).sendKeys("Bridgerton");
		//selecting vacancy
		Thread.sleep(3000);
		WebElement vacancy = driver.findElement(By.xpath("//label[.='Vacancy']"));
		driver.findElement(RelativeLocator.with(By.xpath("//div[.='-- Select --' and @class=\"oxd-select-text-input\"]")).below(vacancy)).click();
		//vacancy.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN.ENTER);
	    Actions act=new Actions(driver);
	    act.sendKeys(vacancy,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN.ENTER);
		//act.sendKeys(vacancy).click().pause(4000).keyDown(Keys.DOWN).keyDown(Keys.DOWN).keyDown(Keys.ENTER).perform();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Payroll Administrator']")).click();
		Thread.sleep(3000);
		//emailId
		WebElement email = driver.findElement(By.xpath("//label[.='Email']"));
		driver.findElement(RelativeLocator.with(By.xpath("//input[@class=\"oxd-input oxd-input--active\" and @placeholder=\"Type here\"]")).below(email)).sendKeys("abc@gmail.com");
		//contact no
		WebElement contact = driver.findElement(By.xpath("//label[.='Contact Number']"));
		driver.findElement(RelativeLocator.with(By.xpath("//input[@class=\"oxd-input oxd-input--active\" and @placeholder=\"Type here\"]")).below(contact)).sendKeys("8749379590");
		//resume
		//driver.findElement(By.xpath("//div[.='No file selected']")).click();
		//Thread.sleep(3000);
		//date of appliaction
	     driver.findElement(By.xpath("//div[@class=\"oxd-date-input\"]")).click();
		driver.findElement(By.xpath("//div[text()='10']")).click();
		
		
		//clicking save button
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
	}
	
	@Test(priority = 4,dependsOnMethods = "recruitmentLink()")
	public void candidtes() throws InterruptedException {
		//clicking candidates
		driver.findElement(By.linkText("Candidates")).click();
		//job title
		WebElement jobTitle = driver.findElement(By.xpath("//label[text()='Job Title']"));
		driver.findElement(RelativeLocator.with(By.xpath("//div[.='-- Select --' and @class=\"oxd-select-text-input\"]")).below(jobTitle)).click();
		driver.findElement(By.xpath("//div[@role='option']//span[text()='Account Assistant']")).click();
		//vacancy
		WebElement vacancy = driver.findElement(By.xpath("//div[.='-- Select --' and @class=\"oxd-select-text-input\"]/.."));
		//vacancy.click();
		Actions act=new Actions(driver);
		act.click(vacancy).pause(6000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();

		//Actions act=new Actions(driver);
		//act.click(vacancy).pause(2000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
        //vacancy.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
		
		//hiring manager
		WebElement hiringManager = driver.findElement(By.xpath("//div[.='-- Select --' and @class=\"oxd-select-text-input\"]/.."));
		act.click(hiringManager).pause(8000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
		//selecting status
		WebElement status = driver.findElement(By.xpath("//div[.='-- Select --' and @class=\"oxd-select-text-input\"]/.."));
		act.click(status).pause(7000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
		//candidate name
		WebElement candidateName = driver.findElement(By.cssSelector("[placeholder=\"Type for hints...\"]"));
		candidateName.sendKeys("Eloise");
		act.click(candidateName).pause(6000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
		//selecting  from application date
		driver.findElement(By.cssSelector("[placeholder=\"From\"]")).click();
		driver.findElement(By.xpath("//div[text()='11']")).click();
		//selecting to application date
		driver.findElement(By.cssSelector("[placeholder=\'To']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//div[text()='15']")).click();
		//clicking search button
		driver.findElement(By.cssSelector("[type=\"submit\"]")).click();
	}
	
	@Test(priority = 5,dependsOnMethods = "candidtes")
	public void verifyCandidate() {
		WebElement data = driver.findElement(By.cssSelector("[class=\"orangehrm-container\"]"));
		WebElement data1 = driver.findElement(RelativeLocator.with(By.cssSelector("[class=\"orangehrm-bottom-container\"]")).below(data));
	    //System.out.println("Record data : " +data1.getText());	
	    
	    if(!data1.isDisplayed()) {
	    	System.out.println("Records Found");
	    }
	    else {
	    	System.out.println("No records found");
	    }
	}

}
