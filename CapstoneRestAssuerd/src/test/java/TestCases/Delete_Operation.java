package TestCases;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Delete_Operation {

	public static void main(String[] args) throws FileNotFoundException {
	   
		File f=new File("../CapstoneRestAssuerd/POST.json");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new  JSONTokener(fr);
		JSONObject jo=new JSONObject(jt);
		
		Response resp=
				
				given()
				.contentType(ContentType.JSON)
				.when().delete("https://reqres.in/api/users/2");
		System.out.println("delete Response body is:"+resp.asString());
		System.out.println("the status response code is :"+resp.getStatusCode());

	}

}