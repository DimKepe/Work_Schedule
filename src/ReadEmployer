import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class ReadEmployerDetails {

	@SuppressWarnings("unchecked")
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("employer.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray employers = (JSONArray) obj;
           // System.out.println(employeeList);
             
            //Iterate over employee array
            employers.forEach( employer -> parseEmployerObject( (JSONObject) employer ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }



private static void parseEmployerObject(JSONObject employer) 
{
   
    JSONObject employerObject = (JSONObject) employer.get("employer");
     
       System.out.println("_________________EMPLOYER DETAILS_________________");
	    
	    System.out.println("_____________________________________________________");
    
    String Company = (String) employerObject.get("CompanyName");    
    System.out.println("Company's Name : " + Company);
    
   
    String TotalNumberOfEmployees = (String) employerObject.get("TotalNumberOfEmployees");    
    System.out.println("Total Number Of Employees : " +TotalNumberOfEmployees);
     
    
    String MorningShift = (String) employerObject.get("MorningShift");  
    System.out.println("Morning Shift : " + MorningShift);
    
    String AfternoonShift = (String) employerObject.get("AfternoonShift");  
    System.out.println("Afternoon Shift : " + AfternoonShift);
    
    String NightShift = (String) employerObject.get("NightShift");  
    System.out.println("Night Shift : " + NightShift);
    
    System.out.println("---------------------------------------------------------");
}
}
