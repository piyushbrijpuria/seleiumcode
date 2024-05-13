package class46_fluentWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CapScreenAssignment5 {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://mail.google.com/mail/u/0/#inbox");
		
		Date date=new Date();
		System.out.println(date);
		
		SimpleDateFormat mydate= new SimpleDateFormat("HH_mm_ss_dd_MM_yyyy");
		String finalDate=mydate.format(date);
		System.out.println(finalDate);
		
		FileHandler.copy(((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE), new File("./ScreenShot/Screenshot_"+finalDate+".png"));
			
		driver.quit();	
	}
	
}
