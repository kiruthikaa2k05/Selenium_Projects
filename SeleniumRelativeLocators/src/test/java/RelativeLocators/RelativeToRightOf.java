package RelativeLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeToRightOf {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		//click on swtichTo drop down
		driver.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.linkText("WebTable"))).click();
          //rightOf --overloaded method which accepts both by type object or webelement
		//executing near method
		WebElement firstname=driver.findElement(RelativeLocator.with(By.cssSelector("[placeholder=\"First Name\"]")));
		driver.findElement(RelativeLocator.with(By.tagName("input")).near(firstname,500)).sendKeys("abdfe");
	}

}
