package Files;

import java.io.File;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SeleniumExtensions 
{

	public static void main(String[] args) 
	{
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File("/path/to/extension.crx"));
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://www.google.com");				
	}
}
