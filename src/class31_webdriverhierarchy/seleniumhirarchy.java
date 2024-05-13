package class31_webdriverhierarchy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumhirarchy {

	public static void main(String[] args) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://google.com");
		String title= driver.getTitle();
		System.out.println(title);
		
		String url= driver.getCurrentUrl();
		System.out.println(url);
		
		driver.quit();
		
	}
}
