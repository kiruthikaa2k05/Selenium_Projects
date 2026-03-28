package Assessments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class assessment3TestCase1 {
	
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
	
	@Test(priority = 2,dependsOnMethods = "login")
	public void products() {
		//clicking price logo
		 WebElement priceLogo = driver.findElement(By.cssSelector("[class=\"product_sort_container\"]"));
	     Actions act=new Actions(driver);
		act.click(priceLogo).pause(8000).sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER).perform();
		//adding to cart
		driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
	}
	
	@Test(priority = 3,dependsOnMethods = "products")
	public void verifyCart() {
		//click cart logo
		driver.findElement(By.xpath("//div[@id=\"shopping_cart_container\"]")).click();
		//verify cart items
	     List<WebElement> ActualcartItems = driver.findElements(By.cssSelector("[data-test=\"cart-list\"]"));
	     String ExpectedcartItems="";
	     
	     for (WebElement cartProducts : ActualcartItems) {
	    	 ExpectedcartItems+=cartProducts.getText();	
	    	 //assertEquals(ActualcartItems,ExpectedcartItems);
		     if(ExpectedcartItems.contains("Sauce Labs Fleece Jacket")) {
		    	 System.out.println("Validated");
		     }
		     else {
		    	 System.out.println("Not validated");
		     }
		}     
	}
	
	@Test(priority = 4,dependsOnMethods = "verifyCart")
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
	
	}
	
	@Test(priority =7,dependsOnMethods = "login")
	
	public void logout() {
		driver.findElement(By.xpath("//div[@class=\"bm-burger-button\"]")).click();
		driver.findElement(By.linkText("Logout")).click();
		driver.quit();
	}
}
