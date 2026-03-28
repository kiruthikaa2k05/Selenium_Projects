package Assessments;
import java.awt.image.TileObserver;
import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class assessment5b {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);
		
		//clicking orangehrmINC
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Thread.sleep(2000);
		
		//parent windowID
		String parentID=driver.getWindowHandle();
		
		//storing all the window Id's in set collection
		Set<String> allwindows = driver.getWindowHandles();
		
		//removing parent window ID
		allwindows.remove(parentID);
		for (String s: allwindows) {
			driver.switchTo().window(s);
		}
	//current window url
	String currentUrl = driver.getCurrentUrl();
	
	//validating the current window url
	if(currentUrl.contains("orangehrm.com")) {
		System.out.println("Validated");
	}
	else {
		System.out.println("Not validated");
	}
	
	//fetching current window title and verifying the title
	if(driver.getTitle().isEmpty()) {
		System.out.println("Empty");
	     }
	else {
		System.out.println("Not empty");
	}
	
	Thread.sleep(2000);
	//closing the child window
     driver.close();
     
     //switching back to parent window
     driver.switchTo().window(parentID);
     //verifying the parent window is still displaying
     
     String currenturl=driver.getWindowHandle();
     if(currenturl.equals(parentID)) {
    	 System.out.println("Still displaying");
     }
     else {
    	 System.out.println("Not displaying");
     }
     
     //quit the browser
     driver.quit();
	}

}
//TEST CASE
/* 1.       Navigate to
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

2.       Wait until the login page loads completely

3.       Locate the hyperlink text “OrangeHRM, Inc” below the login form

4.       Capture the current window handle (Parent Window ID)

5.       Click on the “OrangeHRM, Inc” link

6.       Wait for a new browser tab/window to open

7.       Fetch all window handles

8.       Switch driver control to the newly opened child window

9.       Validate that the URL contains orangehrm.com

10.  Validate that the page title is not empty

11.  Close the child window

12.  Switch back to the parent window

13.  Verify that the login page is still displayed

14.  Close the browse */
