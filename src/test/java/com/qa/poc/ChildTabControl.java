package com.qa.poc;

import org.openqa.selenium.WindowType;

import com.qa.testBase.TestBase;
import com.qa.utils.BrowserUtil;


public class ChildTabControl extends TestBase {

	public static void main(String[] args) {

		new TestBase().initChrome();
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());

		driver.switchTo().newWindow(WindowType.TAB);
		
		String parentWindowId = new BrowserUtil().Execute(driver);
		
		driver.get("https://www.youtube.com/?gl=IN&tab=w11");
		System.out.println(driver.getTitle());
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println(driver.getTitle());

		driver.quit();

	}

}
