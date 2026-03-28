package WebDriverInterrogationMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandlesTask1_java {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		
		//fetching parent window ID
		String parentID=driver.getWindowHandle();
		System.out.println("Parent window ID : "+parentID);
		
		String Fbstring="",Xstring="";
		
		//path of FB
		driver.findElement(By.xpath("//a[.='Facebook']")).click();
		//printing Id's from collection
		Set<String> allwindows=driver.getWindowHandles();
		System.out.println(allwindows);
		
		for (String s : driver.getWindowHandles()) {
			if(!s.equals(parentID)) {
				Fbstring=s;
				break;
			}
		}
		//FB Id
		System.out.println("FB :"+Fbstring);
		
		Thread.sleep(2000);
		
		//X path
		driver.findElement(By.xpath("//a[.='Twitter']")).click();
		//printing all ID's from collection
		Set<String> allwindows1=driver.getWindowHandles();
		System.out.println(allwindows1);
		
		for (String s : driver.getWindowHandles()) {
			if(!s.equals(parentID) && !s.equals(Fbstring)) {
				Xstring=s;
			}	
		}
		//X Id
		System.out.println("X :"+Xstring);

//		//printing ID's from the collection
//		for (String string : allwindows) {
//			System.out.println(string);
//		}
		
//		//path of twitter
//		driver.findElement(By.xpath("//a[.='Twitter']")).click();
//		Thread.sleep(2000);
//		
//		//printing window ID's by set<String> object
//		Set<String> allwindows1=driver.getWindowHandles();
//		System.out.println("Window ID's of both parent and child :"+allwindows);
//		
//		//removing parentID
//		allwindows.remove(parentID);
//		
//		//printing ID's from the collection
//		for (String string : allwindows) {
//			System.out.println(string);
//		}
		
		//quiting the browser
		//driver.quit();

	}

}
