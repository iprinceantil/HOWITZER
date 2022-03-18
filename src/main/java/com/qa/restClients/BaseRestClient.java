package com.qa.restClients;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;

public class BaseRestClient {
	
	public Response fireGetRequest(String requestUrl) {
		
		RestAssured.baseURI = requestUrl;
		return RestAssured.given().request(Method.GET);

	}
	
	public Response firePostRequest(String requestUrl, String pathJsonPayload ) {

		RestAssured.baseURI = requestUrl;
		return RestAssured.given().header("Content-Type", "application/json").body(new File(pathJsonPayload)).request(Method.POST);
		
	}
	
	public Response fireDeleteRequest(String requestUrl) {

		RestAssured.baseURI = requestUrl;
		return RestAssured.given().request(Method.DELETE);
		
	}
	
	public Response firePutRequest(String requestUrl, String pathJsonPayload) {

		RestAssured.baseURI = requestUrl;
		return RestAssured.given().header("Content-Type", "application/json").body(new File(pathJsonPayload)).request(Method.PUT);

	}

}
