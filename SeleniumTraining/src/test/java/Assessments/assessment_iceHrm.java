package Assessments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assessment_iceHrm {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://icehrmpro.gamonoid.com/login.php?logout=1");
		//invalid name
		driver.findElement(By.id("username")).sendKeys("Admin1223");
		//invalid pass
		driver.findElement(By.id("password")).sendKeys("hfj");
		
		//login
		 WebElement login = driver.findElement(By.xpath("//button[.='Log in ']"));
		login.click();
		
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
		//clicking skills
        driver.findElement(By.cssSelector("[id=\"tabEmployeeSkill\"]")).click();
        //clicking add new
        WebElement dbox = driver.findElement(By.xpath("//span[.=' Add New']"));
        dbox.click();
    
        if(dbox.isDisplayed()) {
        	System.out.println("Dilog box appears");
        }
        else {
        	System.out.println("No it is not appearing");
        }
        
        //validating popup
         WebElement dbox1 = driver.findElement(By.xpath("//span[@class=\"anticon anticon-close ant-modal-close-icon\"]/parent::span/parent::button"));
        dbox1.click();
     
      //logout
     driver.findElement(By.xpath("//i[@class=\"glyphicon glyphicon-user\"]/parent::a")).click();
     driver.findElement(By.xpath("//a[.='Sign out']")).click();

	}

}
