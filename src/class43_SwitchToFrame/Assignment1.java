package class43_SwitchToFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.utility;

public class Assignment1 {

	public static void main(String[] args) 
	{
       WebDriver driver= utility.startBrowser("https://www.rediff.com/");
       
       driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@src,'moneywizwidget')]")));
       String bseIndex=driver.findElement(By.id("bseindex")).getText();
       System.out.println("Current Index Value is "+bseIndex);
       driver.switchTo().defaultContent();
       driver.findElement(By.xpath("//a[normalize-space()='Sign in']")).click();
       
	}

}
