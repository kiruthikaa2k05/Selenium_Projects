package webdriver_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LaunchingBrowser {
	public static void main(String[] args) {
		//launching chrome browser
		//ChromeDriver driver=new ChromeDriver();
		//RemoteWebDriver driver=new ChromeDriver();
		
		String browser="firefox";
		WebDriver driver=null;
		if(browser.contains("chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.contains("firefox")) {
			driver=new FirefoxDriver();
		}
		else if(browser.contains("edge")) {
			driver=new EdgeDriver();
		}
		
		
		
		//WebDriver driver=new ChromeDriver();
	}

}
