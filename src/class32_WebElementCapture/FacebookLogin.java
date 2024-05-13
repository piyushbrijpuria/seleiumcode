package class32_WebElementCapture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver= new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.facebook.com/");
	//Email ID Entered           
	       driver.findElement(By.id("email")).sendKeys("piyushbrijpuria@yahoo.in");
	       
 //Password Entered
	       driver.findElement(By.id("pass")).sendKeys("PIYUSH@070");
	       
	       driver.findElement(By.xpath("//button[.='Log in']")).click();
	       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
	       driver.close();

	}

}
