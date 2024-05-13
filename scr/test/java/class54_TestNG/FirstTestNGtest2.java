package class54_TestNG;

import org.testng.annotations.Test;


public class FirstTestNGtest2 
{
	@Test(priority = 1,groups = "Sanity")
	public void logintest() 
	{
		System.out.println("Login Done");
	}
	
	@Test(priority = 2,groups = "Sanity")
	public void createcourses() 
	{
		System.out.println("Course Created");
	}
	
	@Test(priority = 3,groups = "Sanity")
	public void categorycreated() 
	{
		System.out.println("Category Created");
	}
	
	@Test(priority = 4,groups = "Sanity")
	public void deletecategory() 
	{
		System.out.println("Category Deleted");
	}
	
	@Test(priority = 5,groups = "Sanity")
	public void deletecourses() 
	{
		System.out.println("Course Deleted");
	}
	
	@Test(priority = 6,groups = "Sanity")
	public void logout() 
	{
		System.out.println("Logout Done");
	}

}
