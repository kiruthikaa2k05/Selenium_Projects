package Assessments;

import java.time.Duration;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assessment_iceHrm2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://icehrmpro.gamonoid.com/login.php?logout=1");
		//valid name
				driver.findElement(By.id("username")).sendKeys("admin");
				//valid pass
				driver.findElement(By.id("password")).sendKeys("admin");
				
				//login
				driver.findElement(By.xpath("//button[.='Log in ']")).click();
				
				//validating dashboard
				if(driver.getCurrentUrl().equals("https://icehrmpro.gamonoid.com/?g=admin&n=dashboard&m=admin_Admin")) {
					System.out.println("yes");
				}
				else {
					System.out.println("No");
				}
				//clicking emp dropdown
				driver.findElement(By.xpath("//span[.='Employees']/parent::a/parent::li")).click();
				//clicking emp
				driver.findElement(By.xpath("//a[@href=\"https://icehrmpro.gamonoid.com/?g=admin&n=employees&m=admin_Employees\"]/parent::li")).click();
				
				//clicking filter emp
				driver.findElement(By.xpath("//span[.='Filter Employees']")).click();
	
				//select dept
				WebElement dropdown = driver.findElement(By.id("rc_select_5"));
				dropdown.click();
				driver.findElement(By.cssSelector("[title='Development Center']")).click();
				
				//save
				driver.findElement(By.xpath("//div[@id='rc_unique_3']/../..//span[.='Save']")).click();
				driver.findElement(By.id("rc_select_8")).click();
				driver.findElement(By.cssSelector("[title='Project Manager']")).click();
				driver.findElement(By.xpath("//div[@id='rc_unique_3']/../..//span[.='Save']")).click();

	}

}
