package class41_SwitchToAlert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.utility;

public class assignment3 {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver= utility.startBrowser("https://the-internet.herokuapp.com/javascript_alerts");
	driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
	
	Thread.sleep(2000);
	
	Alert alt= driver.switchTo().alert();
	alt.sendKeys("Hello");
	alt.accept();
	}

}
