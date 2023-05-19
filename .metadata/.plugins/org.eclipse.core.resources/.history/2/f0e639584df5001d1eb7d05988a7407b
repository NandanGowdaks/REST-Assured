package tests;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutUser extends Base{
	String resourcepath = "?page={id}";
	@Test
	public void testPut() {
	//https://reqres.in/api/users?page=1
	/*
	 * baseURI= "https://reqres.in/api"; given().
	 * get("/users?page=1").then().statusCode(200).log().all();
	 * 
	 */
		JSONObject payload = new JSONObject();
		
		payload.put("id", "7");
		payload.put("email", "ninjas@123.in");
		payload.put("first_name", "nandan");
		payload.put("last_name", "gowda");
		payload.put("avatar", "https://reqres.in/img/faces/4-image.jpg");

	 
		
		int statuscode = RestAssured
				.given()
					.spec(commonspec)
					
					.body(payload.toString())
				.when()
				
					.put("/7")
				.then()
					.log().all()
					.extract().response().statusCode();
			

	}


	}

