package com.extent.listeners;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.extent.base.BaseTest;
import com.extent.util.Utilities;
import com.relevantcodes.extentreports.LogStatus;

public class CustomListener extends BaseTest implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		test = rep.startTest(result.getName());
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		test.log(LogStatus.PASS, result.getName());
		rep.endTest(test);
		rep.flush();
	}

	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		
			
			try {
				 Utilities.captureScreenshot(result.getMethod().getMethodName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		test.log(LogStatus.FAIL, result.getName());
		test.log(LogStatus.FAIL, test.addScreenCapture(Utilities.screenshotpath));
		rep.endTest(test);
		rep.flush();
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

}
