package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTube_TestCase4 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(8000);
		driver.findElement(By.name("search_query")).sendKeys("AGAR TUM SAATH HO");
		driver.findElement(By.xpath("//button[@title='Search']")).click();
	}

}
