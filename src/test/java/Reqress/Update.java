package Reqress;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Update extends Create{
	@Test(priority=2)
	public void Update() {
		JSONObject js=new JSONObject();
		js.put("name","Prati");  //put is the method of json object
		js.put("job", "QA analyst");
		given().spec(reqspec).then().expect().spec(responsespec);
		System.out.println(js.toJSONString());
	}
	
}
