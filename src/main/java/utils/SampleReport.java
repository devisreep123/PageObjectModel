package utils;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SampleReport {
	
	
	@Test
	public void generateReport() {
		
		// start Report
		ExtentReports report = new ExtentReports("./reports/Result.html", false);
		
		// start Test
		ExtentTest test = report.startTest("TC004", "To verify IRCTC REgistration for the new uer sign up");
		
		test.assignAuthor("Sreedevi");
		
		test.assignCategory("Functional");
		
		// log test steps
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		test.log(LogStatus.PASS	, "The application got launcehd with the give url successfully");
		
		// end test
		report.endTest(test);
		
		// end report
		report.flush();
		
	}

}
