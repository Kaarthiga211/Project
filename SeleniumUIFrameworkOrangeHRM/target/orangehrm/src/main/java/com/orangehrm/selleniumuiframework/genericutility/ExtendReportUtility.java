package com.orangehrm.selleniumuiframework.genericutility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtendReportUtility {
public static ExtentReports extent;

public static void  ExtentInstance() {
	if(extent==null) {
		ExtentSparkReporter spark=new ExtentSparkReporter("./reports/test_result.html");
		//Reporterconfiguration
		spark.config().setReportName("OrangeHRM UI Automation Report");
		spark.config().setDocumentTitle("Test Results");
		extent=new ExtentReports();
		extent.attachReporter(spark);
		extent.setSystemInfo("Automation Tester","Reshab Patel");
		extent.setSystemInfo("UI_Automation_Framework","Selenium TestNG");
		
	}
	
	return ;
}
}
