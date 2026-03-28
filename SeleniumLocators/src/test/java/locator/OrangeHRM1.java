package locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRM1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//getting url of webpage
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		//fetching username
		driver.findElement(By.name("username")).sendKeys("Admin");
		//fetching password
		driver.findElement(By.name("password")).sendKeys("admin123");
		//clicking login button
		driver.findElement(By.xpath("//button[text()=' Login ']")).click();
		Thread.sleep(3000);
		//navigating to Recruitment
		//Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Recruitment']")).click();
		Thread.sleep(2000);
		//clicking add button
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary']")).click();
		//filling the details
		driver.findElement(By.name("firstName")).sendKeys("Steve");
		driver.findElement(By.name("lastName")).sendKeys("harrington");
		driver.findElement(By.xpath("//input[@class='oxd-input oxd-input--active' and @placeholder='Type here']")).sendKeys("abc@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space' ]")).click();
        //driver.findElement(By.xpath("//p[.='CHOTA BADMASH']")).click();
        //driver.findElement(By.xpath("//a[.='Logout']")).click();
        Thread.sleep(2000);
        driver.findElement(By.linkText("Candidates")).click();
        driver.findElement(By.xpath("//div[.='Steve  harrington']/..")).click();
        }

}
