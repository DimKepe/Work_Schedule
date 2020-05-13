import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
 
public class ReadEmployeesDetails
{
    @SuppressWarnings("unchecked")
    public static void main(String[] args) 
    {
        //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
         
        try (FileReader reader = new FileReader("Employees.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            JSONArray employeeList = (JSONArray) obj;
           // System.out.println(employeeList);
             
            //Iterate over employee array
            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp ) );
 
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
 
    private static void parseEmployeeObject(JSONObject employee) 
    {
    	
    	 
    	
    	
        //Get employee object within list
        JSONObject employeeObject = (JSONObject) employee.get("employee");
         
        System.out.println("_________________EMPLOYEE DETAILS_________________");
  	    
  	    System.out.println("_____________________________________________________");
        //Get Employee ID 
        
        String ID = (String) employeeObject.get("ID");    
        System.out.println("ID : " + ID);
        
        //Get employee first name
        String Name = (String) employeeObject.get("Name");    
        System.out.println("Name : " + Name);
         
        //Get employee last name
        String lastName = (String) employeeObject.get("LastName");  
        System.out.println("Last Name : " + lastName);
         
        System.out.println("---------------------------------------------------------");
       
    }
}
