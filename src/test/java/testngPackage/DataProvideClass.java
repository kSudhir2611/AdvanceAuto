package testngPackage;

import org.testng.annotations.DataProvider;

public class DataProvideClass 
{
	@DataProvider(name="data1")
	public String[][] dataProvide1() 
	{
		String[][] data= {{"Sham","Kupate","30","Software Tester"},
				{"Suahsini","Karande","32","Deputy Engineer"},
				{"Amita","Lokare","28","Design Engineer"}};
		
		return data;
	}
}
