package testngPackage;

import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Listeners;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(testngPackage.MyTestListener.class)
public class Test1 
{
	SoftAssert softassert = new SoftAssert();
	
	@Test(groups= {"smoke"},invocationTimeOut =5000,threadPoolSize=3)
	public void method1() 
	{
		
		System.out.println("This is method one-1 "+Thread.currentThread().getId());
	}
	
	
	@Test(groups= {"smoke"})
	public void method2() 
	{
		Assert.fail();
		//System.out.println("My Name is : "+name);
		System.out.println("This is method two-1 "+Thread.currentThread().getId());
	}
	
	@Test(groups= {"smoke"})
	public void method3() 
	{
		System.out.println("This is method three-1 "+Thread.currentThread().getId());
	}
	
	
	@Test(groups= {"smoke"})
	public void method4() 
	{
		System.out.println("This is method four-1 "+Thread.currentThread().getId());
	}
	
	@Test(groups= {"smoke"},timeOut=1000)
	public void method5() throws InterruptedException 
	{
		Thread.sleep(2000);
		System.out.println("This is method five-1 "+Thread.currentThread().getId());
	}
}
