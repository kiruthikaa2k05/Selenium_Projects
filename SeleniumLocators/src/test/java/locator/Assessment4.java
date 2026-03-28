package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class Assessment4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);
	WebElement name=driver.findElement(By.xpath("//input[starts-with(@fdprocessedid,\"317q\") and @name=\"username\" and @placeholder=\"Username\"]"));
	name.sendKeys("Admin");
	WebElement pass=driver.findElement(RelativeLocator.with(By.cssSelector("[name='password']")).below(name));
    pass.sendKeys("admin123");
	}

}
