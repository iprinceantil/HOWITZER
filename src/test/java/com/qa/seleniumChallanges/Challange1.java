package com.qa.seleniumChallanges;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Challange1 {

	WebDriver driver;
	String applicationUrl = "https://www.worldometers.info/world-population/";
	String locator = "//div[text()='This year' or text()='Today']//parent::div//span[@class='rts-counter']";	
	//	use 'following' instead of 'parent' for child element

	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(applicationUrl);
	}

	@Test
	public void testPopulationCount() {

		long finish = System.currentTimeMillis() + 3000; // end time 
		int counter = 0;
		while (System.currentTimeMillis() < finish) {
			String currentPopulation = driver.findElement(By.className("rts-counter")).getText();
			System.out.println("Current Population = "+currentPopulation);
			
			ArrayList<WebElement> e = (ArrayList<WebElement>) driver.findElements(By.xpath(locator));
			for(int i=0;i<e.size();i++) {
				if(i==0)
					System.out.println("Births Today                = "+e.get(i).getText());
				if(i==1)
					System.out.println("Deaths Today                = "+e.get(i).getText());
				if(i==2)
					System.out.println("Population Growth Today     = "+e.get(i).getText());
				if(i==3)	
					System.out.println("Births This Year            = "+e.get(i).getText());
				if(i==4)
					System.out.println("Deaths This Year            = "+e.get(i).getText());
				if(i==5)
					System.out.println("Population Growth This Year = "+e.get(i).getText());
			}
			System.out.println("=======================================================================Read Count = "+(counter+1));	
			counter++;
		}
	}

	@AfterMethod
	public void  tearDown() {
		driver.quit();
	}

}
