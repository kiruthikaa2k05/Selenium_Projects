package WindowScrolling;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class ScrollByAndTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.amazon.in/");
		Thread.sleep(2000);
		//scrolling by using scroll by
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,1500)");
		
		//scrolling by using scroll to
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,1000");
		Thread.sleep(4000);
		js.executeScript("window.scrollTo(0,1500");
		
		
		
		
		

	}

}
