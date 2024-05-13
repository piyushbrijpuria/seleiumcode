package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage 
{ 
	WebDriver driver;
	public HomePage(WebDriver driver) 
	{
		this.driver=driver;
	}
	
	private By welcomeMsg= By.xpath("//h4[@class='welcomeMessage']");
	private By manageOptions=By.xpath("//span[normalize-space()='Manage']");
	private By manageCourses=By.xpath("//a[normalize-space()='Manage Courses']");
	
	
	public String getWelcomeMessage()
	{
		String welcomeText=driver.findElement(welcomeMsg).getText();
		
		return welcomeText;
	}
	
	public CoursePages clickOnManageCourses()
	{
		driver.findElement(manageOptions).click();
		driver.findElement(manageCourses).click();
		
		CoursePages course=new CoursePages(driver);
		return course;
		
	}
	
	

}
