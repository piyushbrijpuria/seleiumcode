package class40_FindElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.utility;

public class AutosugesstionHandle2 {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver= utility.startBrowser("https://seleniumpractise.blogspot.com/2016/");
       
//		WebDriver driver =new ChromeDriver();
//		driver.manage().window().maximize();
//		driver.get("https://seleniumpractise.blogspot.com/2016/");
       
		driver.findElement(By.xpath("//input[contains(@class,'autocomplete')]")).sendKeys("E");
		Thread.sleep(2000);
		
		List<WebElement> allSuggestions =driver.findElements(By.xpath("//ul[contains(@class,'autocomplete')]//div"));
		 allSuggestions.get(allSuggestions.size()-2).click();
	
	}

}
