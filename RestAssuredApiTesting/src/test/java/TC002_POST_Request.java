import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TC002_POST_Request 

{
	@Test
	 void getProductDetails()
	{
	RestAssured.baseURI="https://reqres.in/api/customers";
	RequestSpecification httprequest = RestAssured.given();
	// request payload sending along with post request
	JSONObject requestparameters = new JSONObject();
	requestparameters.put("FirstName", "xyzwer");
	requestparameters.put("LastName", "wer12");
	requestparameters.put("UserName", "xyzwer");
	requestparameters.put("Password", "xyz12");
	requestparameters.put("Email", "xyz12@gmail.com");
	 httprequest.header("Content_Type", "application/json");
	 httprequest.body(	requestparameters.toJSONString());
	 
	Response response = httprequest.request(Method.POST,"/register");
	//print response in console window
			String responseBody = response.getBody().asString();
			System.out.println("response body is="+responseBody );
			//status code validation
			 int statuscode = response.getStatusCode();
			System.out.println(statuscode);
			Assert.assertEquals(statuscode, 201);
			//statusline verification
			String statusline = response.getStatusLine();
			System.out.println(statusline);
			Assert.assertEquals(statusline, "HTTP/1.1 201 Created");
			//success code validation
			String successcode = response.jsonPath().get("SuccessCode");
			Assert.assertEquals(successcode, "OPERATION_SUCCESS");
			
	

    }
}
