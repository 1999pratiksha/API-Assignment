package Reqress;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class Create extends Specification {
	@Test(priority=1)
	public void Created() {
		JSONObject js=new JSONObject();
		js.put("name","Prati"); 
		js.put("job", "QA");
		given().spec(reqspec).then().expect().spec(responsespec);
		System.out.println(js.toJSONString());//converting it to a json string
		
	}

}
