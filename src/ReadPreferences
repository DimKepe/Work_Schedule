import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
	 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
	 
	public class ReadPreferences {
	    @SuppressWarnings("unchecked")
	    
	    public static void main(String[] args) 
	    {
	        //JSON parser object to parse read file
	        JSONParser jsonParser = new JSONParser();
	         
	        try (FileReader reader = new FileReader("Preferences.json"))
	        {
	            //Read JSON file
	            Object obj = jsonParser.parse(reader);
	 
	            JSONArray PreferencesList  = (JSONArray) obj;
	           // System.out.println(employeeList);
	             
	            //Iterate over employee array
	            PreferencesList.forEach( epil -> parseepiloghObject( (JSONObject) epil ) );
	 
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }
	    }
	 
	    private static void parseepiloghObject (JSONObject employee) 
	    {
	        //Get employee object within list
	        JSONObject epiloghObject = (JSONObject) employee.get("Epiloges");
	         
	        
	        System.out.println("__________________PREFERENCES_________________");
		    
		    System.out.println("_____________________________________________________");
	        
	        
	        
	        //Get Employee ID 
	        
	        String IDErgazomenou = (String) epiloghObject.get("IDErgazomenou");    
	        System.out.println("ID Ergazomenou : " + IDErgazomenou);
	        
	        String BardiaPoyThelei = (String) epiloghObject.get("BardiaPoyThelei");    
	        System.out.println("Bardia Poy Thelei: : " + BardiaPoyThelei);
	
	        String BardiaPoyDenThelei = (String) epiloghObject.get("BardiaPoyDenThelei");  
	        System.out.println("Bardia Poy Den Thelei : " + BardiaPoyDenThelei);
	         
	        System.out.println("---------------------------------------------------------");
	       
	    }
	}
