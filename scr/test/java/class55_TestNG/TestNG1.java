package class55_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNG1 
{
   @Test(groups = "E2E")
   public void test1()
   {
	   System.out.println("Start");
	   
	   String expectedErrorMsg="Username is not Valid"; 
	   String actualMsg="Username is not Valid";
	   Assert.assertEquals(actualMsg, expectedErrorMsg,"Error Message not Matching");
	   
	   Assert.assertEquals(true, true);
	   Assert.assertEquals(10, 100); 
	   System.out.println("End");
   }
   
   @Test(groups = "E2E")
   public void test2()
   {
	   System.out.println("Start");
	   
	   String expectedErrorMsg="Username is not Valid"; 
	   String actualMsg="Username is Not Valid";
	   Assert.assertTrue(actualMsg.equalsIgnoreCase(expectedErrorMsg),"Error Message not Matching");
	  
   }
}
