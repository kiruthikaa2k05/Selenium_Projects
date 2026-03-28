package Navigation;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateToUrl {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//navigate to amazon
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		//navigate to flipkart
		URL url1=new URL("https://www.flipkart.com/");
		driver.navigate().to(url1);
		Thread.sleep(2000);
		//navigate to ubereats
		driver.navigate().to(new URL("https://www.ubereats.com/in?srsltid=AfmBOoqfW3WUOx5FkkCjoTF9MRMwyNPWuZVhB8OIAubSTmMP5E3doAcw"));
		Thread.sleep(2000);
		driver.quit();
		

	}

}
