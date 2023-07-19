package testngPackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer
{
	int cnt=0;int retryLimit=3;

	@Override
	public boolean retry(ITestResult result) {
		
		if(cnt < retryLimit) 
		{
			cnt++;
			return true;
		}
		return false;
	}
	
}
