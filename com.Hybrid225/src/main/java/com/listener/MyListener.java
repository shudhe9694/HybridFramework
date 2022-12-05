package com.listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;
import com.base.BaseClass;
import com.utils.DriverUtils;


public class MyListener extends BaseClass implements ITestListener {

	public void onTestStart(ITestResult result) {
    test=report.createTest(result.getName());
    
		
	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,"Testcase passed");
		
	}

	public void onTestFailure(ITestResult result) {
	
		
		test.log(Status.FAIL, "Testcase failure");
		try {
			String path=DriverUtils.getScreenshot(result.getName());
			test.addScreenCaptureFromPath(path);
		}catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	

	public void onTestSkipped(ITestResult result) {
	test.log(Status.SKIP, "Skipped Testcase");
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		reportInit();
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		report.flush();
	}

}
