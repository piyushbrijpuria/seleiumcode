package class42_SwitchToWindow;

import java.util.List;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helper.utility;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= utility.startBrowser("https://freelance-learn-automation.vercel.app/login");
		
		String parentWindow= driver.getWindowHandle();		
		List<WebElement>allSocialMediaIcon= driver.findElements(By.xpath("//div[@id='login_container']//div[@class='social-btns']//a"));
		for(WebElement ele:allSocialMediaIcon)
		{
			ele.click();
		}
		Set<String> allWindows=driver.getWindowHandles();
		for(String handle:allWindows)
		{
			System.out.println("Window Handle "+handle);
			
			driver.switchTo().window(handle);
			System.out.println("Title of new Tabs "+driver.getTitle());
			
			if(driver.getTitle().contains("YouTube"))
			{
				System.out.println("Reached Desired Tab");
				break;
			}
		}
		
	       System.out.println("URL of Child tab "+driver.getTitle());
	       driver.switchTo().window(parentWindow);

	}
}