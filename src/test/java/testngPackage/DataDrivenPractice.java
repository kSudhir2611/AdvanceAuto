package testngPackage;

import java.util.ArrayList;
import java.util.Iterator;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDrivenPractice 
{
	//@Test(dataProvider="data3")
	public void personalInformation(String name,String lname,int age,boolean accupation) 
	{
		System.out.println(name+" : "+lname+" : "+age+" : "+accupation);
	}
	
	@Test(dataProvider="data4")
	public void personalInformation1(Object info) 
	{
		System.out.println(info);
	}
	
	
	@DataProvider(name="data")
	public String[][] dataProvide() 
	{
		String[][] data= {{"Sudhir","Kupate","30","Software Tester"},
				{"Suahs","Karande","32","Deputy Engineer"},
				{"Amit","Lokare","28","Design Engineer"}};
		
		return data;
	}
	
	@DataProvider(name="data2")
	public Object[][] dataProvide2() 
	{
		Object[][] data= {{"Sudhir","Kupate",30,false},
				{"Suahs","Karande",32,true},
				{"Amit","Lokare",28,true}};
		
		return data;
	}
	
	
	@DataProvider(name="data3")
	public Iterator<Object> dataProvide3() 
	{
		ArrayList<Object>list=new ArrayList<>();
		list.add("Sudhir");
		list.add("Kupate");
		list.add(33);
		list.add(false);
		
		return list.iterator();
	}
	
	@DataProvider(name="data4",indices= {0,1,2})
	public Object[] dataProvide4() 
	{
		Object[] data = {"Sam","dushan","aryan","vinayak","annko"};
		return data;
	}
}
