package class38_assignments;

import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class chat {
	    public static void main(String[] args) {
	        // Set the path to chromedriver
	        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

	        // Initialize the WebDriver
	        WebDriver driver = new ChromeDriver();

	        // Open the signup page
	        driver.get("http://example.com/signup");

	        // Find form elements
	        WebElement usernameInput = driver.findElement(By.id("username"));
	        WebElement emailInput = driver.findElement(By.id("email"));
	        WebElement passwordInput = driver.findElement(By.id("password"));
	        WebElement confirmPasswordInput = driver.findElement(By.id("confirm_password"));
	        WebElement submitButton = driver.findElement(By.id("submit_button"));

	        // Enter signup information
	        usernameInput.sendKeys("test_user");
	        emailInput.sendKeys("test@example.com");
	        passwordInput.sendKeys("password123");
	        confirmPasswordInput.sendKeys("password123");

	        // Submit the form
	        submitButton.click();

	        // Wait for validation message
	        try {
	            Thread.sleep(2000); // Wait for 2 seconds for validation to appear
	        } catch (InterruptedException e) {
	            e.printStackTrace();
	        }

	        // Check if validation message is displayed
	        WebElement validationMessage = driver.findElement(By.id("validation_message"));
	        if (validationMessage != null) {
	            System.out.println("Validation message: " + validationMessage.getText());
	        } else {
	            System.out.println("Signup successful!");
	        }

	        // Close the browser
	        driver.quit();
	    }
	}

