package WebElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRectangle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//locating register link
		WebElement registerLink=driver.findElement(By.linkText("Register"));
		//fetching the rectangle
		//System.out.println(registerLink.getRect());//address will be printed
		Rectangle rect = registerLink.getRect();
		//fetching the dimension along with height and width
		System.out.println(rect.getDimension());
		System.out.println(rect.height);
		System.out.println(rect.width);
		System.out.println(rect.getHeight());
		System.out.println(rect.getWidth());
		
		System.out.println("--------");
		//fetching the point coordinates along with X and Y offsets
		System.out.println(rect.getPoint());
		System.out.println(rect.x);
		System.out.println(rect.getX());
		System.out.println(rect.y);
		System.out.println(rect.getY());
		
		driver.quit();
		

	}

}
