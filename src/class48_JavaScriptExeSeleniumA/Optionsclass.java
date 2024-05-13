package class48_JavaScriptExeSeleniumA;

import org.openqa.selenium.chrome.ChromeOptions;
import helper.utility;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;


public class Optionsclass {

	public static void main(String[] args) {		
		ChromeOptions options= new ChromeOptions();
		options.addArguments("--headless=new");
		
   		WebDriver driver= new ChromeDriver(options);
   		
		driver.get("https://freelance-learn-automation.vercel.app/login");
		utility.getElement(driver, By.xpath("//input[@id='email1']")).sendKeys("admin@email.com");
		utility.getElement(driver, By.xpath("//input[@id='password1']")).sendKeys("admin@123");
		utility.getElement(driver, By.className("submit-btn")).click();	
		
	}
 
}
