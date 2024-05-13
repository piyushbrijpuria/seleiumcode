package class48_JavaScriptExeSeleniumA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.utility;

public class ElementHighlightAssi2 {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver= utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
		WebElement element=driver.findElement(By.xpath("//input[@id='email1']"));	
		utility.highlightElement(driver, element);		
		element.clear();
		element.sendKeys("Piyush@gmail.com");
		
		driver.close();
	}

}
