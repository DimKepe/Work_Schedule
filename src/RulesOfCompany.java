import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@SuppressWarnings("unchecked")

public class RulesOfCompany {

	public static void main(String[] args) {

		JSONObject Rules = new JSONObject();

		Rules.put("MinWorkingHoursPerWeek", "40");
		Rules.put("MaxWorkingHoursPerWeek", "56");
		Rules.put("Daysoffperweek", "2");
		Rules.put("AvailableShifts", "3");
		Rules.put("MorningShift", "7:00-15:00");
		Rules.put("AfternoonShift", "15:00-23:00");
		Rules.put("NightShift", "23:00-07:00");
		
		
		 JSONObject RulesObject = new JSONObject(); 
	       RulesObject.put("CompRules", Rules);

		JSONArray RulesList = new JSONArray();
		     RulesList.add(RulesObject);

		     
		     
	
			try (FileWriter file = new FileWriter("RulesOfCompany.json")) {
				 
	            file.write(RulesList.toJSONString());
	            file.flush();
	            System.out.println("Writing JSON object to file");
				System.out.println("-----------------------");
				System.out.print(RulesList);

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }			
			
		
	}

