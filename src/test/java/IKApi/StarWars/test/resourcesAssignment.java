package IKApi.StarWars.test;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class resourcesAssignment {
	
	public static RestAssured restAssured;
	public static Response response;
	

	@BeforeClass
	public void init() {
		restAssured.baseURI="https://jsonplaceholder.typicode.com/";
	}
	
	@Test
	public void getPosts() {
     response=restAssured.get("/posts");
     assertEquals(response.getStatusCode(), 200);
	}
	@Test
	public void getComments() {
     response=restAssured.get("/comments");
     assertEquals(response.getStatusCode(), 200);
	}
	
	@Test
	public void getAlbums() {
     response=restAssured.get("/albums");
     assertEquals(response.getStatusCode(), 200);
	}
	

	@Test
	public void getPhotos() {
     response=restAssured.get("/photos");
     assertEquals(response.getStatusCode(), 200);
	}
	
	@Test
	public void getTodos() {
     response=restAssured.get("/todos");
     assertEquals(response.getStatusCode(), 200);
	}
	@Test
	public void getUsers() {
     response=restAssured.get("/users");
     assertEquals(response.getStatusCode(), 200);
	}
}
