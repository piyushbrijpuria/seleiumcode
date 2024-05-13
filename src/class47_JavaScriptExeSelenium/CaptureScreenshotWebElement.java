package class47_JavaScriptExeSelenium;

import java.io.File;
import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;

import helper.utility;

public class CaptureScreenshotWebElement {

	public static void main(String[] args) throws IOException {

	WebDriver driver=utility.startBrowser("https://freelance-learn-automation.vercel.app/login");
	WebElement element=driver.findElement(By.xpath("//button[normalize-space()='Sign in']"));
	File src= element.getScreenshotAs(OutputType.FILE);
    File destination =new File("./ScreenShot/ScreenshotA.png");
 	FileHandler.copy(src, destination);
		
	}

}
