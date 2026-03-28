package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackandForth {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//naviagte to myntra
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		//navigate to BigBasket
		driver.get("https://www.bigbasket.com/");
		Thread.sleep(2000);
		//navigate to ajio
		driver.get("https://www.ajio.com/");
		Thread.sleep(2000);
		//navigate to BigBasket and verify
		driver.navigate().back();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		//navigate to ajio and verify
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.quit();
		
		

	}

}
