package Reqress;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Specification {
	String id="";
	RequestSpecification reqspec;
	ResponseSpecification responsespec;
	@BeforeClass
	public void setBaseurl(){
		RestAssured.baseURI="https://reqres.in/api/users?page=2";
		RequestSpecBuilder builder=new RequestSpecBuilder();
		builder.setAccept("application/json");
		builder.setContentType("application/json");
		reqspec=builder.build();
		
		
		ResponseSpecBuilder buildResponse=new ResponseSpecBuilder();
		buildResponse.expectContentType("application/json");
		buildResponse.expectStatusCode(200);
		responsespec=buildResponse.build();
	
    }

}
