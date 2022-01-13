package com.qa.pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class HomePage extends TestBase{

	//	Object Repository
	private @FindBy(xpath = "//a[@href='https://selectorshub.com/more/']") WebElement menuBtn_More;
	private @FindBy(xpath = "//a[@href='https://selectorshub.com/xpath-practice-page/']") WebElement dropDownList_xPathPracticePage;

	//	Default Constructor to initialize Objects
	public HomePage() {
		PageFactory.initElements(driver, this);
	}

	//	Getter methods to get the Elements from Object Repository.
	public WebElement getMenuBtn_More() {
		return menuBtn_More;
	}

	public WebElement getDropDownList_xPathPracticePage() {
		return dropDownList_xPathPracticePage;
	}
	

}

