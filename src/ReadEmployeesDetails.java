

import java.io.File;
import java.io.FileReader;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadEmployeesDetails {
	public static void main(String[] args) {
		ClassLoader classLoader = new ReadEmployersDetails().getClass().getClassLoader();
		String fileName = "com/tpg/json/EmployeesDetails.json";
		File file = new File(classLoader.getResource(fileName).getFile());

		JSONParser parser = new JSONParser();
		try {
			FileReader reader = new FileReader(file.getAbsolutePath());
			Object obj = parser.parse(reader);
			JSONObject jsonObj = (JSONObject) obj;
			JSONObject EmployeesDetails = (JSONObject)jsonObj.get("EmployeesDetails");
			System.out.println("EmployeesDetails"+EmployeesDetails.toJSONString());
			
			for (int i = 0; i < 2; i++) {
				
				String EmployeeID = (String)EmployeesDetails.get("ID");
				System.out.println("ID:"+EmployeeID);
				
				String EmployeeName = (String)EmployeesDetails.get("Name");
				System.out.println("EmployeeName :"+EmployeeName);	
				
				String EmployeeLastName = (String)EmployeesDetails.get("LastName");
				System.out.println("EmployeeLastName :"+EmployeeLastName);	
				
				String EmployeeBday = (String)EmployeesDetails.get("DateOfBirth");
				System.out.println("Day of Birth :"+EmployeeBday);
				
				
				String EmployeeJobDescription = (String)EmployeesDetails.get("JobDescription");
				System.out.println("JobDescription:"+EmployeeJobDescription);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static HashMap EmployeesDetails(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}


