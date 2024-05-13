package class44_ExplicitWait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("http://www.google.com");
	    System.out.println(driver.getTitle());
	    driver.findElement(By.id("Piyush")).sendKeys("Selenium");
	
	}
	
}
