package Demo;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.orangehrm.seleniumuiframework.object_repository.LoginPage;

public class OrangeHRMLogingUsingDataProvider {
	WebDriver driver;
	@DataProvider(name="LoginData")
	Object[][] getCredentials(){
		return new Object[][] {
			{"Admin","admin123"}
		};
	}
	
	@Test(dataProvider="LoginData")
	public void login(String user,String pass) {
		driver=new ChromeDriver();
		LoginPage lp=new LoginPage(driver);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		lp.login(user, pass);
	}

}
