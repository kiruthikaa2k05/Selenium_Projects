package HandlingDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetFirstSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		//locating the listbox
		WebElement listbox=driver.findElement(By.id("cars"));
		//Select class object
		Select sel = new Select(listbox);
		//Select few options
		sel.selectByVisibleText("Audi");
		Thread.sleep(2000);
		sel.selectByVisibleText("Volvo");
		Thread.sleep(2000);
		sel.selectByVisibleText("Saab");
	System.out.println(sel.getFirstSelectedOption().getText());	
	driver.quit();

	}

}
