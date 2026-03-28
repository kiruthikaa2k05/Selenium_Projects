package PopUps;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowHandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		
		//clicking on view more of laptop
		driver.findElement(By.xpath("//h2[.='Laptop']/..//button")).click();
		//switching the tool control to the child window to perform actions on its WE
		
		String ParentID=driver.getWindowHandle();
		//fetching all window ID's
		Set<String> allwindows = driver.getWindowHandles();
		//removing parent ID
		allwindows.remove(ParentID);
		for (String s: allwindows) {
			//switching to child window
			driver.switchTo().window(s);
		}
		
		//clicking add to cart in child window
		WebElement addtocart=driver.findElement(By.xpath("//button[.='Add to Cart']"));
		addtocart.click();
		addtocart.click();
		Thread.sleep(2000);
		
		//clicking cart logo
		WebElement cartLogo=driver.findElement(By.xpath("//*[local-name()='svg']"));
		cartLogo.click();
		Thread.sleep(2000);
		
		//verifying if the shopping list is available or not
		WebElement shoppingList=driver.findElement(By.tagName("h2"));
		if(shoppingList.isDisplayed()) {
			System.out.println("test case status : pass");
		}
		else {
			System.out.println("Test case status : fail");
		}
		
		
		driver.close();
		driver.quit();
	}

}
