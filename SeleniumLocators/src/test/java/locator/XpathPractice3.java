package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathPractice3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//strong[.='Community poll']"));
		
		List<WebElement> allradios=driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement i:allradios) {
			i.click();
			Thread.sleep(2000);
		}
		

	}

}
