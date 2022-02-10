package apiTestcases;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class TestCase2 {
	
	@Test
	public void test1()
	{
		//Step 1 Create new Record
				RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/create";
				RequestSpecification request = RestAssured.given();
				
				Object str="{\"name\":\"Anand Bhayre\",\"salary\":\"4577\",\"age\":\"31\"}";
				
				// Add the Json to the body of the request
				request.body(str);
				
				request.header("Content-Type", "application/json");
				
				// Post the request and check the response
				Response response = request.request(Method.POST);
								
				
				int statusCode = response.getStatusCode();
				System.out.println(statusCode);
				System.out.println(response.asString());
				
				
				
				
				
				JsonPath jsonPathEvaluator = response.jsonPath();
				String id = jsonPathEvaluator.get("data.id").toString();
				
				System.out.println(id);
				
		
	}

}
