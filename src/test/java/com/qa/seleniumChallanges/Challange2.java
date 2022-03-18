package com.qa.seleniumChallanges;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challange2 {
	
	WebDriver driver;
	String appUrl = "https://www.noon.com/uae-en/";
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(appUrl);
	}
	
	@Test
	public void testChallange2() throws InterruptedException{
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
		
		int r = driver.findElements(By.cssSelector("div[class='sc-1oj0twj-0 ilKVsG'] div[class='swiper-wrapper']")).size();
		System.out.println(r);
		
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
