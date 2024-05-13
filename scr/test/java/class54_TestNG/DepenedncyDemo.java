package class54_TestNG;

import org.testng.annotations.Test;

public class DepenedncyDemo 
{
    @Test(groups = "DemoGroup")
	public void loginTest() 
    {
	  System.out.println(10/0);
	  System.out.println("Login Done");
	}
	
    @Test(dependsOnMethods = "loginTest",groups = "DemoGroup")
	public void logoutTest() 
    {
	  System.out.println("Logout Done");
	}
}
