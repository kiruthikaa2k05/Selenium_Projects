package Assessments;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/* Test case-2

1.       Launch browser

2.       Navigate to
https://opensource-demo.orangehrmlive.com/web/index.php/auth/login

3.       Enter Username: Admin

4.       Enter Password: admin123

5.       Click Login

6.       Wait until Dashboard page is displayed

7.       Click Admin from left side menu

8.       Wait until Users page loads

9.       Click Add button

10.  Wait for Add User form to appear

11.  Locate User Role dropdown

12.  Click the dropdown arrow to expand options

13.  Select “Admin”

14.  Verify selected value is displayed inside dropdown field

15.  Re-open dropdown

16.  Select “ESS”

17.  Verify the selected value updates correctly

18.  Click Cancel

19.  Logout

20.  Close browser */
public class assessment5a {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		//name
		driver.findElement(By.name("username")).sendKeys("Admin");
		//pass
		driver.findElement(By.name("password")).sendKeys("admin123");
		//login
		driver.findElement(By.cssSelector("[type=\'submit\']")).click();
		Thread.sleep(6000);
		//admin
		driver.findElement(By.linkText("Admin")).click();
		//user poll drop down
		Thread.sleep(4000);
		
		//click add button
		driver.findElement(By.xpath("//button[@type='button' and @class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")).click();
		Thread.sleep(8000);
		driver.findElement(By.xpath("//i[@class=\"oxd-icon bi-caret-down-fill oxd-select-text--arrow\"]/parent::div/parent::div/child::div[.='-- Select --']/parent::div/parent::div/parent::div/parent::div/child::div/child::label[.='User Role']")).click();
		;
		//Thread.sleep(6000);
		//userRole.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN.ENTER);
		
		

	}

}
