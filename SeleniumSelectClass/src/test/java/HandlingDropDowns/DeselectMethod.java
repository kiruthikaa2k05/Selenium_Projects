package HandlingDropDowns;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectMethod {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dropdown/multiSelect?sublist=1");
		Thread.sleep(2000);
		
		Select sel = new Select(driver.findElement(By.id("select-multiple-native")));
		//sel.selectByContainsVisibleText("Fjallraven - Foldsac...");
		sel.selectByContainsVisibleText("John Hardy Women's L...");
		sel.selectByContainsVisibleText("Pierced Owl Rose Gol...");
		sel.selectByContainsVisibleText("Mens Casual Premium ...");
		sel.selectByContainsVisibleText("Mens Cotton Jacket...");
		sel.selectByContainsVisibleText("Solid Gold Petite Mi...");
		sel.selectByContainsVisibleText("White Gold Plated Pr...");
		sel.selectByContainsVisibleText("Pierced Owl Rose Gol...");
		
		//getting all the options in select tag
		List<WebElement> allopt = sel.getOptions();
		for (WebElement opt : allopt) {
			System.out.println(opt.getText());
		}
		
		//deselect by index
		sel.deselectByIndex(0);
		Thread.sleep(2000);
		//deselect by value
		sel.deselectByValue("Mens Casual Premium Slim Fit T-Shirts ");
		Thread.sleep(2000);
		//deselecting by visible text
		sel.deselectByVisibleText("Mens Cotton Jacket...");
		Thread.sleep(2000);
		//deselecting by contains visible text
		sel.deselectByVisibleText("John Hardy Womens");
		Thread.sleep(2000);
		//deselect all
		sel.deselectAll();
		
		

	}

}
