package com.steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDefinition {
	
	public WebDriver driver;
	
	@Given("User is on Google page")
	public void user_is_on_google_page() {
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(option);
		driver.get("https://www.google.co.in/");
	    
	}
	@Then("User verify the  message on home page")
	public void user_verify_the_message_on_home_page() {
	
	    
	}

}
