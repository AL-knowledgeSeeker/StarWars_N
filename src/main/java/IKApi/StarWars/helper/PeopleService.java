package IKApi.StarWars.helper;

import IKApi.StarWars.constant.Endpoints;
import IKApi.StarWars.utils.ConfigManager;
import io.restassured.RestAssured;
import io.restassured.response.Response;

public class PeopleService {
	
	//private static final String BBASE_URL=ConfigManager.getInstance().getString("baseURL");
	private static final String BASE_URL=ConfigManager.getProperty().getProperty("baseURL");
	//private static final String BASE_URL="https://swapi.dev";
	public PeopleService() {
		
		RestAssured.baseURI=BASE_URL+"/api";
		RestAssured.useRelaxedHTTPSValidation();		
	}
	
	/*public List<People> getAllPeople(){
		
		
		Response response=RestAssured.given().header("content-type","application/json")
				.get(Endpoints.GET_ALL_PEOPLE);
	
	System.out.println(response.getStatusCode());
	System.out.println(response.asPrettyString());
	
	java.lang.reflect.Type type=new TypeReference<List<People>>(){}.getType();
	
	List<People> peoplelist=response.as(type);
	
	return peoplelist;
	
	
	
	}
	*/
public Response getAllPeople(){
		
		
		Response response=RestAssured.given().header("content-type","application/json")
				.get(Endpoints.GET_ALL_PEOPLE);
	
	System.out.println(response.getStatusCode());
//	System.out.println(response.asPrettyString());
	
	
	
	return response;
	
	
	
	}
}
