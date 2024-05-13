package class63_POM;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.CoursePages;
import Pages.HomePage; 
import Pages.LoginPage;
import helper.utility;

public class PageObjectModel 
{
	@Test
	public void loginTest()
	{
	WebDriver driver=utility.startBrowser("Chrome", "https://freelance-learn-automation.vercel.app/login");
	LoginPage login= new LoginPage(driver);
	
	HomePage home=login.loginToApplicationAsAdminUser("admin@email.com","admin@123");
	
	Assert.assertTrue(home.getWelcomeMessage().contains("Welcome"),"Login Failed");
	
	CoursePages course=home.clickOnManageCourses();
	
	course.clickOnAddNewCourse();
	
	
	
	}

}
