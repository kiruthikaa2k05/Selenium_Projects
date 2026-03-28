package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationTestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to google
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//type automation in search bar
		driver.findElement(By.cssSelector("[class=\'gLFyf\']")).sendKeys("automation");
		Thread.sleep(2000);
		//navigate to amazon and verify
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		System.out.println(driver.getTitle());
		//search for tools in amazon
		driver.findElement(By.cssSelector("[role='searchbox']")).sendKeys("tools");
		Thread.sleep(2000);
		driver.navigate().refresh();
		//navigate back to google
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
