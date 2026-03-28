package WebDriver.ManageMethod;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
//	    Options ref=driver.manage();
//		Window w=ref.window();
//		w.maximize();
/// as the above code is not optimized ,o we are writing this code
		
		//maximize
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//minimize
		driver.manage().window().minimize();
		Thread.sleep(3000);
		
		//fullscreen
		driver.manage().window().fullscreen();
		
	}

}
