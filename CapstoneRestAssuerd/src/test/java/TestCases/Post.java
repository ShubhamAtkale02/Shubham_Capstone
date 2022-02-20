package TestCases;



import static io.restassured.RestAssured.given;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Post {

	public static void main(String[] args) throws FileNotFoundException {
		
		File f=new File("../CapstoneRestAssuerd/POST.json");
		FileReader fr=new FileReader(f);
		JSONTokener jt=new  JSONTokener(fr);
		JSONObject jo=new JSONObject(jt);
		
		Response resp=
				
				given()
				.contentType(ContentType.JSON)
				.body(jo.toString())
				.when()
				.post("https://reqres.in/api/users");
		
		    String id=resp.jsonPath().getString("data.id");
			System.out.println("Status code is "+ resp.getStatusCode());
			System.out.println("Data posted is");
			System.out.println(resp.asString());
			//System.out.println("This is ID :"+id);
		
	}

}
