package class40_FindElement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutosugesstionHandle3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Mukesh Otwani");
		Thread.sleep(2000);
		List<WebElement>allSuggestions=driver.findElements(By.xpath("//div[@role='option']//div[@role='presentation']//span"));

		System.out.println("Total Suggestions "+allSuggestions.size());
		for(WebElement ele:allSuggestions)
		{
			String value= ele.getText();
			if(value.length()>0)
			{
			System.out.println("Values are " +value);
			if(value.contains("blog"))
			{
				ele.click();
				break;
			}
			driver.close();
			}
		}
	
	}

}
