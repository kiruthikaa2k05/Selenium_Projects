package WebElementInterrogationMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetText_GetTag {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(2000);
		
		WebElement aboutLink=driver.findElement(By.id("navbarDropdown"));
		System.out.println("Name of text or title: "+aboutLink.getText());
		System.out.println("The tagname is: "+aboutLink.getTagName());
		
		driver.quit();

	}

}
