package com.qa.udemyRestAssured;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTestNg {
	
	// getdata from Excel in data procider and print in test xase

	@DataProvider(name = "Data")
	public Object[][] getData() {

		return new Object[][] 
				{
			{ "Guru99" },
			{ "Krishna" },
			{ "Bhupesh" }
				};

	}

	@Test(dataProvider = "Data")
	public void test1(String name) {
		
		System.out.println(name);
		
	}


}
