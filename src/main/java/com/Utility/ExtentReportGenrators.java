package com.Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReportGenrators {
         public static ExtentReports extent;
	public static ExtentReports getExtentReports() {
		
		String path="C:\\Users\\Dell\\eclipse-workspace\\BatchSep_OctDSS\\Reports\\index.html";
		
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setDocumentTitle("Test Execution Report");
		reporter.config().setReportName("Automation Report");
		reporter.config().setTheme(Theme.DARK);
		
		extent=new ExtentReports();
		extent.attachReporter(reporter);
		
		extent.setSystemInfo("System", "XYZ");
		extent.setSystemInfo("QA", "govin");
		extent.setSystemInfo("Enviornment", "Stage");
	    extent.setSystemInfo("Browser", "Chrome");	
		return extent;
	}
}
