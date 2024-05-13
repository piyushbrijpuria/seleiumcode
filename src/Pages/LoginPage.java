package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage 
{
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	private By user =By.xpath("//input[@placeholder='Enter Email']");
	private By pass=By.name("password1");
	private By loginButton=By.className("submit-btn");
	
	
	public HomePage loginToApplicationAsAdminUser(String username,String password)
	{
		driver.findElement(user).sendKeys(username);
		driver.findElement(pass).sendKeys(password);
		driver.findElement(loginButton).click();
	
		HomePage homePage= new HomePage(driver);
		return homePage;
		
	}
}
