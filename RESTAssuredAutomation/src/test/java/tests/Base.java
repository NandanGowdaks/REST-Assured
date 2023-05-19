package tests;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class Base {
	
	public static RequestSpecification commonspec;
	
	@BeforeSuite
	public void setUp() throws FileNotFoundException, IOException {
		
		commonspec = new RequestSpecBuilder()
				.setBaseUri("https://reqres.in/api/users")
				//.setProxy("127.0.01", 8080)
				.setContentType(ContentType.JSON)
				.build();
	}
	
}
