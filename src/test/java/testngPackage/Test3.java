package testngPackage;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test3 
{
	@Test(groups= {"reg"},timeOut = 3000)
	public void method1()
	{
		System.out.println("This is method one-3 "+Thread.currentThread().getId());
	}
	
	@Test(groups= {"reg"})
	public void method2() 
	{
		System.out.println("This is method two-3 "+Thread.currentThread().getId());
	}
	
	@Test(groups= {"reg"})
	public void method3() 
	{
		System.out.println("This is method three-3 "+Thread.currentThread().getId());
	}
	
	@Test(groups= {"reg"})
	public void method4() 
	{
		System.out.println("This is method four-3 "+Thread.currentThread().getId());
	}
	
	@Test(groups= {"reg"})
	public void method5() 
	{
		System.out.println("This is method five-3 "+Thread.currentThread().getId());
	}
}
