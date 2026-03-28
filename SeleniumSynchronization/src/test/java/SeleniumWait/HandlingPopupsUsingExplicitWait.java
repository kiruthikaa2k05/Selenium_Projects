package SeleniumWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HandlingPopupsUsingExplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 WebDriver driver = new ChromeDriver();
		 //universal scope or global scope
		 WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		 driver.get("https://www.flipkart.com/");
		 WebElement closebtn = driver.findElement(By.cssSelector("[class=\"b3wTlE\"]"));
		 wait.until(ExpectedConditions.visibilityOf(closebtn));
		 closebtn.click();
		 
		

	}

}
