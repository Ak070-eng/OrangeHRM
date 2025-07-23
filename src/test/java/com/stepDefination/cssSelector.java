package com.stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class cssSelector {

	public static void main(String[] args) {
		cssSelector a=new cssSelector();
		a.user_test_css1();

	}
	
	@Given("user test css1")
	public void user_test_css1() {
	 
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/css-selectors-practice.html");
		
		driver.findElement(By.cssSelector("#firstName")).sendKeys("Akshay");
		driver.findElement(By.cssSelector("input[placeholder='Last Name']")).sendKeys("Deshmukh");
		//driver.findElement(By.cssSelector(""));xpath("//input[@placeholder='Gender']");
		//driver.findElement(By.cssSelector(""));xpath //input[@placeholder='Gender' and @fdprocessedid='88kts']
		driver.findElement(By.xpath("//a[contains(text(),'Forgot Password')]")).click();
		
	}

}
