package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CoursePages
{
	WebDriver driver;
	
	public CoursePages(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By newCourse= By.xpath("//button[normalize-space()='Add New Course']");
	
	public void clickOnAddNewCourse()
	{
		driver.findElement(newCourse).click();
	}

}