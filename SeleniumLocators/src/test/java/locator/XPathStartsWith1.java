package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathStartsWith1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[starts-with(@name,'_nk')]")).sendKeys("toys");
	}

}
