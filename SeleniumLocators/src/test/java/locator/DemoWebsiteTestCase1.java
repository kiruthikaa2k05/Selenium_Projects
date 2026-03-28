package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebsiteTestCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//click search button
		driver.findElement(By.cssSelector("[value=\"Search\"]")).click();
		//handling the popup
		driver.switchTo().alert().accept();
		//type computer
		driver.findElement(By.name("q")).sendKeys("computers");
        //click search button
		driver.findElement(By.cssSelector("[value=\"Search\"]")).click();
		

	}

}
