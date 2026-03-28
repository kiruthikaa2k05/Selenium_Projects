package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoWebShopTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://demowebshop.tricentis.com/");
		
		//selecting search bar
		WebElement searchbtn = driver.findElement(By.id("small-searchterms"));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		
		Thread.sleep(2000);
		js.executeScript("arguments[0].value='Mobiles'",searchbtn);

	}

}
