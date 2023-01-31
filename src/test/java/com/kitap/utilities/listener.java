package com.kitap.utilities;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException; 

import org.apache.commons.lang.exception.ExceptionUtils;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.kitap.base.BaseTest;


public class listener extends BaseTest implements ITestListener {

	public listener() throws IOException {
		super();
	}

	public synchronized void onStart(ITestContext context) {
		try {
			ExtentManager.getReport();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//ExtentManager.createTest(context.getName(), context.getName());

	}

	public synchronized void onTestFailure(ITestResult result) {
		ExtentManager.getTest().fail(result.getThrowable());
		try {
			System.out.println("Test failed: " + result.getName());
			takeSnapShot(result.getMethod().getMethodName());
			ExtentManager.attachImage(); 
			
			JiraServiceProvider jiraSp = new JiraServiceProvider("https://team-16703161640122.atlassian.net",
		            "alekhya.k@kairostech.com", "1Wp4dIOMtYAPShYWslDh4DC3", "RA");
		      String issueSummary = result.getMethod().getConstructorOrMethod().getMethod().getName()
		            + "got failed due to some assertion or exception";
		      String issueDescription = result.getThrowable().getMessage() + "\n";
		      issueDescription.concat(ExceptionUtils.getFullStackTrace(result.getThrowable()));
		      jiraSp.createJiraTicket("Bug", issueSummary, issueDescription, "KA");

		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public synchronized void onFinish(ITestContext context) {
		ExtentManager.flushReport();
		
	}

}



