package class40_FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DateHandle2 {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/");
		driver.findElement(By.id("datepicker")).click();
          //capture month //span[contains(@class,'ui-datepicker-month')]
		// capture year ////span[contains(@class,'ui-datepicker-year')]
		
//		if condition
//		month=feb && year= 2025
//		then
//		click 14
	}

}
