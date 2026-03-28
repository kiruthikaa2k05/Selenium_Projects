package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLocatorOrangeHRMTask {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
		WebElement name=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		name.sendKeys("Admin");
		WebElement pass=driver.findElement(RelativeLocator.with(By.name("password")).below(name));
		pass.sendKeys("admin123");
		WebElement reg=driver.findElement(RelativeLocator.with(By.xpath("//button[@type='submit']")).below(pass));
		reg.click();

	}

}
