package class58_DataProvider;

public class DataProvider2 
{

    @org.testng.annotations.DataProvider(name = "logintest")
	public static Object[][] getData()
	{
    	System.out.println("Creating Test Data");
    	
		Object[][] arr=new Object[2][2];
		arr[0][0]="Piyush";
		arr[0][1]="Brijpuria";
		
		arr[1][0]="Dummy";
		arr[1][1]="Data";
		
    	System.out.println("Test Data Created");
		return arr;
	}

}
