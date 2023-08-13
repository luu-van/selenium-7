/*
 * Set of test script for testing Website Guru99 Bank
 * The test scripts is developed using Selenium Framework
 *
 */
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyTitle {
    public static void main(String[] args) {

        //Setup Chrome driver
        //System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
        //WebDriver driver = new ChromeDriver();
        //Setup Firefox driver
        System.setProperty("webdriver.gecko.driver","D:\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        String baseUrl = "http://www.demo.guru99.com/V4/";

        // launch Firefox and direct it to the Base URL
        driver.get(baseUrl);


        // Enter username
        driver.findElement(By.name("uid")).sendKeys("mngr521060");

        // Enter Password
        driver.findElement(By.name("password")).sendKeys("UgybenE");

        // Click Login
        driver.findElement(By.name("btnLogin")).click();

        //Verify title of homepage
        driver.getTitle().contains("Guru99 Bank Manager HomePage ");

    }
}

