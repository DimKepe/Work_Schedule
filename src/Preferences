import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



@SuppressWarnings("unchecked")


public class Preferences {

	public static void main(String[] args) {
		
		JSONObject Preferences = new JSONObject();

		Preferences.put("IDErgazomenou", "1");
		Preferences.put("BardiaPoyThelei", "Proini Vardia");
		Preferences.put("BardiaPoyDenThelei", "Apogeymatini kai Bradini bardia");
		
		JSONObject epiloghObject = new JSONObject(); 
		epiloghObject.put("Epiloges", Preferences );
		
		
		
		 JSONObject Preferences2 = new JSONObject();
		Preferences2.put("IDErgazomenou", "2");
		Preferences2.put("BardiaPoyThelei", "Apogeymatini kai Bradini bardia");
		Preferences2.put("BardiaPoyDenThelei", "Proini Vardia");
		
		
		JSONObject epiloghObject2 = new JSONObject(); 
		epiloghObject2.put("Epiloges", Preferences2 );
		 
		
		JSONArray Epiloges = new JSONArray();
		Epiloges.add(epiloghObject);
		Epiloges.add(epiloghObject2);


		
	//Write JSON file
    try (FileWriter file = new FileWriter("Preferences.json")) {

        file.write(Epiloges.toJSONString());
        file.flush();
        System.out.println("Writing JSON object to file");
		System.out.println("-----------------------");
		System.out.print(Epiloges);

    } catch (IOException e) {
        e.printStackTrace();
    }
}


}
