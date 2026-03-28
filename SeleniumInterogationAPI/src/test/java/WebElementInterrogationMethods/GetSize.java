package WebElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		//locate search button
		WebElement searchBtn=driver.findElement(By.id("nav-search-submit-button"));
		//printing dimensions
		Dimension dims = searchBtn.getSize();
		System.out.println("The dimension of search bar"+dims);
		
		//fetch height
		System.out.println(dims.height);//dimension method--final variable
		System.out.println(dims.getHeight());//getter method
		System.out.println(searchBtn.getCssValue("height"));
		

		//fetch width
		System.out.println(dims.width);//dimension method
		System.out.println(dims.getWidth());//getter method
		System.out.println(searchBtn.getCssValue("width"));
		
		driver.quit();
	}

}
