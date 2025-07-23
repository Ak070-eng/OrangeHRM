package com.stepDefination;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class windowhandle {

	public static void main(String[] args) {
	
		windowhandle a = new windowhandle();
		a.user_test_window_handle();
		
	}


@Given("User test window handle")
public void user_test_window_handle() {
	
	   WebDriver driver=new ChromeDriver();
	   
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	   
	   driver.findElement(By.xpath("//a[contains(text(),'OrangeHRM, Inc')]")).click();
	   
	   String parentWindow = driver.getWindowHandle();
	   
	   System.out.println(parentWindow);
	   
	   Set<String> allWindows = driver.getWindowHandles();
	   
	   List<String> windowList = new ArrayList<String>(allWindows);
	   
	  String parentWindow1 = windowList.get(0);
	   System.out.println(parentWindow1);
	   
	   String childWindow = windowList.get(1);
	   System.out.println(childWindow);
	   
	   driver.switchTo().window(childWindow);
	  System.out.println(driver.getCurrentUrl());
	  
	  driver.switchTo().window(parentWindow1);
	  System.out.println(driver.getCurrentUrl());
	  System.out.println("Test clone");
	  System.out.println("This is after clone commit");
	   
}

	
}
