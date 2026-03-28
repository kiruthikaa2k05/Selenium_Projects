package FileUploadPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/fileUpload?sublist=0");
		Thread.sleep(2000);
		
		//avoiding the file upload popup
		driver.findElement(By.id("resume")).sendKeys("C:\\Users\\kirut\\AppData\\Local\\Packages\\5319275A.WhatsAppDesktop_cv1g1gvanyjgm\\LocalState\\sessions\\ACF8AE13977FEEC38ADBAFBAD40557267F535F8C\\transfers\\2026-09\\Ethics_in_AI_Gopika_Internal (1) (1).pdf");
		
		

	}

}
