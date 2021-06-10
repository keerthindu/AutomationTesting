package DataDrivenTesting;

import java.io.IOException;

import org.bouncycastle.asn1.ocsp.Request;
import org.json.simple.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;

public class DataDrivenTest_add_new_Record {
	
	@Test(dataProvider="empDataProvider")
	public void postRecord(String ename, String ejob, String eage) 
	{
		RestAssured.baseURI="https://jsonplaceholder.typicode.com";
		
		RequestSpecification req = RestAssured.given();
		
		//Create the data and send along with the post method
		JSONObject param = new JSONObject();
		param.put("Name", ename);
		param.put("Job", ejob);
		param.put("Age", eage);
		
		
		req.header("content-type", "application/json; charset=utf-8");
		
		req.body(param.toJSONString());
		
		Response resp = req.request(Method.POST,"/posts");
		
		String body = resp.getBody().asString();
		
		Assert.assertEquals(body.contains(ename), true);
		Assert.assertEquals(body.contains(ejob), true);
		Assert.assertEquals(body.contains(eage), true);
		System.out.println("body is" + body);
		
		int code=resp.statusCode();
		Assert.assertEquals(code, 201);
	}

	@DataProvider(name="empDataProvider")
	String[][] getEmpData() throws IOException {
		
		
		//read data from xl
		String path ="C:/Users\\Admin/eclipse-workspace/AutomationTesting/src/test/java/DataDrivenTesting/EmployeeDetails.xlsx";
		
		int rownum=xLUtility.getRowCount(path, "Sheet1");
		int colcount=xLUtility.getCellCount(path, "Sheet1", 1);
		
		String details[][] = new String[rownum][colcount];
		for(int i=1; i<=rownum;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				details[i-1][j]=xLUtility.getCellData(path, "Sheet1", i, j);
			}
		}
		
		
		
		//String data[][] = {{"Priya","Doctor","30"},{"Abi","Teacher","22"},{"Raj","Driver","40"}};
		return(details);
	}
}
