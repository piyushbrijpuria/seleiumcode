package class39_Calender;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calender {

	public static void main(String[] args) {

		WebDriver driver= new ChromeDriver();
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-handle-calender-in-selenium.html");
		driver.manage().window().maximize();
		
	}

}
