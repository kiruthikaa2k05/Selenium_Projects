package WebElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttrubuteValues {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		WebElement search=driver.findElement(By.id("small-searchterms"));
		//fetching attribute value for a static attribute
		System.out.println(search.getAttribute("id"));//id="small-searchterms"
		System.out.println(search.getDomAttribute("id"));//id="small-searchterms"
		System.out.println(search.getDomProperty("id"));//id="small-searchterms"
		
		//fetching the attribute value for a dynamic attribute
		
		search.sendKeys("Mobile");
		System.out.println(search.getAttribute("value"));//value=Mobile
		System.out.println(search.getDomAttribute("value"));//value=default value i.e=Search Stores
		System.out.println(search.getDomProperty("value"));//value=Mobile
		
		driver.quit();

	}

}
