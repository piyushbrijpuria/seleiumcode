package class41_SwitchToAlert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.utility;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= utility.startBrowser("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[contains(normalize-space(),'Click for JS Confirm')]")).click();
	Thread.sleep(2000);
	
	driver.switchTo().alert().dismiss();
	}

}
