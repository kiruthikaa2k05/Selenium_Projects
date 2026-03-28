package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAttruibute {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='b3wTlE']")).click();
		//driver.findElement(By.className("b3wTlE")).click();
		driver.findElement(By.xpath("//a[@href='/aw-trend-base-at-store?param=987541&ctx=eyJjYXJkQ29udGV4dCI6eyJhdHRyaWJ1dGVzIjp7InRpdGxlIjp7Im11bHRpVmFsdWVkQXR0cmlidXRlIjp7ImtleSI6InRpdGxlIiwiaW5mZXJlbmNlVHlwZSI6IlRJVExFIiwidmFsdWVzIjpbIkZhc2hpb24iXSwidmFsdWVUeXBlIjoiTVVMVElfVkFMVUVEIn19fX19']")).click();

	}

}
