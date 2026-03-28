package PopUps;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		Thread.sleep(2000);
		
		driver.findElement(By.partialLinkText("Alert with Textbox")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("[onclick=\"promptbox()\"]")).click();
		
		//handling the alert
		Alert prompt = driver.switchTo().alert();
		Thread.sleep(2000);
		prompt.sendKeys("max");
		Thread.sleep(2000);
		System.out.println(prompt.getText());
		prompt.accept();
		driver.quit();
		

	}

}
