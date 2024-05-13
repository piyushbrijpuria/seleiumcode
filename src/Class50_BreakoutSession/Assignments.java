package Class50_BreakoutSession;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignments {

	public static void main(String[] args) throws InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(15));
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://freelance-learn-automation.vercel.app/login");
	
		driver.findElement(By.xpath("//input[@id='email1']")).sendKeys("admin@email.com");
		
		driver.findElement(By.xpath("//input[@id='password1']")).sendKeys("admin@123");
		
		driver.findElement(By.xpath("//button[normalize-space()='Sign in']")).click();
		
		new Actions(driver).moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Manage']"))).perform();

		driver.findElement(By.xpath("//a[normalize-space()='Manage Categories']")).click();
		
		Set<String> allWindows=driver.getWindowHandles();
		
		List<String> allTabs=new ArrayList<String>(allWindows);
		
		//switch to new tab
		driver.switchTo().window(allTabs.get(1));
		
		driver.findElement(By.xpath("//button[normalize-space()='Add New Category']")).click();
		
		String categoryName="AWS";
		
		Alert prompt=driver.switchTo().alert();
		
		prompt.sendKeys(categoryName);
		
		prompt.accept();
		
		if(driver.findElement(By.xpath("//td[normalize-space()='"+categoryName+"']")).isDisplayed())
		{
			System.out.println("Validation 1 - Passed - Category Created");
		}
		else
		{
			System.out.println("Validation 1 - Failed - Category Failed");
		}
		
		WebDriver newSession1=new ChromeDriver();
		
		newSession1.get("https://freelance-learn-automation.vercel.app/signup");
		
		newSession1.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		if(newSession1.findElement(By.xpath("//label[normalize-space()='"+categoryName+"']")).isDisplayed())
		{
			System.out.println("Validation 2 - Passed - Category present on register page");
		}
		else
		{
			System.out.println("Validation 2 - Failed - Category not present on register page");
		}
		
		newSession1.quit();
		
		
		driver.findElement(By.xpath("//td[normalize-space()='"+categoryName+"']//following::button[2]")).click();
		
		Alert newAlt=new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.alertIsPresent());
		
		String newcategoryName="GCP";
		
		newAlt.sendKeys(newcategoryName);
		
		newAlt.accept();
		
		if(driver.findElement(By.xpath("//td[normalize-space()='"+newcategoryName+"']")).isDisplayed())
		{
			System.out.println("Validation 3 - Passed - Category Updated");
		}
		else
		{
			System.out.println("Validation 3 - Failed - Category Updated Failed");
		}
		
		driver.findElement(By.xpath("//td[normalize-space()='"+newcategoryName+"']//following::button[1]")).click();
		
		driver.findElement(By.xpath("//button[@class='action-btn'][normalize-space()='Delete']")).click();
		
		List<WebElement> numberOfElements=new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.numberOfElementsToBe(By.xpath("//td[normalize-space()='"+newcategoryName+"']"), 0));

		if(numberOfElements.size()==0)
		{
			System.out.println("Validation 4 - Passed - Category Deleted");
		}
		else
		{
			System.out.println("Validation 4 - Failed - Category Deletion Failed");
		}
		WebDriver newSession2=new ChromeDriver();
		
		newSession2.get("https://freelance-learn-automation.vercel.app/signup");
		
		newSession2.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		if(newSession2.findElements(By.xpath("//label[normalize-space()='"+newcategoryName+"']")).size()==0)
		{
			System.out.println("Validation 5 - Passed - Category not present on register page");
		}
		else
		{
			System.out.println("Validation 5 - Failed - Category present on register page");
		}
		
		newSession2.quit();
		
		
		driver.quit();
	}

}
