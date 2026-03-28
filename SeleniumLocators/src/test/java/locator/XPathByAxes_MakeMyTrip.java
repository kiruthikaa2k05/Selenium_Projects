package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathByAxes_MakeMyTrip {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.makemytrip.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//p[text()='For Your Dream Europe Trip: Get Up to 40%OFF*']/parent::div/parent::div/parent::div/child::div[@class='sliderFoot']/child::div/child::a")).click();

	}

}
