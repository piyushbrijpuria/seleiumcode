package class44_ExplicitWait;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2019/01/alert-demo.html");
		
		driver.findElement(By.xpath("//button[normalize-space()='Try it']")).click();
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(15));
		
		Alert alt=wait.until(ExpectedConditions.alertIsPresent());
		 
		if(alt.getText().contains("Selenium"))
		{
			System.out.println("Text Validate");
		}
		else
		{
			System.out.println("Could Not Validate");
		}
		alt.accept();
		
		driver.quit();
	}	
}
