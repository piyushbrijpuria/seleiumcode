package class46_fluentWait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;
import com.google.common.base.Function;

public class Assignment1 {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		driver.findElement(By.xpath("//button[normalize-space()='Click me to start timer']")).click();

		FluentWait<WebDriver> wait=new FluentWait<WebDriver>(driver);
		wait.withTimeout(Duration.ofSeconds(20));
		wait.pollingEvery(Duration.ofSeconds(2));
		wait.ignoring(Exception.class);
		
		WebElement element= wait.until(new Function<WebDriver, WebElement>()
		{
			public WebElement apply(WebDriver ldriver)
			{
				WebElement ele= ldriver.findElement(By.xpath("//p[@id='demo']"));
				
				String text= ele.getText();
				
				if(text.equalsIgnoreCase("WebDriver"))
				{
					System.out.println("Condition Verified");
					return ele;
				}
				else
				{
					return null;
				}	
			}
		});
		
		System.out.println("Displayed ??? "+element.isDisplayed());	
	}

}
