package demo;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LearningExtentReports {
@Test
public void  practice() {
	//Create a new Test
	ExtentReports test=new ExtentReports();
	//create a reporter
	ExtentSparkReporter spark=new ExtentSparkReporter("./reports/sample_report.html");
	test.attachReporter(spark);
	ExtentTest ref=test.createTest("Sample Test");
	//logging
	ref.info("----Started Execution---");
	ref.pass("---The Test step has passes---");
	ref.fail("----The step has failed----");
	
	//write the report
	test.flush();
}
}
