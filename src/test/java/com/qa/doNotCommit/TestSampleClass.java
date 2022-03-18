package com.qa.doNotCommit;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.qa.pageObjects.HomePage;
import com.qa.testBase.TestBase;
import com.qa.utils.TestUtil;

public class TestSampleClass extends TestBase {

	private static Logger LOG = LogManager.getLogger(TestSampleClass.class);

	@BeforeMethod
	public void SetUp() {

		new TestBase().initChrome();
		driver.get(propManager.getValue("url"));

	}

	@Test
	public void LaunchTest() {

		Actions actions = new Actions(driver);
		actions.moveToElement(new HomePage().getMenuBtn_More()).build().perform();
		
		new HomePage().getDropDownList_xPathPracticePage().click();
		new TestUtil().takeScreenshot(driver);
		LOG.info(driver.getTitle());

	}

	@AfterMethod
	public void TearDown() {

		driver.quit();

	}
	
	
}
