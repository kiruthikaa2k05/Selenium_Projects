package Practice;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoHardAssertion {
	
	@Test
	public void testMethod() {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.google.com/");
		String expectedVal="GOogle";
		String actualVal=driver.getTitle();
		
		//hard assertion
		//Assert.assertEquals(actualVal,expctedVal);
		assertEquals(actualVal,expectedVal);
		

		if(actualVal.equals(expectedVal)) {
			System.out.println("Status :Passed");
		}
		else {
			System.out.println("Status : Failed");
		}
		//System.out.println("Test status : Passed");
	}

}
