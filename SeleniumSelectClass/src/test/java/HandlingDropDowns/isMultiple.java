package HandlingDropDowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultiple {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/select-menu");
		Thread.sleep(2000);
		
		//selecting value
		WebElement val1=driver.findElement(By.id("oldSelectMenu"));
		Select sel = new Select(val1);
		System.out.println(sel.isMultiple());
		
		Thread.sleep(2000);
		
		WebElement val2=driver.findElement(By.id("cars"));
		Select sel1 = new Select(val2);
		System.out.println(sel1.isMultiple());
		driver.quit();
	}

}
