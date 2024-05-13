package class42_SwitchToWindow;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.utility;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= utility.startBrowser("https://freelance-learn-automation.vercel.app/login");
		
		String parentWindow= driver.getWindowHandle();
		System.out.println("Parent Window Handle "+parentWindow);
				
		driver.findElements(By.xpath("//a[contains(@href,'facebook')]")).get(0).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		Iterator<String> itr=allWindows.iterator();
		while(itr.hasNext())
		{
		   String handle=itr.next();
		   
//		for(String handle:allWindows) 
//		{
//			System.out.println("Handle Are "+handle);
		
		if(!parentWindow.equalsIgnoreCase(handle))
		{
             driver.switchTo().window(handle);	
             
             Thread.sleep(5000);
             
			if(driver.getTitle().contains("Facebook"))
			{
			    System.out.println("Switched to Child Tab");
			driver.close();
			}
			
		}
	      }

       driver.switchTo().window(parentWindow);
	   if(driver.getTitle().contains("Learn"))
	 {
		 System.out.println("Switched to Parent Tab");
	 }
	 else
	 {
		 System.out.println("Could not switched to Parent Tab");
	 }
           
	}
}


		
	


