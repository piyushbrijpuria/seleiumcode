package class49_OptionsClass;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Assignment1 {

	public static void main(String[] args) {
		ChromeOptions options=new ChromeOptions();
		 
		Map<String, String> map= new HashMap<String, String>();
		String downloadDirectoryString= System.getProperty(("user.dir")+"/downloadedFiles/");
		
		map.put("download.default_directory", downloadDirectoryString);
		options.setExperimentalOption("prefs", map);
		
		WebDriver driver=new ChromeDriver(options);
		
		driver.get("https://the-internet.herokuapp.com/download");
		driver.findElement(By.xpath("//a[normalize-space()='teste.automacao.png']")).click();
		
		File destinationFile=new File(downloadDirectoryString);
		File []arr=destinationFile.listFiles();
		
		System.out.println("File Count "+arr.length);
		
		if(arr.length>0)
		{
			System.out.println("Verification 1 - Passed- File Downloaded");
		}
		else
		{
			System.out.println("Verification 1 - Failed- File is not Downloaded");		
		}
		
		if(arr[0].length()>0)
		{
			System.out.println("Verification 2 - Passed- File is not empty");
		}
		else
		{
			System.out.println("Verification 2 - Failed- File is empty");
		}
		
		if(arr[0].delete())
		{
			System.out.println("Verification 3 - Passed- File Deleted");
		}
		else
		{
			System.out.println("Verification 3 - Passed- File is not Deleted");
		}
		driver.quit();
	}

}
