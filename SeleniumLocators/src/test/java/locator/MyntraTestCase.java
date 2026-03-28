package locator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyntraTestCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");
		Thread.sleep(2000);
		
		//seraching for dress
		driver.findElement(By.cssSelector("[class=\"desktop-searchBar\"]")).sendKeys("frock");
		//clicking search button
        driver.findElement(By.cssSelector("[class=\"myntraweb-sprite desktop-iconSearch sprites-search\"]")).click();
        //clicking first product
        driver.findElement(By.cssSelector("[title=\"Nauti Nati Girls Linen Floral Print Frock\"]")).click();
       
        //clicking wishlist
        String parent=driver.getWindowHandle();
        String allwindows = driver.getWindowHandle();
        for (String s : args) {
        	if(!s.equals(parent)) {
        		driver.switchTo().window(s);
        	}
			
		}
        driver.findElement(By.cssSelector("[class=\"myntraweb-sprite pdp-notWishlistedIcon sprites-notWishlisted pdp-flex pdp-center \"]")).click();
        //driver.quit();
	}

}
