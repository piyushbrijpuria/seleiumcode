package class42_SwitchToWindow;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.utility;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= utility.startBrowser("https://freelance-learn-automation.vercel.app/login");
		
		String parentWindow= driver.getWindowHandle();		
		List<WebElement>allSocialMediaIcon= driver.findElements(By.xpath("//div[@id='login_container']//div[@class='social-btns']//a"));
		for(WebElement ele:allSocialMediaIcon)
		{
			ele.click();
		}
		
		Set<String> allWindows=driver.getWindowHandles();
/// Get Element one by one from set and add to list
		
		List<String>allWindowHandles=new ArrayList<String>();
		for(String str:allWindows)
		{
			allWindowHandles.add(str);
		}
		
		driver.switchTo().window(allWindowHandles.get(1));
		Thread.sleep(2000);
		driver.switchTo().window(allWindowHandles.get(2));
		Thread.sleep(2000);
		driver.switchTo().window(allWindowHandles.get(3));
		Thread.sleep(2000);
		driver.switchTo().window(allWindowHandles.get(4));
		Thread.sleep(2000);
		driver.switchTo().window(allWindowHandles.get(5));
		driver.switchTo().window(parentWindow);
		Thread.sleep(5000);
		
		driver.close();
		
	}
}