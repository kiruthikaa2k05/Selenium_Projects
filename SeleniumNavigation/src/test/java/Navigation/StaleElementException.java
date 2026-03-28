package Navigation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementException {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
	     WebElement searchTF=driver.findElement(By.cssSelector("[id=\'small-searchterms\']"));
	    searchTF.sendKeys("mobiles");
	    Thread.sleep(2000);
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[@id='small-searchterms']")).sendKeys("mobiles");
		
		
		

	}

}
