package WebDriverInterrogationMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleVerification {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		Thread.sleep(2000);
		//fetching the title
		String expectedTitle="Demo Web Shop";
		String title=driver.getTitle();
		if(title.equals(expectedTitle)) {
			System.out.println("The navigation is successfull");
		 }
		else {
			System.out.println("Not successfull");
		}
		driver.quit();

	}

}
