package Navigation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToString {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to google
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		//navigate to YT
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.quit();

	}

}
