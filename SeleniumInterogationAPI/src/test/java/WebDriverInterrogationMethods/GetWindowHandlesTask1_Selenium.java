package WebDriverInterrogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesTask1_Selenium {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//path of FB
		driver.findElement(By.xpath("//a[.='Facebook']")).click();
		Thread.sleep(2000);
		
		//path of X
		driver.findElement(By.xpath("//a[.='Twitter']")).click();
		Thread.sleep(2000);
		
		Set<String> allwindows=driver.getWindowHandles();
		for (String s : allwindows) {
			driver.switchTo().window(s);
			String title=driver.getTitle();
			System.out.println("Id:"+s);
			System.out.println("title : "+title);
		}
		

	}

}
