import java.io.FileWriter;
import java.io.IOException;
 
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Employer {
	
	
	@SuppressWarnings("unchecked")
	
	public static void main(String[] args) {
		
		JSONObject employerDetails = new JSONObject();
		
		employerDetails.put("CompanyName", "Afoi Gewrgiadi");
		employerDetails.put("Owner's Name", "Gergiadis Mixalis");
		employerDetails.put("Phone", "6972548796");
		employerDetails.put("TotalNumberOfEmployees", "10");
		employerDetails.put("MorningShift", "5");
		employerDetails.put("AfternoonShift", "3");
		employerDetails.put("NightShift", "2");
		

        JSONObject employerObject = new JSONObject(); 
        employerObject.put("employer", employerDetails);
        
        JSONArray employers = new JSONArray();
        employers.add(employerObject);

      //Write JSON file
        try (FileWriter file = new FileWriter("employer.json")) {
 
            file.write(employers.toJSONString());
            file.flush();
            System.out.println("Writing JSON object to file");
			System.out.println("-----------------------");
			System.out.print(employers);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
        
	}

