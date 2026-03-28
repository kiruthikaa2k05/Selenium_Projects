package Demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearningExtentReports {
	@Test
	public void practice() {
		
		//create a new test
		ExtentReports test=new ExtentReports();
		//create a reporter
		ExtentSparkReporter spark=new ExtentSparkReporter("./Reports/sample_reports.html");
		test.attachReporter(spark);
		
		ExtentTest ref = test.createTest("Sample Test");
		//logging
		ref.info("---Started test execution---");
		ref.pass("---Test Step has been passed---");
		ref.fail("---Test Step has been failed---");
		//write the report
		test.flush();
		
		
	}

}
