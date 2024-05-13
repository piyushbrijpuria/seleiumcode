package class54_TestNG;

import org.testng.annotations.Test;


public class FirstTestNGtest 
{
	@Test(description = "This Test Will Execute Sample 1 Scenario",groups = "Smoke")
	public void test1() 
	{
		System.out.println("Test 1 Executed");
	}
	
	@Test(description = "This Test Will Execute Sample 2 Scenario",groups = "Smoke")
	public void test2() 
	{
		System.out.println("Test 2 Executed");
	}
	
	@Test(description = "This Test Will Execute Sample 2 Scenario",invocationCount = 4,groups = "Smoke")
	public void test3() 
	{
		System.out.println("Test 3 Executed");
	}

}
