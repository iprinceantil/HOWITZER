package com.qa.udemyRestAssured;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class ReadingJsonFromFile {
	
	@Test
	public void test1() throws IOException {
		RestAssured.baseURI= "https://rahulshettyacademy.com";

		Response responsePost=given().queryParam("key", "qaclick123").header("Content-Type","application/json")
				.body(new String(Files.readAllBytes(Paths.get("FILE_PATH_HERE")))).when().post("maps/api/place/add/json")
				.then().assertThat().statusCode(200).body("scope", equalTo("APP"))
				.header("server", "Apache/2.4.18 (Ubuntu)").extract().response();

		System.out.println(responsePost.asString());
		String placeId = responsePost.jsonPath().get("place_id");
		System.out.println(placeId);
	}

}
