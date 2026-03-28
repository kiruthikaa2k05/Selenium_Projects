package JSPopups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		//clicking on the button trigger the popup
		driver.findElement(By.cssSelector("[class='btn btn-danger']")).click();
		Thread.sleep(4000);
		
		//handling the popup by accepting it
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		
		//habdling the popup by dimissing them
		driver.switchTo().alert().dismiss();
		driver.quit();

	}

}
