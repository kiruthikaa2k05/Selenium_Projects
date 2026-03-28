package HandlingDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectByValue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		Thread.sleep(2000);
		
		//locating dropdown skills
		WebElement dropdown=driver.findElement(By.id("Skills"));
		//making obj of select class
		Select sel = new Select(dropdown);
		//calling select method by value
		sel.selectByValue("Data Analytics");
		Thread.sleep(2000);
		driver.quit();

	}

}
