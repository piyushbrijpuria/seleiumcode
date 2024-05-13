package class46_fluentWait;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapScreenAssignment2 {

	public static void main(String[] args) throws IOException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://seleniumpractise.blogspot.com/2016/08/how-to-use-explicit-wait-in-selenium.html");
		
		TakesScreenshot ts= (TakesScreenshot)driver;
		File scr =ts.getScreenshotAs(OutputType.FILE);
		
		File destination=new File("./ScreenShot/Screenshot1.png");
		
		FileHandler.copy(scr, destination);
		driver.close();
	}
	
}
