package webdriver_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quit {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
driver.get("https://demowebshop.tricentis.com");
Thread.sleep(2000);
//clicking on FB in the follow section
driver.findElement(By.linkText("Facebook")).click();
Thread.sleep(2000);

//clicking on Twitter in the follow section
driver.findElement(By.linkText("Twitter")).click();
Thread.sleep(2000);

//driver.close();//it'll close the selenium controlled tab i.e parent tab
driver.quit();//it'll close all the tabs
	}

}
