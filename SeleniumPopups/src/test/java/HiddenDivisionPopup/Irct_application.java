package HiddenDivisionPopup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Irct_application {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--disable-notifications");
		
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		Thread.sleep(7000);
		
		//clicking popup button
		driver.findElement(By.cssSelector("[class=\"btn btn-primary\"]")).click();
		Thread.sleep(4000);
		//clicking date field
		driver.findElement(By.cssSelector("[class=\"ng-tns-c69-9 ui-inputtext ui-widget ui-state-default ui-corner-all ng-star-inserted\"]")).click();
		//clicking date 11 from the calendar
		//driver.findElement(By.xpath("//a[.='11']")).click();
		
		//dynamic clicking 
		driver.findElement(By.xpath("//div[@class=\"ui-datepicker-header ui-widget-header ui-helper-clearfix ui-corner-all ng-tns-c69-9\"]/following::a[.='11']")).click();
	

	}

}
