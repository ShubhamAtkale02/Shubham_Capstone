package TestCases;

import static io.restassured.RestAssured.given;

import io.restassured.response.Response;

public class GET_Operation {

public static void main(String[] args) {
	
 
		Response resp=given().
				when()
				.get("https://reqres.in/api/users?id=10");
		
		System.out.println(resp.asString());
		String firstname=resp.jsonPath().getString("data.first_name");
		String id=resp.jsonPath().getString("data.id");
		System.out.println("The first name is: " +firstname);
		System.out.println("The id is: " +id);
		 System.out.println(resp.getStatusCode());
		 
		
 
        
	}
}
