package com.stepDefination;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class testSelenium {

	public static void main(String[] args) {
		System.out.println("Test started");
		
		testSelenium st = new testSelenium();
		st.user_is_testing_the_selenium();

	}
	@Given("user is testing the selenium")
	public void user_is_testing_the_selenium() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	   WebElement un = driver.findElement(By.name("username"));
	   un.sendKeys("Admin");
	   
	   WebElement pw = driver.findElement(By.name("password"));
	   pw.sendKeys("admin123");
	   	   
	   driver.findElement(By.tagName("button")).click();
	   
}
}