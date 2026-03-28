package FileUploadPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount");
		Thread.sleep(2000);
		
		
		//for uploading files the input type should be file type{NOTE}
		//clicking experienced
		driver.findElement(By.xpath("//div[@class=\"focusable optionWrap  \" and  @data-val=\"exp\"]")).click();
		//clicking and uploading file
		driver.findElement(By.id("resumeUpload")).sendKeys("C:\\Users\\kirut\\OneDrive\\KIRUTHIKAA\\Documents\\SRP.pdf");

	}

}
