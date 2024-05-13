package class55_TestNG;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNG2
{
   @Test(groups = "Regression")
   public void test1()
   {
	   System.out.println("Start");
	   SoftAssert softAssert= new SoftAssert();
	   
	   String expectedErrorMsg="Username is not Valid"; 
	   String actualMsg="Username is Not Valid";
	   softAssert.assertEquals(actualMsg, expectedErrorMsg,"Error Message not Matching");
	   
	   softAssert.assertEquals(true, false);
	   softAssert.assertEquals(10, 10); 
	   
	   System.out.println("End");
	   softAssert.assertAll();
   }
   
   @Test(groups = "Regression")
   public void test2()
   {
	   System.out.println("Start");
	   
	   String expectedErrorMsg="Username is not Valid"; 
	   String actualMsg="Username is Not Valid";
	   Assert.assertTrue(actualMsg.equalsIgnoreCase(expectedErrorMsg),"Error Message not Matching");
	  
   }
}
