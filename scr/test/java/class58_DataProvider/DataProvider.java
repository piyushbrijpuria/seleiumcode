package class58_DataProvider;

import org.testng.annotations.Test;

public class DataProvider 
{
	@Test(dataProvider = "logintest",dataProviderClass = DataProvider2.class)
	public void test1(String name,String pass) 
	{
		System.out.println("Test Executed "+name+" "+pass);
	}
	
}
