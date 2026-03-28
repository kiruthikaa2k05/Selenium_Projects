package SeleniumWait;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//demo web shop
		driver.get("https://demowebshop.tricentis.com/");
		
		//navigate to Fb
		driver.findElement(By.linkText("Facebook")).click();
		//twitter
		driver.findElement(By.linkText("Twitter")).click();
		//YT
		driver.findElement(By.linkText("YouTube")).click();
		
		String parentID=driver.getWindowHandle();
		
		Set<String> allwindows = driver.getWindowHandles();
		allwindows.remove(parentID);
		
		for (String s: allwindows) {
			String title;
			
		}
		driver.findElement(By.cssSelector("[placeholder=\"Search\"]")).sendKeys("night changes");
		
		

	}

}
