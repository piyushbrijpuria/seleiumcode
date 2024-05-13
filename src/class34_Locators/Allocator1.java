package class34_Locators;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class Allocator1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzEzNjExOTg1LCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");
		driver.findElement(By.name("email")).sendKeys("piyushbrijpuria1@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("PIYUSH@070");
	     // driver.findElement(By.id("pass")).sendKeys("PIYUSH@070");

		driver.findElement(By.name("login")).click();
		
		

	}

}
