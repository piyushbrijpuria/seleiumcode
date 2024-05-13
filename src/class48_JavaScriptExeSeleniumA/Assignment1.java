package class48_JavaScriptExeSeleniumA;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.utility;

public class Assignment1 {

	public static void main(String[] args) throws InterruptedException {
			
		WebDriver driver= utility.startBrowser("Chrome", "https://manos.malihu.gr/repository/custom-scrollbar/demo/examples/complete_examples.html");
		WebElement element=driver.findElement(By.xpath("//textarea"));		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView(true)",element);
		Thread.sleep(2000);
		element.clear();
		element.sendKeys("Selenium");
	}

}
