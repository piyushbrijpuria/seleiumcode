package class57_ParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ParallelTest {

	@Test
	public void test1() 
	{
		Reporter.log("Thread id "+Thread.currentThread().getId(),true);
		Reporter.log("Test 1 Executed",true);
	}
	
	@Test
	public void test2() 
	{
		Reporter.log("Thread id "+Thread.currentThread().getId(),true);
		Reporter.log("Test 2 Executed",true);
	}
	
	@Test
	public void test3() 
	{
		Reporter.log("Thread id "+Thread.currentThread().getId(),true);
		Reporter.log("Test 3 Executed",true);
	}
}
