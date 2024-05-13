package class57_ParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelTest2 {

	@Test
	public void test4() 
	{
		Reporter.log("Thread id "+Thread.currentThread().getId(),true);
		Reporter.log("Test 4 Executed",true);
	}
	
	@Test
	public void test5() 
	{
		Reporter.log("Thread id "+Thread.currentThread().getId(),true);
		Reporter.log("Test 5 Executed",true);
	}
	
	@Test
	public void test6() 
	{
		Reporter.log("Thread id "+Thread.currentThread().getId(),true);
		Reporter.log("Test 6 Executed",true);
	}
}
