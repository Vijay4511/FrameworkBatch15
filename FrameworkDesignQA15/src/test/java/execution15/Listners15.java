package execution15;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import base.initcls;
public class Listners15 implements ITestListener{
	
	ExtentReports extent = ReportingCls.GenerateReport();
	ExtentTest test;

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
	 test =extent.createTest(result.getName());
	
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		
		test.pass("Test case passed Successfully "+result.getName() );
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		test.fail("Test case Failed  "+result.getName() );
		
		initcls initobj = new initcls();
		
		WebDriver driver = null;
		
			try {
				driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
			} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	
		String screenpath = null;
		try {
			screenpath = initobj.GetScreenshot(driver, result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		test.addScreenCaptureFromPath(screenpath);
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
		extent.flush();
		
	}
	
	

}
