package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

public class LoginSteps {

    WebDriver driver;
    WebDriverWait wait;

    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("User is on Login Page");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        // Wait for login panel to appear (this makes sure DOM has loaded)
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
    }

    @When("user enters user name and password")
    public void user_enters_user_name_and_password() {
        System.out.println("Step 2 : User enters ID Password");
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='username']")));
        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='password']")));
        username.sendKeys("Admin");
        password.sendKeys("admin123");
    }

    @And("Click on login button")
    public void click_on_login_button() {
        System.out.println("Step 3 : User is clicking on login button");
        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        loginBtn.click();
    }

    @Then("user land on home page")
    public void user_land_on_home_page() {
        System.out.println("User lands on Home Page");
        driver.quit();
    }
}

