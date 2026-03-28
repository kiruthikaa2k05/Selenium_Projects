package PopUps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingNewTab_WINDOW {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
		
		//launching new window tab
		driver.switchTo().newWindow(WindowType.WINDOW);
		//url of new tab
		driver.get("https://github.com/");
		//title of new window
	    System.out.println(driver.getTitle());	
		driver.quit();
		

	}

}
