package com.qa.testBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {
	
	public ApplicationPropertyManager propManager = new ApplicationPropertyManager();
	public static WebDriver driver;
	
	public void initChrome() {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("start-maximized");
		
		driver = new ChromeDriver(options);
		
	}

}
