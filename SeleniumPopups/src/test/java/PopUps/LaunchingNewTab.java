package PopUps;

import java.awt.Window;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingNewTab {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		Thread.sleep(2000);
		
		//launching new tab in same browser and ||lly switching the tool control
		driver.switchTo().newWindow(WindowType.TAB);
		//TAB used to call new Tab and window used to call new window
		driver.get("https://github.com/");
		
		driver.quit();

	}

}
