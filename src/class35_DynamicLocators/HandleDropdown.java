package class35_DynamicLocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://freelance-learn-automation.vercel.app/signup");
		Thread.sleep(2000);
//Personal Information
		WebElement name= driver.findElement(By.xpath("//input[@placeholder='Name']"));
		name.sendKeys("Dummy Dummy");
		WebElement emailID = driver.findElement(By.xpath("//input[@id='email']"));
		emailID.sendKeys("Dummy11@mail.com");
		WebElement password= driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys("Dummmq");
//Interest 
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
// Gender
		
		WebElement gender= driver.findElement(By.id("gender1"));
		gender.click();
//State		
		Select state =new Select(driver.findElement(By.id("state")));
		state.selectByVisibleText("Goa");
//        String stateName=((WebElement) state.getAllSelectedOptions()).getText(); 
//		if(stateName.contains("Goa"))
//		{
//			System.out.println("DropDown is working as expected");
//		}
//		else
//		{
//			System.out.println("DropDown is not working as expected");
//		}	
		
//      driver.findElement(By.xpath("//select[@id='state']")).sendKeys("Mizoram");
		
//Hobbies
        Select hobbie= new Select(driver.findElement(By.id("hobbies")));
        hobbie.selectByVisibleText("Reading");
		
// Sign Up        
        driver.findElement(By.className("submit-btn")).click();
		Thread.sleep(2000);

		driver.close();
		
	}

}
