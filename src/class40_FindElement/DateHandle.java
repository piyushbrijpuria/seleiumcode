package class40_FindElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateHandle {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/");
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
		List<WebElement> allDates= driver.findElements(By.xpath("//table[contains(@class,'datepicker-calendar')]//td//a"));
		
		for(WebElement ele:allDates)
		{
			String dates =ele.getText();
			System.out.println("Dates are"+dates);
			if(dates.equalsIgnoreCase("16"))
			{
				ele.click();
				break;
			}
		}
	}

}
