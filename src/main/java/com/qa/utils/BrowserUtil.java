package com.qa.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.Assert;

import com.qa.testBase.TestBase;

public class BrowserUtil extends TestBase {

	public String Execute(WebDriver driver) {

		Set<String> handles = driver.getWindowHandles();
		List <String> ls = new ArrayList<String>(handles);

		String parentWindowId = ls.get(0);
		System.out.println("Parent window driverId captured and returned.");
		return parentWindowId;

	}

	public static String getCurrentDownloadedFileName() {

		System.out.println("<<	FILE EXTRACTION FROM CHROME DOWNLOADS INITIATED		>>");
		String filename, title;

		driver.switchTo().newWindow(WindowType.TAB);

		Set<String> handles = driver.getWindowHandles();
		List <String> ls = new ArrayList<String>(handles);
		String parentWindowId = ls.get(0);

		driver.get("chrome://downloads/");
		System.out.println("Driver switched to : "+driver.getTitle());

		title = driver.getTitle();
		Assert.assertEquals("Downloads", title,"Invalid Page Loaded.");

		WebElement root1 = driver.findElement(By.tagName("downloads-manager"));
		WebElement shadowRoot1 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot",root1);

		WebElement root2 = shadowRoot1.findElement(By.cssSelector("downloads-item"));
		WebElement shadowRoot2 = (WebElement) ((JavascriptExecutor) driver).executeScript("return arguments[0].shadowRoot",root2);

		filename = shadowRoot2.findElement(By.id("file-link")).getText();
		System.out.println("Filename Extraction successful via selenium.");

		System.out.println("Downloaded file name : "+filename);
		driver.close();

		driver.switchTo().window(parentWindowId);
		System.out.println("Driver switched to : "+driver.getTitle());
		System.out.println("<<	FILE EXTRACTION FROM CHROME DOWNLOADS COMPLETED SUCCESSFULLY	>>");
		return filename;

	}

}
