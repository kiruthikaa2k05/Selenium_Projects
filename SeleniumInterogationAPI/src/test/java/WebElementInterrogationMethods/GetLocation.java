package WebElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		//locating the search text field
		WebElement search=driver.findElement(By.name("q"));
		//fetching the loc
		Point loc = search.getLocation();
		System.out.println(loc);
		
		//fetching Xoffset
		System.out.println(loc.x);
		System.out.println(loc.getX());
		
		//fetching Yoffset
	    System.out.println(loc.y);
		System.out.println(loc.getY());
		
		
		driver.quit();
		
		

	}

}
