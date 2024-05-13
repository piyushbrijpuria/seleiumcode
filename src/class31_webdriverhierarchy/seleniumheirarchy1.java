package class31_webdriverhierarchy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumheirarchy1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
      WebDriver driver= new ChromeDriver();
      driver.get("https://www.facebook.com/");
      driver.get("https://www.selenium.dev/documentation/webdriver/getting_started/first_script/");
      driver.get("https://www.google.co.in/");
      
      //driver.manage().window().maximize();
      //driver.manage().window().minimize();
      
      driver.navigate().back();
      driver.navigate().back();
      driver.navigate().forward();
      driver.navigate().forward();
      driver.navigate().refresh();  
      
      driver.navigate().to("https://www.instagram.com/"); 
      //go through the difference between get and navigate to both open the url only
      driver.quit();     
      
	}

}
