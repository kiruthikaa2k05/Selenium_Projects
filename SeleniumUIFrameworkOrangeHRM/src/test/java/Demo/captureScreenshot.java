package Demo;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.orangehrm.seleniumiuframwork.generic_utility.WebDriverUtility;
import com.orangehrm.seleniumuiframework.object_repository.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class captureScreenshot {
	@Test 
	public void screenShot() throws IOException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wu=new WebDriverUtility(driver);
		LoginPage lp=new LoginPage(driver);
		DashBoardPage dsp=new DashBoardPage(driver);
		
		//creating a method for time-stamp
		String timestamp = new SimpleDateFormat("YYYY-MM-DD[hh-mm-ss]").format(new Date());
		
		wu.configMaximizedBrowser();
		wu.waitForElementsToLoad(20);
		wu.navigateToApplication("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		lp.login("Admin","admin123");
		Thread.sleep(5000);
		
		//Capture the screenshot of homepage
		TakesScreenshot ts=(TakesScreenshot)driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File permanent = new File("./Reports/dashboard.png");
		FileHandler.copy(temp, permanent);
		
		//capture the screenshot of web element
		WebElement recruitmentLink = dsp.getRecruitmentLink();
		File tempScr = recruitmentLink.getScreenshotAs(OutputType.FILE);
		File permanentrg = new File("./Reports/recruitmentLink.png");
		FileHandler.copy(tempScr,permanentrg);
		
		
		
		
	}

}
