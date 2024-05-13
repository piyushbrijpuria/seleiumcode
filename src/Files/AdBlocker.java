package Files;

import java.io.File;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AdBlocker 
{
	public static void main(String[] args) 
	{	
		ChromeOptions options= new ChromeOptions();
		options.addExtensions(new File("./Extensions/AdBlock — best ad blocker.crx"));
		WebDriver driver= new ChromeDriver(options);
	}
}
