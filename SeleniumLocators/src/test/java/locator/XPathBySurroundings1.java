package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathBySurroundings1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/duplicate?sublist=0&scenario=1");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//section[.='X Path']")).click();
		//driver.findElement(By.xpath("//section[.='Duplicate Elements ']")).click();
		driver.findElement(By.xpath("//label[.=' RedMi '] /..//input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[.='Samsung'] /..//input")).click();
		
		

	}

}
