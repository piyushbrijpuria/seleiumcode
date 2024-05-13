package class34_Locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Allocators2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/login");
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));

// Personal Information		
		driver.findElement(By.name("firstname")).sendKeys("Dummy");
		driver.findElement(By.name("lastname")).sendKeys("Dummy");
		driver.findElement(By.name("reg_email__")).sendKeys("+91-1212121212");
		driver.findElement(By.id("password_step_input")).sendKeys("Dummy@070");
		
//		driver.findElement(By.xpath("//input[@aria-label='First name']")).sendKeys("Dummy");
//		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Dummy");
//		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys("+91-1212121212");
//		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys("Dummy@070");
		
// Date Picker
//        driver.findElement(By.id("day")).sendKeys("31");
//        driver.findElement(By.name("birthday_month")).sendKeys("Aug");
//        driver.findElement(By.id("year")).sendKeys("1992");

        driver.findElement(By.xpath("//select[@name='birthday_day']")).sendKeys("31");
        driver.findElement(By.xpath("//select[@aria-label='Month']")).sendKeys("Aug");
        driver.findElement(By.xpath("//select[@title='Year']")).sendKeys("1992");
        
// Gender
        driver.findElement(By.xpath("//label[.='Male']")).click();
        
// Sign Up        
        driver.findElement(By.name("websubmit")).click();

        driver.close();
	}

}
