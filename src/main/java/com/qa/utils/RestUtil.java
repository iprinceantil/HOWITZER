package com.qa.utils;

import java.util.List;

import org.testng.Assert;

import io.restassured.response.Response;

public class RestUtil {
	
	/*------------------------------------Validating Methods------------------------------------*/

	public void validateResponseStatusCode(Response response, int expectedStatusCode) {

		int statusCode = response.getStatusCode();
		System.out.println("Status Code is -->"+statusCode+"<--");
		Assert.assertEquals(statusCode,expectedStatusCode,"Incorrect status code recevied");

	}

	public void validateResponseStatusLine(Response response, String expectedStatusLine) {

		String statusLine =response.getStatusLine();
		System.out.println("Status line is -->"+statusLine+"<--");
		Assert.assertEquals(statusLine,expectedStatusLine,"Incorrect status line recevied");

	}

	public void validateResponseTime(Response response, long expectedResponseTime) {

		long responseTime = response.getTime();
		System.out.println("Response time is -->"+responseTime+"<--");
		Assert.assertTrue(responseTime<10000,"Rsponse Time is greater than "+expectedResponseTime/1000+" seconds");

	}

	public void validateResponseHeader(Response response, String headerKey, String expectedHeader) {

		String header = response.getHeader(headerKey);
		System.out.println("Value for "+headerKey+" is -->"+header+"<--");
		Assert.assertEquals(header,expectedHeader,"Incorrect header Recevied");

	}

	public void validateStringValueForJsonResponseKey(Response response, String responseJsonKey, String expectedValue) {

		String result = response.jsonPath().get(responseJsonKey);
		System.out.println("The value for "+responseJsonKey+" is -->"+result+"<--");
		Assert.assertEquals(result, expectedValue,"Incorrect value fetched for key "+responseJsonKey);

	}

	public void validateIntValueForJsonResponseKey(Response response, String responseJsonKey, int expectedValue) {

		int result = response.jsonPath().get(responseJsonKey);
		System.out.println("The value for "+responseJsonKey+" is -->"+result+"<--");
		Assert.assertEquals(result, expectedValue,"Incorrect value fetched for key "+responseJsonKey);

	}
	public void validateDoubleValueForJsonResponseKey(Response response, String responseJsonKey, double expectedValue) {

		double result = response.jsonPath().get(responseJsonKey);
		System.out.println("The value for "+responseJsonKey+" is -->"+result+"<--");
		Assert.assertEquals(result, expectedValue,"Incorrect value fetched for key "+responseJsonKey);

	}

	/*------------------------------------Fetching Methods------------------------------------*/

	public int getCountOfJsonObjectInResponse(Response response) {

		List<String> totalRecordsList = response.jsonPath().getList("$");
		int numberOfRecords = totalRecordsList.size();
		return numberOfRecords;
	}

	public String getStringValueForJsonResposnseKey(Response response, String responseJsonKey) {

		String result = response.jsonPath().get(responseJsonKey);
		System.out.println("The value for "+responseJsonKey+" is -->"+result+"<--");
		return result;
	}

	public int getIntValueForJsonResponseKey(Response response, String responseJsonKey) {

		int result = response.jsonPath().get(responseJsonKey);
		System.out.println("The value for "+responseJsonKey+" is -->"+result+"<--");
		return result;
	}

	public String getResponseHeader(Response response, String headerKey) {

		String header = response.getHeader(headerKey);
		System.out.println("Value for "+headerKey+" is -->"+header+"<--");
		return header;

	}

	public String getServicePlanId(String locationHeader) {

		String [] arr = locationHeader.split("/");
		String res = arr[arr.length-1];
		return res;

	}

}
