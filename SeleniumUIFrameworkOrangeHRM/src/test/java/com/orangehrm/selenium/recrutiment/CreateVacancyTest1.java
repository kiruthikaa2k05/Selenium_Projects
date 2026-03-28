package com.orangehrm.selenium.recrutiment;

import com.orangehrm.seleniumiuframwork.generic_utility.ActionsHelper;
import com.orangehrm.seleniumiuframwork.generic_utility.BaseClass;
import com.orangehrm.seleniumiuframwork.generic_utility.BaseClass_Propertites;
import com.orangehrm.seleniumiuframwork.generic_utility.ExcelUtility;
import com.orangehrm.seleniumuiframework.object_repository.AddCandidateRecruitmentPage;
import com.orangehrm.seleniumuiframework.object_repository.AddVacancyPage;
import com.orangehrm.seleniumuiframework.object_repository.DashBoardPage;
import com.orangehrm.seleniumuiframework.object_repository.RecruimentPage;
import com.orangehrm.seleniumuiframework.object_repository.VacanciesPage;

import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;



public class CreateVacancyTest1 extends BaseClass_Propertites {
	
	@Test
	//TestCase 3
	public void addVacancy() throws IOException {
		DashBoardPage dbp=new DashBoardPage(driver);
		RecruimentPage rp=new RecruimentPage(driver);
		ActionsHelper ah=new ActionsHelper(driver);
		ExcelUtility eu=new ExcelUtility();
		VacanciesPage vp=new VacanciesPage(driver);
		AddVacancyPage addvp=new AddVacancyPage(driver);
		//Actions action = new Actions(driver);
			
		//dashboard
		dbp.clickRecruitmentLink();
		//recruiment page
		rp.clickVancanciesLink();
		//click add 
		rp.clickAddButton();
		//recruiment vacancy
		
		String path="C:\\OrangeHRM_TestScript_Data\\Book1.xlsx";
		eu.loadExcelFile(path,"Sheet1");
		String vacancyName = eu.getDataFromSingleCell(1, 1);
		String description = eu.getDataFromSingleCell(1, 2);
		String hiringManager = eu.getDataFromSingleCell(1, 3);
		String positions = eu.getDataFromSingleCell(1, 4);
		
		addvp.setVacancyNameTextField(vacancyName);
		
		ah.navigateDownDropDown(addvp.getJobTitle(),3);
		addvp.setDescriptionTextField(description);
		
		ah.scrollDownAutoSuggestion(addvp.getHiringManagerTextField(),hiringManager, 5, 1);
		addvp.setNumberOfPositionTextField(positions);
		addvp.clickSaveBtn();
		
		//assertion
		List<WebElement> valiationVacancy = driver.findElements(By.xpath("//div[@class=\"oxd-table-row oxd-table-row--with-border\"]"));
		  
        for(WebElement vacancy: valiationVacancy) {
        	String name=vacancy.getText();
        	Assert.assertEquals(name,eu.getDataFromSingleCell(1, 1));
        	if(name.contains(eu.getDataFromSingleCell(1, 1))) {
        		Reporter.log("passed");
        	}else {
        		Reporter.log("failed");
        	}
        	
        	
        }		
	}
	
	//TestCase 2
	@Test
	public void addCandidate() {
		DashBoardPage dbp=new DashBoardPage(driver);
		RecruimentPage rp=new RecruimentPage(driver);
		ActionsHelper ah=new ActionsHelper(driver);
		ExcelUtility eu=new ExcelUtility();
		AddCandidateRecruitmentPage acrp=new AddCandidateRecruitmentPage(driver);
		//dashboard
	    dbp.clickRecruitmentLink();
	    //click add button
	    rp.clickAddButton();
	    //firstname
	    acrp.setFirstName("ABC");
	    //middle name
	    acrp.setMiddleName("lmn");
	    //lastname
	    acrp.setLastName("xyz");
	    //vacancy drop down
	    ah.navigateDownDropDown(acrp.getVacancyDropDown(), 3);
	    //email id
	    acrp.setEmailId("abc@gmail.com");
	    //phone no
	    acrp.setPhno("1234567891");
	    //save button
	    acrp.clickSaveButton();
	    
	   
	    
	
		
	}

}
