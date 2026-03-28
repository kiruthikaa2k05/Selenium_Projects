package WebDriver.ManageMethod;

import java.awt.Dimension;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAndSetWindowMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		System.out.println(driver.manage().window().getSize());;
		Thread.sleep(2000);
		
		//dimensions dim=new Dimensions(1500,500)
		//driver.manage().window().setSize(new Dimension(1500,500));
		
		System.out.println();

	}

}
