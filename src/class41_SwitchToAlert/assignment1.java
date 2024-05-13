package class41_SwitchToAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.utility;

public class assignment1 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= utility.startBrowser("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[contains(normalize-space(),'Click for JS Alert')]")).click();
	Thread.sleep(2000);
	
	Alert alt= driver.switchTo().alert();
	
	String text= alt.getText();
	
	if(text.contains("JS Alert"))
			{
				System.out.println("Validation 1- Passed - Alert Verified");
			}			 
			else
			{
				System.out.println("Validation 2- Failed - Alert verified");
			}
     	alt.accept();
	
//	alt.dismiss();
//	
//				

	}

}
