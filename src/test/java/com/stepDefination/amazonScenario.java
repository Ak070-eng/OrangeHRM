package com.stepDefination;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;

public class amazonScenario {

	public static void main(String[] args) {
	
		amazonScenario a = new amazonScenario();
		a.when_user_test_amazon_site();

	}
	@Given("when user test amazon site")
	public void when_user_test_amazon_site() {
	  
		System.out.println("test started");
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/?&tag=googhydrabk1-21&ref=pd_sl_5szpgfto9i_e&adgrpid=155259813593&hvpone=&hvptwo=&hvadid=763039729888&hvpos=&hvnetw=g&hvrand=11735868218403541031&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=9062111&hvtargid=kwd-64107830&hydadcr=14452_2423443&gad_source=1");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("kids puzzle");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement>lwe = driver.findElements(By.cssSelector(".a-price-whole"));
		for (WebElement i : lwe) {
			System.out.println(i.getText());
		}
	}


}
