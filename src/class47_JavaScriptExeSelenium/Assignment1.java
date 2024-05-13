package class47_JavaScriptExeSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.utility;

public class Assignment1 {

	public static void main(String[] args) {
		
		WebDriver driver= utility.startBrowser("https://login.yahoo.com/");
		
        driver.findElement(By.xpath("//input[@id='login-username']")).sendKeys("admin@email.com");
        WebElement element=driver.findElement(By.id("persistent"));
        System.out.println("Width= "+element.getSize().getWidth());
        System.out.println("Height= "+element.getSize().getHeight());
        
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('persistent').click()");
       
        driver.quit();
	}

}
