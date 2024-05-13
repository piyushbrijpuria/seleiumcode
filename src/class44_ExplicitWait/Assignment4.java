package class44_ExplicitWait;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment4 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/");
		driver.findElement(By.xpath("//input[@value='Show me']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));

//		wait.until(ExpectedConditions.elementToBeClickable(By.id("passnew"))).sendKeys("admin@123");
		
		WebElement element= wait.until(ExpectedConditions.elementToBeClickable(By.id("passnew")));
		
		element.sendKeys("admin@123");

		
	}	
}
