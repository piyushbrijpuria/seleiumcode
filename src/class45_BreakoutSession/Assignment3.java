package class45_BreakoutSession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import helper.utility;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException 
	{
       WebDriver driver= utility.startBrowser("https://freelance-learn-automation.vercel.app/login");
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
// Personal Details
       
       driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("admin@email.com");
       driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("admin@123");
       driver.findElement(By.xpath("//button[@type='submit']")).click();
 
// Count Check after login
       
       if(driver.findElements(By.xpath("//div[@class='course-card row']")).size()>4)
       {
    	   System.out.println("Validadtion 1 Pass");
       }
       else
       {
    	   System.out.println("Validation 1 Fail");
       }
// To check price value is available in cards
       
        int price1= Integer.parseInt(driver.findElement(By.xpath("//h2[normalize-space()='Cypress']//following::span[3]/b")).getText().substring(1));
        
        System.out.println("Price is" +price1);
        
        driver.findElement(By.xpath("//button[contains(text(),'Add to Cart')][1]")).click();
            
        int price2= Integer.parseInt(driver.findElement(By.xpath("//h2[normalize-space()='Playwright']//following::span[3]/b")).getText().substring(1));
        
        System.out.println("Price is" +price2);
        
        driver.findElement(By.xpath("(//button[contains(text(),'Add to Cart')])[2]")).click();
  
 //Count Verified available in Card icon
        
        if(Integer.parseInt(driver.findElement(By.xpath("//span[@class='count']")).getText())==2)
        {
        	System.out.println("Count Verified");
        }
        else
        {
        	System.out.println("Not Verified");
        }

// Click on Cart Icon
        driver.findElement(By.xpath("//span[@class='count']")).click();
        
// Verify Total Price of the Courses
        
        int finalPrice =Integer.parseInt(driver.findElement(By.xpath("//div[@class='top-container']//h3/b")).getText().substring(1));
        
        if(finalPrice==(price1+price2))
        {
        	System.out.println("Amount is Matched");
        }
        else
        {
        	System.out.println("Count is not Matched");
        }
// Click on Enroll Now Button
        driver.findElement(By.xpath("//button[normalize-space()='Enroll Now']")).click();
        Thread.sleep(2000);
//Enroll now detials
        
        driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Indore");
        driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("+91-9923232323");
        driver.findElement(By.xpath("//button[@class='action-btn']")).click();
// Verify Order Id        
        String orderId =driver.findElement(By.xpath("//h4[@class='uniqueId']/b")).getText();
        System.out.println("Order ID is "+ orderId);
        if(orderId!=null)
        {
        	System.out.println("Order Validated");
        }
        else
        {
        	System.out.println("Not Verified");
        }
        driver.close();
        
	}
	
 
}
