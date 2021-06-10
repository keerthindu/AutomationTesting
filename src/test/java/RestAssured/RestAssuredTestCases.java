package RestAssured;


import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Headers;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class RestAssuredTestCases {
	
	@Test
	@Ignore
	void getRequest() {
		
		RestAssured.baseURI = "https://reqres.in/api/users";
		
		RequestSpecification req = RestAssured.given();
		
		Response res = req.request(Method.GET,"/7");
		
		System.out.println("TestCase1 Body is: " + res.getBody().asString());
		
		int code=res.getStatusCode();
		System.out.println("Status code"+code);
		Assert.assertEquals(code, 200);
		
		String statusLine = res.getStatusLine();
		System.out.println("TestCase1 Status Line is:" +statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
			
	}
	
	@Ignore
	@Test
	void postRequest(){
		 //Specify base URI
		  RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		  
		  //Request object
		  RequestSpecification httpRequest=RestAssured.given();
		  
		   
		  //Request paylaod sending along with post request
		  JSONObject requestParams=new JSONObject();
		  
		  requestParams.put("name","Indu");
		  requestParams.put("Job","Engineer");
		 
		  httpRequest.header("content-type","application/json");
		  
		  httpRequest.body(requestParams.toJSONString()); // attach above data to the request
		  
		  //Response object
		  Response response=httpRequest.request(Method.POST,"/posts");
		    
		  
		  //print response in console window
		  
		  String responseBody=response.getBody().asString();
		  System.out.println("Test Case2 Response Body is:" +responseBody);
		  
		  //status code validation
		  int statusCode=response.getStatusCode();
		  System.out.println("TestCase2 Status code is: "+statusCode);
		  Assert.assertEquals(statusCode, 201);
		  
		  //success code validation
//		  String successCode=response.jsonPath().get("SuccessCode");
//		  Assert.assertEquals(successCode, "OPERATION_SUCCESS");
//			
		
	}
	
	@Test
	
	void validateHeaders(){
		
		RestAssured.baseURI= "https://jsonplaceholder.typicode.com";
		
		RequestSpecification request3 =RestAssured.given();
		
		Response response3 = request3.request(Method.GET,"/maps/api/place/nearbysearch/xml?location=-33.8670522,151.1957362&radius=1500&type=supermarket&key=AIzaSyBjGCE3VpLU4lgTqSTDmHmJ2HoELb4Jy1s");
		
		//body is not displaying due to endpoint error
		String body3 = response3.getBody().asString();
		System.out.println("The body is" + body3);
		
		String head = response3.getHeader("content-type");
		System.out.println("Content Type is :" +head);
		Assert.assertEquals(head, "application/json; charset=utf-8");
		
	}
	
	@Test
	@Ignore
	void getAllHeaders() {
		
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		
		RequestSpecification request4 = RestAssured.given();
		
		Response response4=request4.request(Method.GET,"/comments?postId=1");
		
		String body4 = response4.getBody().asString();
		System.out.println("The body is" + body4);
		
		Headers heads = response4.headers();
		
		for(Header h : heads) {
			
			System.out.println(h.getName() +"             " + h.getValue());
			
		}
	}
	@Test
	@Ignore
	public void ValidateResponseBody()
	{
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		RequestSpecification request5 = RestAssured.given();
		Response response5 =request5.request(Method.GET,"/comments?id=3");
		
		String body5=response5.asString();
		System.out.println("Body is" +body5);
		
		Assert.assertEquals(body5.contains("3"),true);
		
	}
		
	@Test
	@Ignore
	public void verifyAllDetailsInBody(){
		
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		RequestSpecification request6 = RestAssured.given();
		Response response6=request6.request(Method.GET,"/comments?id=3");
		
		//extract all value from json
		JsonPath js = response6.jsonPath();
		System.out.println(js.get("postId"));
		System.out.println(js.get("id"));
		System.out.println(js.get("name"));
		System.out.println(js.get("email"));
		System.out.println(js.get("body"));
		
		//String successcode = response6.jsonPath().get("");
		
		Assert.assertEquals(js.get("email"),"Nikita@garfield.biz");
		
	}
	

}
