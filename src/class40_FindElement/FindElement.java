
package class40_FindElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {

	public static void main(String[] args) {

		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://seleniumpractise.blogspot.com/2016/");
		driver.findElement(By.id("datepicker")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		driver.findElement(By.xpath("//a[text()='16']")).click();
		}
	}


