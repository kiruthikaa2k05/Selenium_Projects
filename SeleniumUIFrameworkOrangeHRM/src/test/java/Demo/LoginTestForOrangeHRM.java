package Demo;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.orangehrm.seleniumiuframwork.generic_utility.FileUtility;
import com.orangehrm.seleniumiuframwork.generic_utility.WebDriverUtility;
import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class LoginTestForOrangeHRM {

	@Test
	public void login() throws IOException {
		ExtentReports extent=new ExtentReports();
		ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/login_report.html");
		extent.attachReporter(spark);
		ExtentTest test = extent.createTest("Login Test");
		
		
		
		WebDriver driver=new ChromeDriver();
		WebDriverUtility wu=new WebDriverUtility(driver);
		FileUtility fu=new FileUtility();
		LoginPage lp=new LoginPage(driver);
		
		wu.configMaximizedBrowser();
		wu.waitForElementsToLoad(20);
		String urlPath = fu.getPropertyKeyValue("url");
		String un = fu.getPropertyKeyValue("username");
		String pwd = fu.getPropertyKeyValue("password");
		
		//navigating to the application
		wu.navigateToApplication(urlPath);
	    //test.log(Status.INFO, "Navigated to Orange HRM Page");
		test.info("Navigated to Orange HRM Page");
		lp.login(un, pwd);
		//test.log(Status.PASS,"Login successfull");
		test.pass("Login successfull");
		extent.flush();
		
		
		
		
		
		
	}

}
