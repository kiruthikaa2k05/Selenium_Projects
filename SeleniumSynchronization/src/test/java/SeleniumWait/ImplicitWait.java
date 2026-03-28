package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		//orange Hrm
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//name
		driver.findElement(By.name("username")).sendKeys("Admin");
		//pass
		driver.findElement(By.name("password")).sendKeys("admin123");
		//login
		driver.findElement(By.cssSelector("[type='submit']")).click();
		//profile dropdown
		driver.findElement(By.cssSelector("[class='oxd-userdropdown-name']")).click();
		//logout
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
		
		

	}

}
