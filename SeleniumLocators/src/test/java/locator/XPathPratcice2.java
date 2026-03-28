package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathPratcice2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='flex-1']")).click();
		driver.findElement(By.xpath("//input[@id='query-builder-test']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//span[@class=ActionListContent ActionListContent--visual16 QueryBuilder-ListItem']")).click();
	}

}
