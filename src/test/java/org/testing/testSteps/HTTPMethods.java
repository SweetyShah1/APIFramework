package org.testing.testSteps;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethods
{
	Properties prob;
	public HTTPMethods(Properties pr) 
	{

		prob= pr;
		// TODO Auto-generated constructor stub
	}
	
	public void PostMethod(String requestBody, String uriKeyvalue)
	{
		String urikey= prob.getProperty(uriKeyvalue);
		Response res= 
		given()
		.contentType(ContentType.JSON)
		.body(requestBody)
		.when()
		.post(urikey);
		
		System.out.println("URI is " + urikey);
		System.out.println("Status code is " + res.statusCode());
		
	}
	
	public void GetMethod()
	{
		
	}

}
