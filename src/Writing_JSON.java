import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;


@SuppressWarnings("unchecked")


public class Writing_JSON {	
	public static void main(String[] args) {
		
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Window.createAndShowGUI();
            }
        });
        
		//First Employee 
		JSONObject Details = new JSONObject();
		Details.put("Epitheto", "Papadopoylos");
		Details.put("Onoma", "Dimitris");
		Details.put("Hm_Gennisis", "1985-02-16");
		
		JSONObject employeeObject = new JSONObject ();
		employeeObject.put("Ergazomenos_1",Details);
		
		//Second Employee 
		
		JSONObject employeeDetails2 = new JSONObject();
        employeeDetails2.put("Epitheto", "Dimitriadis");
        employeeDetails2.put("Onoma", "Giwrgos");
        employeeDetails2.put("Hm_gennisis", "1978-12-05");
         
        JSONObject employeeObject2 = new JSONObject(); 
        employeeObject2.put("Ergazomenos_2", employeeDetails2);
		
      //Add employees to list
        JSONArray employeeList = new JSONArray ();
        employeeList.add(employeeObject);
        employeeList.add(employeeObject2);
       
      //Write JSON file
        
        try (FileWriter file= new FileWriter ("employees.json"))
        {
        	file.write(employeeList.toJSONString());
        	file.flush();
        	
        } catch (IOException e)
        {
        	e.printStackTrace();
        } 
    		
        
      //JSON parser object to parse read file
        JSONParser jsonParser = new JSONParser();
        
        try (FileReader reader = new FileReader("employees.json"))
        {
            //Read JSON file
            Object obj = jsonParser.parse(reader);
 
            
            //System.out.println(employeeList);
             
            //Iterate over employee array
            employeeList.forEach( emp -> parseEmployeeObject( (JSONObject) emp));
 
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
	         
	        //Get employee first name
	        String Epitheto = (String) employeeObject.get("Epitheto");    
	        System.out.println(Epitheto);
	         
	        //Get employee last name
	        String Onoma = (String) employeeObject.get("Onoma");  
	        System.out.println(Onoma);
	         
	        //Get employee DateofBirth
	        String hm_gennisis = (String) employeeObject.get("Hm_gennisis");    
	        System.out.println(hm_gennisis);
	    }
		
		
}
	
	



