package Reqress;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

public class Delete extends Update {
	@Test(priority=3)
	public void Delete() {
		given().spec(reqspec).then().expect().spec(responsespec);
		
	}
	
}
