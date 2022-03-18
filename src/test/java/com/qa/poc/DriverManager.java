package com.qa.poc;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class DriverManager extends TestBase {


	@Test
	public void test() {
		
		new TestBase().initChrome();
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
	}

	@AfterMethod
	public void teardown() {
		if (driver != null) {
			driver.quit();
		}
		System.out.println("Driver is killed");
	}

}
