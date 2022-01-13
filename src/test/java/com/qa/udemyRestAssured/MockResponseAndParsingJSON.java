package com.qa.udemyRestAssured;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class MockResponseAndParsingJSON {
	
	@Test
	public void test1() {
		
		int countRPA = 0,countSelenium = 0,countCypress = 0;
		
		JsonPath js = new JsonPath(SAMPLE_RESPONSE());
		
		System.out.println("purchaseAmount    : "+js.getInt("dashboard.purchaseAmount"));
		System.out.println("website           : "+js.getString("dashboard.website"));
		
		
		// Number of copies sold by RPA
		int courseCount = js.getList("courses").size();
		System.out.println(courseCount);
		for(int i=0;i<courseCount;i++) {
			if(js.getString("courses["+i+"].title").equalsIgnoreCase("Selenium Python")) {
				countSelenium++;
			}
			if(js.getString("courses["+i+"].title").equalsIgnoreCase("Cypress")) {
				countCypress++;
			}
			if(js.getString("courses["+i+"].title").equalsIgnoreCase("RPA")) {
				countRPA++;
			}	
		}
		System.out.println("Selenium Copies Sold : "+countSelenium);
		System.out.println("Cypress Copies Sold  : "+countCypress);
		System.out.println("RPA Copies Sold      : "+countRPA);
		
	}
	
	
	public static String SAMPLE_RESPONSE() {
		return "{\r\n"
				+ "	\"dashboard\": {\r\n"
				+ "		\"purchaseAmount\": 910,\r\n"
				+ "		\"website\": \"rahulshettyacademy.com\"\r\n"
				+ "	},\r\n"
				+ "	\"courses\": [\r\n"
				+ "		{\r\n"
				+ "			\"title\": \"Selenium Python\",\r\n"
				+ "			\"price\": 50,\r\n"
				+ "			\"copies\": 6\r\n"
				+ "		},\r\n"
				+ "		{\r\n"
				+ "			\"title\": \"Cypress\",\r\n"
				+ "			\"price\": 40,\r\n"
				+ "			\"copies\": 4\r\n"
				+ "		},\r\n"
				+ "		{\r\n"
				+ "			\"title\": \"RPA\",\r\n"
				+ "			\"price\": 45,\r\n"
				+ "			\"copies\": 10\r\n"
				+ "		}\r\n"
				+ "	]\r\n"
				+ "}";
	}

}
