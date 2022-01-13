package com.qa.udemyRestAssured;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Basics {

	// given - all input details
	// when - Submit the API - resource,httpMethods
	// then - Validate the response

	@Test
	public void test1() {

		RestAssured.baseURI= "https://rahulshettyacademy.com";

		Response responsePost=given().queryParam("key", "qaclick123").header("Content-Type","application/json")
				.body(PAYLOAD_ADD_PLACE()).when().post("maps/api/place/add/json")
				.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
				.header("server", "Apache/2.4.18 (Ubuntu)").extract().response();

		System.out.println(responsePost.asString());
		String placeId = responsePost.jsonPath().get("place_id");
		System.out.println(placeId);

		//Update Place
		String newAddress = "Summer Walk, Africa";
		Response responsePut = given().queryParam("key", "qaclick123").header("Content-Type","application/json")
				.body(PAYLOAD_UPDATE_PLACE(placeId,newAddress)).when().put("maps/api/place/update/json")
				.then().assertThat().statusCode(200).body("msg", equalTo("Address successfully updated")).extract().response();
		System.out.println(responsePut.asString());
		System.out.println();

		//Get Place
		Response responseGet = given().queryParam("key", "qaclick123").queryParam("place_id", placeId)
				.when().get("maps/api/place/get/json")
				.then().assertThat().statusCode(200).extract().response();
		
		String res1 = responseGet.jsonPath().get("accuracy");
		String res2 = responseGet.jsonPath().get("name");
		String res3 = responseGet.jsonPath().get("phone_number");
		String res4 = responseGet.jsonPath().get("address");
		String res5 = responseGet.jsonPath().get("types");
		String res6 = responseGet.jsonPath().get("website");
		String res7 = responseGet.jsonPath().get("language");
		String res8 = responseGet.jsonPath().get("location.latitude");
		String res9 = responseGet.jsonPath().get("location.longitude");
		
		System.out.println("latitude     : "+res8);
		System.out.println("longitude    : "+res9);
		System.out.println("accuracy     : "+res1);
		System.out.println("name         : "+res2);
		System.out.println("phone_number : "+res3);
		System.out.println("address      : "+res4);
		System.out.println("types        : "+res5);
		System.out.println("website      : "+res6);
		System.out.println("language     : "+res7);
		
		Assert.assertEquals(res4, newAddress,"Incorrect Address reported");
		
	}
	/*----------------------------------------------------------------------------------------------------------------------------*/
	public static String PAYLOAD_ADD_PLACE() {
		return "{\r\n" + 
				"  \"location\": {\r\n" + 
				"    \"lat\": -38.383494,\r\n" + 
				"    \"lng\": 33.427362\r\n" + 
				"  },\r\n" + 
				"  \"accuracy\": 50,\r\n" + 
				"  \"name\": \"Rahul Shetty Academy\",\r\n" + 
				"  \"phone_number\": \"(+91) 983 893 3937\",\r\n" + 
				"  \"address\": \"29, side layout, cohen 09\",\r\n" + 
				"  \"types\": [\r\n" + 
				"    \"shoe park\",\r\n" + 
				"    \"shop\"\r\n" + 
				"  ],\r\n" + 
				"  \"website\": \"http://rahulshettyacademy.com\",\r\n" + 
				"  \"language\": \"French-IN\"\r\n" + 
				"}\r\n" + 
				"";
	}

	public static String PAYLOAD_UPDATE_PLACE(String placeId, String newAddress) {
		return "{\r\n" + 
				"\"place_id\":\""+placeId+"\",\r\n" + 
				"\"address\":\""+newAddress+"\",\r\n" + 
				"\"key\":\"qaclick123\"\r\n" + 
				"}";
	}

}
