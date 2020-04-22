import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@SuppressWarnings("unchecked")

public class EmployeesDetails {

	public static void main(String[] args) {

		JSONObject EmployeeDetails = new JSONObject();
		EmployeeDetails.put("ID", "1");
		EmployeeDetails.put("LastName", "Papadopoylos");
		EmployeeDetails.put("Name", "Giannis");
		EmployeeDetails.put("DateOfBirth", "20-05-1986");

		JSONObject EmployeeDetails2 = new JSONObject();
		EmployeeDetails2.put("ID", "2");
		EmployeeDetails2.put("LastName", "Papadopoylos");
		EmployeeDetails2.put("Name", "Nikos");
		EmployeeDetails2.put("DateOfBirth", "19-03-1997");

		JSONArray Employees = new JSONArray();
		Employees.add(EmployeeDetails);
		Employees.add(EmployeeDetails2);

		try {

			// Writing to a file
			File file = new File("EmployeesDetails.json");
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			System.out.println("Writing JSON object to file");
			System.out.println("-----------------------");
			System.out.print(Employees);

			fileWriter.write(Employees.toJSONString());
			fileWriter.flush();
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
