package class40_FindElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosugesstionHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/");
		driver.findElement(By.xpath("//input[contains(@class,'autocomplete')]")).sendKeys("E");
		Thread.sleep(2000);
		
		List<WebElement>allSuggestions =driver.findElements(By.xpath("//ul[contains(@class,'autocomplete')]//div"));
		for(WebElement ele:allSuggestions)
		{
			String values=ele.getText();
			System.out.println(values);
			if(values.equalsIgnoreCase("Perl"))
			{
				ele.click();
				break;
				
				}
			
		}
		
	}

}
