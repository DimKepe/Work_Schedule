import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadRules {

	@SuppressWarnings("unchecked")
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("RulesOfCompany.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray CompRules = (JSONArray) obj;
           // System.out.println(employeeList);
             
            //Iterate over employee array
            CompRules.forEach( Rule -> parseRulesObject( (JSONObject) Rule ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }



	private static void parseRulesObject(JSONObject Rules) 
	{
	   
	    JSONObject RulesObject = (JSONObject) Rules.get("CompRules");
	     
	    
	    System.out.println("__________________RULES OF COMPANY_________________");
	    
	    System.out.println("_____________________________________________________");
	    
	    String MinWorkingHoursPerWeek = (String) RulesObject.get("MinWorkingHoursPerWeek");    
	    System.out.println("Minimun Working Hours Per Week: " + MinWorkingHoursPerWeek);
	    
	    System.out.println("---------------------------------------------------------");
	    
	    String MaxWorkingHoursPerWeek = (String) RulesObject.get("MaxWorkingHoursPerWeek");    
	    System.out.println("Maximum Working Hours Per Week : " + MaxWorkingHoursPerWeek);
	     
	    System.out.println("---------------------------------------------------------");
	    
	    String Daysoffperweek = (String) RulesObject.get("Daysoffperweek");  
	    System.out.println("Days off per week : " + Daysoffperweek);
	    
	    System.out.println("---------------------------------------------------------");
	    
	    String AvailableShifts = (String) RulesObject.get("AvailableShifts");  
	    System.out.println("Available Shifts : " + AvailableShifts);
	    
	    System.out.println("---------------------------------------------------------");
	    
	    String MorningShift = (String) RulesObject.get("MorningShift");  
	    System.out.println("Morning Shiftt : " + MorningShift);
	    
	    System.out.println("---------------------------------------------------------");
	    
	    String AfternoonShift = (String) RulesObject.get("AfternoonShift");  
	    System.out.println("Afternoon Shift : " +AfternoonShift);
	    
	    System.out.println("---------------------------------------------------------");
	    
	    String NightShift = (String) RulesObject.get("NightShift");  
	    System.out.println("Night Shift : " + NightShift);
	   
	    System.out.println("---------------------------------------------------------");
	      
	}
	}
		
