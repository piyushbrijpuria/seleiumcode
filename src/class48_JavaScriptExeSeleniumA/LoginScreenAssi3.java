package class48_JavaScriptExeSeleniumA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import helper.utility;

public class LoginScreenAssi3 {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver= utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		
		utility.getElement(driver, By.xpath("//input[@id='email1']")).sendKeys("admin@email.com");
		utility.getElement(driver, By.xpath("//input[@id='password1']")).sendKeys("admin@123");
		utility.getElement(driver, By.className("submit-btn")).click();	
		
		driver.close();
	}

}
