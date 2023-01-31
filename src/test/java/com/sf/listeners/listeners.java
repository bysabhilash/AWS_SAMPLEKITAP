package com.sf.listeners;


import java.io.IOException;   

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.sf.utilities.ExtentManager;

import com.kitap.mobilebase.*;

public class listeners extends BaseTest implements ITestListener {

	public listeners() throws IOException {
		super();
	}

	public synchronized void onStart(ITestContext context) {
		ExtentManager.getReport();
	//	ExtentManager.createTest(context.getName(), context.getName());

	}

	public synchronized void onTestFailure(ITestResult result) {
		ExtentManager.getTest().fail(result.getThrowable());
		try {
			System.out.println("Test failed: " + result.getName());
			takeSnapShot(result.getMethod().getMethodName());
			ExtentManager.attachImage();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public synchronized void onFinish(ITestContext context) {
		ExtentManager.flushReport();
	}

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

}
