package testngPackage;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class Test2 
{
	@Test(groups= {"sanity"})
	public void method1() 
	{
		//Assert.fail();
		System.out.println("This is method one-2 "+Thread.currentThread().getId());
	}
	
	@Test(groups= {"sanity"})
	public void method2() 
	{
		System.out.println("This is method two-2 "+Thread.currentThread().getId());
	}
	
	@Test(groups=("sanity"),retryAnalyzer = testngPackage.MyRetryAnalyzer.class)
	public void method3() 
	{
		Assert.fail();
		System.out.println("This is method three-2 "+Thread.currentThread().getId());
	}
	
	@Test(groups= {"sanity"})
	public void method4() 
	{
		
		System.out.println("This is method four-2 "+Thread.currentThread().getId());
	}
	
	@Test(groups = {"sanity"})
	public void method5() 
	{
		
		System.out.println("This is method five-2 "+Thread.currentThread().getId());
	}
}
