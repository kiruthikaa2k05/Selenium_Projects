package Assessments;

import static org.testng.Assert.assertEquals;

import java.time.Duration;
import java.util.List;

import javax.swing.text.html.Option;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class assessment3TestCase2 {
WebDriver driver=null;
	
	@Test(priority = -1)
	public void launchingBrowser() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
	driver= new ChromeDriver(options);
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@Test(priority = 1,dependsOnMethods = "launchingBrowser")
	public void login() throws InterruptedException {
		//url
		driver.get("https://www.saucedemo.com/");
		//username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//login button
		driver.findElement(By.id("login-button")).click();
		Thread.sleep(5000);
	}
	
	@Test(priority = 2,dependsOnMethods  = "login")
	public void validateProductPage() {
		WebElement prd = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		String actualVal=prd.getText();
		String expectedVal="Swag Labs";
		
		assertEquals(actualVal, expectedVal);
		
		if(actualVal.equals(expectedVal) || actualVal.contains(expectedVal)) {
			System.out.println("Validated");
		}
		else {
			System.out.println("Not validated");
		}
	}
	
	@Test(priority = 3,dependsOnMethods = "validateProductPage")
	public void addToCart() {
		//adding product 1 to cart
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
		//adding product 2 to cart
		driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-bike-light\"]")).click();
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test(priority = 4,dependsOnMethods = "addToCart")
	public void verifyCart() {
		//click cart logo
		driver.findElement(By.xpath("//div[@id=\"shopping_cart_container\"]")).click();
		//verify cart items
	     List<WebElement> ActualcartItems = driver.findElements(By.cssSelector("[data-test=\"cart-list\"]"));
	     String ExpectedcartItems="";
	     
	     for (WebElement cartProducts : ActualcartItems) {
	    	 ExpectedcartItems+=cartProducts.getText();	
	    	 //assertEquals(ActualcartItems,ExpectedcartItems);
		     if(ExpectedcartItems.contains("Sauce Labs Backpack") && ExpectedcartItems.contains("Sauce Labs Bike Light")) {
		    	 System.out.println("Validated");
		     }
		     else {
		    	 System.out.println("Not validated");
		     }
		}     
	}
	
	@SuppressWarnings("unlikely-arg-type")
	@Test(priority = 5,dependsOnMethods = "verifyCart")
	public void checkOut() {
		//clicking checkout button
		driver.findElement(By.id("checkout")).click();
		//firstname
		driver.findElement(By.id("first-name")).sendKeys("Abc");
		//lastname
		driver.findElement(By.id("last-name")).sendKeys("mno");
		//pincode
		driver.findElement(By.id("postal-code")).sendKeys("123456");
		//continue
		driver.findElement(By.id("continue")).click();
		
		String totalPrice = driver.findElement(By.cssSelector("[class='summary_total_label']")).getText();
		if(totalPrice.equals("Total: $43.18")) {
			System.out.println("Actual amount and expected amount are equal");
		}
		else {
			System.out.println("Actual amount and expected amount are not equal");
		}
	}
	
	@Test(priority = 7,dependsOnMethods ="login" )
	public void logout() {
		driver.findElement(By.xpath("//div[@class=\"bm-burger-button\"]")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}
}
