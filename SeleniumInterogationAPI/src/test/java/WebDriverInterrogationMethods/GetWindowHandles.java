package WebDriverInterrogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/browser?sublist=0");
		Thread.sleep(2000);
		
		//fetching the window ID of parent window
		String parentID=driver.getWindowHandle();
		System.out.println("Parent Window ID"+parentID);
		
		//clicking on a tab to get child window popup
		driver.findElement(By.xpath("//h2[.='Watches']/..//button")).click();
		Thread.sleep(2000);
		Set<String> allWindows=driver.getWindowHandles();
		System.out.println("Window Id's of both parent and child: "+allWindows);
		
		//removing parent window ID from set<String> object
		allWindows.remove(parentID);
		
		//child ID is still in Set<String> object
		System.out.println(allWindows);
		
		//fetching the child ID from the collection
		for (String string : allWindows) {
			System.out.println("Window ID of child: "+string);
			
		}
		

	}

}
