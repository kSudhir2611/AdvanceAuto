package testngPackage;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyTestListener implements ITestListener
{

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Method start execution: "+result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Method  execution success: "+result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Method  execution failed: "+result.getName());

	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Method execution skipped: "+result.getName());

	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		System.out.println("Method execution failed due to timeout: "+result.getName());

	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test start");

	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Finished");
	}
	
}
