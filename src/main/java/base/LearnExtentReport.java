package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearnExtentReport {

	public static void main(String[] args) {
		
		//step 1: create  folder as reports and set the path of the report
		ExtentSparkReporter report = new ExtentSparkReporter("./reports/result.html");
		//report.getReportObserver();
		//step 2: Create a object for Extent report to atttach the captured to result.html
		ExtentReports extent = new ExtentReports();
		extent.attachReporter(report);
		
		
		ExtentTest test = extent.createTest("Login Functionality","Login with valid credential");
		test.pass("Login is successful",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/sampleimage.JPG").build());
		test.fail("Login is not succcessful",MediaEntityBuilder.createScreenCaptureFromPath(".././snap/sampleimage.JPG").build());
		test.assignCategory("Smoke");
		test.assignAuthor("Eswari");
	
		//mandatory Step
		extent.flush();//to write the report step into the physical file
		
	}

}
