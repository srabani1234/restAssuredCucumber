package com.api.pages;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import io.restassured.RestAssured;

public class employeeDetails {
	
	public void employeeDetail() {
		RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employee";
		RestAssured.basePath = "/1";
		given()
		.when()
		    .get()
		.then()
		.statusCode(200)
		.statusLine("HTTP/1.1 200 OK")
		.assertThat().body("status", equalTo("success"))
		.assertThat().body("data.employee_name", equalTo("Tiger Nixon"))
		.header("Content-Type", "application/json");
	}

}
