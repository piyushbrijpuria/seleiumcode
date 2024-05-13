package class48_JavaScriptExeSeleniumA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class KeyPoints {
    public static void main(String[] args) {
        // Set Chrome options to run in headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run in headless mode
        options.addArguments("--disable-gpu"); // Disable GPU acceleration (needed in headless mode)
        options.addArguments("--no-sandbox"); // Bypass OS security model (needed in headless mode)
        options.addArguments("--disable-dev-shm-usage"); // Overcome limited resource problems in Docker (needed in headless mode)

        // Set path to your Chrome WebDriver executable
    //    System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");

        // Initialize the WebDriver instance with Chrome options
        WebDriver driver = new ChromeDriver();

        // Example usage: Open a website
        driver.get("https://example.com");

        // Further automation steps can be added here...

        // Close the WebDriver session
        driver.quit();
    }
}
