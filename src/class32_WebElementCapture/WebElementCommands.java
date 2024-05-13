package class32_WebElementCapture;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
	
       WebDriver driver= new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.facebook.com/");
//Email ID Entered        
       
       WebElement emailID = driver.findElement(By.id("email"));
       emailID.sendKeys("piyushbrijpuria");
       emailID.clear();
       emailID.sendKeys("piyushbrijpuria@yahoo.in");

//Conditions Applied
       
       boolean displaystatus= emailID.isDisplayed();
       System.out.println("Is Element Displayed ?"+displaystatus);
       if(displaystatus)
       {
    	   System.out.println("Validation 1 - Passed");
       }
       else
       {
    	   System.out.println("Validation 1 - Failed");
       }
       
       boolean enablestatus= emailID.isEnabled();
       System.out.println("Is Element Enabled ?"+enablestatus);
       if(enablestatus)
       {
    	   System.out.println("Validation 2 - Passed");
       }
       else
       {
    	   System.out.println("Valiadtion 2 -Failed");
       }
       boolean selectedstatus= emailID.isSelected();
       System.out.println("Is Element Selected ?"+selectedstatus);
       if(!selectedstatus)
       {
    	   System.out.println("Validation 2 - Passed");
       }
       else
       {
    	   System.out.println("Valiadtion 2 -Failed");
       }
//Password Entered
       
       WebElement password = driver.findElement(By.id("pass"));
       password.sendKeys("PIYUSH@070");
       
       WebElement submitButton = driver.findElement(By.xpath("//button[.='Log in']"));
       submitButton.click();
       driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
       
       driver.close();

	}

}
