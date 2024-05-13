package class35_DynamicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allocators1 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freelance-learn-automation.vercel.app/login");
// Personal Information		
		driver.findElement(By.xpath("//input[contains(@id,'email1')]")).sendKeys("piyush@gmail.com");
		driver.findElement(By.xpath("//input[contains(@id,'password1')]")).sendKeys("PIYUSH@070");
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
//// After Login adding to the Cart
//		driver.findElement(By.xpath("//h2[@class='name']")).click();
//		driver.findElement(By.xpath("//span[@id='cardChip']"))args;
//		
		
		driver.close();
	}

}
