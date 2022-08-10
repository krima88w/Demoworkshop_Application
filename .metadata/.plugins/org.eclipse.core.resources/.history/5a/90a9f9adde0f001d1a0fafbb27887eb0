import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

@Test
public class TC001_GET_Request 
{
	public void getWeatherDetails()
	{
		//specify base uri
		RestAssured.baseURI="https://reqres.in/api/products";
		//request object
		RequestSpecification httprequest = RestAssured.given();
		//response object
		Response response = httprequest.request(Method.GET);
		//print response in console window
		String responseBody = response.getBody().asString();
		System.out.println("response body is="+responseBody );
		//status code validation
		 int statuscode = response.getStatusCode();
		System.out.println(statuscode);
		Assert.assertEquals(statuscode, 200);
		//statusline verification
		String statusline = response.getStatusLine();
		System.out.println(statusline);
		Assert.assertEquals(statusline, "HTTP/1.1 200 OK");
		
	}

}
