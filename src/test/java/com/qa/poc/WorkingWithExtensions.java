package com.qa.poc;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class WorkingWithExtensions {

	public static WebDriver driver;
	final static String TARGET_URL = "";
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\browserDrivers\\chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addExtensions(new File(System.getProperty("user.dir")+"chromeExtensions\\Proxy-Auto-Auth_v2.0.crx"));
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(ChromeOptions.CAPABILITY, options);
		options.merge(capabilities);
		
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		
		driver.findElement(By.id("login")).sendKeys("m88109");
		driver.findElement(By.id("password")).sendKeys("AntP$1686");
		driver.findElement(By.id("retry")).clear();
		driver.findElement(By.id("retry")).sendKeys("2");
		driver.findElement(By.id("save")).click();
		
		driver.get(TARGET_URL);

	}

}
