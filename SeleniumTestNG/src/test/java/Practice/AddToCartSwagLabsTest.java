package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AddToCartSwagLabsTest {
	WebDriver driver=null;
	
	@Test(priority = -1)
	public void launchingBrowser() {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		
		 driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}

	@Test(priority = 1,dependsOnMethods = "launchingBrowser")
	public void login() {
		//url
		driver.get("https://www.saucedemo.com/");
		//username
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		//password
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		//login button
		driver.findElement(By.id("login-button")).click();
		
		//verification
		
		WebElement swagLabs = driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		
		if (swagLabs.getText().contains("Swag Labs")) {
		Reporter.log	("Login successfull",true);
		} 
		else {
			Reporter.log("Login failed",false);

		}	
	}
	
		@Test(priority = 3,dependsOnMethods = "login")
		public void addToCart() {
			//adding to cart
			driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			driver.findElement(By.id("add-to-cart-sauce-labs-fleece-jacket")).click();
			
			//verifying
			driver.findElement(By.id("shopping_cart_container")).click();
		List <WebElement> productsInTheCart =driver.findElements(By.cssSelector("[class='cart_contents_container']"));
		String addToCartVerify="";
			
		for (WebElement cartProducts : productsInTheCart) {
				 addToCartVerify+=cartProducts.getText();
				 
				 if(addToCartVerify.contains("Sauce Labs Backpack") && addToCartVerify.contains("Sauce Labs Fleece Jacket")) {
					 System.out.println("Verified and the products are added to the cart successfully");
				 }
				 else {
					 System.out.println("Not verified and the products are not added to the cart");
				 }
			}
			
		}
		
		@Test(priority = 5,dependsOnMethods = "login")
		public void logOut() {
			driver.findElement(By.id("react-burger-menu-btn")).click();
			driver.findElement(By.linkText("Logout")).click();
		
		}
		
	}
	

