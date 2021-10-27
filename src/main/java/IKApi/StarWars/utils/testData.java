package IKApi.StarWars.utils;

import java.util.ArrayList;
import java.util.List;

public class testData {
	
	public static List<String> testData;
	public final int count = 82;
	
	public List<String> gettestData(){
		testData = new ArrayList<String>();
		testData.add("Darth Vader");
		testData.add("Chewbecca");
		testData.add("Roos Tarpals");
		testData.add("Rugor Nass");
		testData.add("Yarael Poof");
		testData.add("Lama Su");
		testData.add("Tuan Wu");
		testData.add("Grievous");
		testData.add("Tarfful");
		testData.add("Tion Medon");
		
		return testData;
		
	}

	
}
