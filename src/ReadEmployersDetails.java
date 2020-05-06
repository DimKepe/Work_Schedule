

import java.io.File;
import java.io.FileReader;


import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

//com.googlecode.json-simple
public class ReadEmployersDetails {

	public static void main(String[] args) {
		ClassLoader classLoader = new ReadEmployersDetails().getClass().getClassLoader();
		String fileName = "com/tpg/json/EmployersDetails.json";
		File file = new File(classLoader.getResource(fileName).getFile());

		JSONParser parser = new JSONParser();
		try {
			FileReader reader = new FileReader(file.getAbsolutePath());
			Object obj = parser.parse(reader);
			JSONObject jsonObj = (JSONObject) obj;
			JSONObject EmployersDetails = (JSONObject)jsonObj.get("EmployersDetails");
			System.out.println("EmployersDetails"+EmployersDetails.toJSONString());
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
