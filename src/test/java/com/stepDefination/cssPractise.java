package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class cssPractise {

	public static void main(String[] args) {
		cssPractise a = new cssPractise();
		a.user_test_css();

	}
	
	@Given("user test css")
	public void user_test_css() {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("input#firstName")).sendKeys("Akshay");
		driver.findElement(By.cssSelector(".name[id='lastName']")).sendKeys("Deshmukh");
		driver.findElement(By.cssSelector("input[placeholder='Gender']")).sendKeys("Male");
		driver.findElement(By.cssSelector("input[placeholder='City']")).sendKeys("Pune");
		driver.findElement(By.cssSelector("[placeholder='Country']")).sendKeys("India");
		
	}

}
