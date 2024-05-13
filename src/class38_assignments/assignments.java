package class38_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assignments {

	public static void main(String[] args) throws InterruptedException 
	{
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freelance-learn-automation.vercel.app/login");
		
//Verify the URL Contains Login
		String URL= driver.getCurrentUrl();
		if(URL.contains("login"))
		{
			System.out.println("Validation 1 Pass: URL contains Login Text");
		}
		else
		{
			System.out.println("valiation 1 fail: URL not contains Login text");
		}
		
//		driver.findElement(By.xpath("//input[contains(@id,'email1')]")).sendKeys("piyush@gmail.com");
//		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("PIYUSH@070");
        
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();

        WebElement errormessage = driver.findElement(By.xpath("//h2[contains(@class,'errorMessage')]"));
        if(errormessage.isDisplayed())
        {
        	System.out.println("Validation 2 Pass: Error Message is Displayed");
        }
        else
        {
        	System.out.println("Validation 2 fail: Verification Failed");
        }
		
        driver.findElement(By.xpath("//a[contains(@href,'/signup')]")).click();
		Thread.sleep(2000);
		
		String currenturl =driver.getCurrentUrl();
		if(currenturl.contains("signup"))
		{
			System.out.println("Validation 3 Pass: URL contains Signup Text");
		}
		else
		{
			System.out.println("Validation 3 fail: URL not contains Signup text");
		}
		
		WebElement buttonisdisabled =driver.findElement(By.cssSelector("button[type='submit']"));
		if(!buttonisdisabled.isEnabled())
		{
			System.out.println("Validation 4 Pass: Signup button is Disabled");
		}
		else
		{
			System.out.println("Valiadtion 4 fail: Signup button is Enabled");
		}
			
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("DDDD");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("DDDD@gmail.com");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Dummmq");
//Interest 
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
// Gender
				
		WebElement gender= driver.findElement(By.id("gender1"));
		gender.click();
//State		
		Select state =new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("Goa");
//Hobbies
        Select hobbie= new Select(driver.findElement(By.id("hobbies")));
        hobbie.selectByVisibleText("Reading");
        
        WebElement buttonisenabled =driver.findElement(By.xpath("//button[@type='submit']"));
		if(buttonisenabled.isEnabled())
		{
			System.out.println("Validation 5 Pass: Signup button is Enabled");
		}
		else
		{
			System.out.println("Valiadtion 5 fail: Signup button is Disabled");
		}			
// Sign Up   
		driver.findElement(By.className("submit-btn")).click();
//		Thread.sleep(5000);
		
		 WebElement UserCreation =driver.findElement(By.xpath("//h2[@class='errorMessage false']"));
			if(UserCreation.isEnabled())
			{
				System.out.println("Validation 6 fail: User Already Registered");
			}
			else
			{
				System.out.println("Valiadtion 6 Pass: User Created Successfully");
			}	
			
		driver.close();
	}

}