package JavaWait;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThreadClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		//amazon
		driver.get("https://www.amazon.com/");
		//sleep of long millis
		Thread.sleep(2000);
		
		//navigate to ebay
		driver.navigate().to("https://www.ebay.com/");
		//sleep of long millis,int nano
		Thread.sleep(2000, 100);
		
		// navigate to shopperstack
		driver.navigate().to("https://www.shoppersstack.com/");
		//sleep(Duration())---it returns duration obj
		Thread.sleep(Duration.ofSeconds(5));
		
		driver.quit();
		
		

	}

}
