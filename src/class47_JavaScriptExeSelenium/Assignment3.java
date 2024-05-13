package class47_JavaScriptExeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.utility;

public class Assignment3 {

	public static void main(String[] args) {
		
		WebDriver driver= utility.startBrowser("https://login.yahoo.com/");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		
        WebElement element= driver.findElement(By.xpath("//input[@id='login-username']"));

		js.executeScript("arguments[0].value=aruments[1]",element,"admin@gmail.com");
    
		js.executeScript("document.getElementById('persistent').click()");
       
        driver.quit();
	}

}
