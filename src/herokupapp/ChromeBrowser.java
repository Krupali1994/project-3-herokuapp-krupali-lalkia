package herokupapp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {

    public static void main(String[] args) {

        String baseUrl = "http://the-internet.herokuapp.com/login";

        // Setup Chrome browser
        WebDriver driver = new ChromeDriver();

        // 1. Open URL
        driver.get(baseUrl);

        // Maximise the browser
        driver.manage().window().maximize();

        // 3. Print the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // 4. Print the current url
        System.out.println("The Current Url: " + driver.getCurrentUrl());

        // 5. Print the page source
        System.out.println(driver.getPageSource());

        // 6. Enter the email to email field
        WebElement emailField = driver.findElement(By.id("username"));
        emailField.sendKeys("k123@gmail.com");

        // 7. Enter the password to password field
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("k12345");

        // 8. Click on Login Button
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login\"]/button/i"));
        login.click();

        // 9. Print the current url
        System.out.println(" Get Current Url " + driver.getCurrentUrl());

        // 10. Refresh the page
        driver.navigate().refresh();

        // 11. Close the browser
        driver.quit();

    }

}
