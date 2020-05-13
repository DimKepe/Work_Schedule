import java.io.FileWriter;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
 
public class Employees
{
    @SuppressWarnings("unchecked")
    public static void main( String[] args )
    {
        //First Employee
        JSONObject employeeDetails = new JSONObject();
        employeeDetails.put("ID", "1");
		employeeDetails.put("LastName", "Papadopoylos");
		employeeDetails.put("Name", "Giannis");
		employeeDetails.put("DateOfBirth", "20-05-1986");
		employeeDetails.put("Job description ","Security");
         
        JSONObject employeeObject = new JSONObject(); 
        employeeObject.put("employee", employeeDetails);
         
        //Second Employee
        JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("ID", "2");
		employeeDetails2.put("LastName", "Iatridis");
		employeeDetails2.put("Name", "Nikos");
		employeeDetails2.put("DateOfBirth", "19-03-1997");
		employeeDetails.put("Job description ","Logistis");
		
        JSONObject employeeObject2 = new JSONObject(); 
        employeeObject2.put("employee", employeeDetails2);
         
        
        //ThridEmployee
        JSONObject employeeDetails3 = new JSONObject();
        employeeDetails3.put("ID", "3");
		employeeDetails3.put("LastName", "Kyriakidis");
		employeeDetails3.put("Name", "Manolis");
		employeeDetails3.put("DateOfBirth", "19-08-1985");
		employeeDetails3.put("Job description ","Marketing");
		
		 JSONObject employeeObject3 = new JSONObject(); 
	        employeeObject3.put("employee", employeeDetails3);
	         
        
        //FourthEmployee
	        
	        JSONObject employeeDetails4 = new JSONObject();
	        employeeDetails4.put("ID", "4");
			employeeDetails4.put("LastName", "Papaiwannoy");
			employeeDetails4.put("Name", "Mixalis");
			employeeDetails4.put("DateOfBirth", "05-12-1995");
			employeeDetails4.put("Job description ","Paragwgh");
			
			 JSONObject employeeObject4 = new JSONObject(); 
		        employeeObject4.put("employee", employeeDetails4);
		         
	        
        
        //Add employees to list
        JSONArray employeeList = new JSONArray();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
        employeeList.add(employeeObject3);
        employeeList.add(employeeObject4);
         
        //Write JSON file
        try (FileWriter file = new FileWriter("employees.json")) {
 
            file.write(employeeList.toJSONString());
            file.flush();
            System.out.println("Writing JSON object to file");
			System.out.println("-----------------------");
			System.out.print(employeeList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
