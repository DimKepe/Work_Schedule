import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

@SuppressWarnings("unchecked")

public class Rules_Of_Company {

	public static void main(String[] args) {

		JSONObject Rules = new JSONObject();

		Rules.put("MinWorkingHourPerWeek", "40");
		Rules.put("MaxWorkingHoursPerWeek", "56");
		Rules.put("Shifts", "3");
		Rules.put("Morning Shift", "7:00-15:00");
		Rules.put("Afternoon Shift", "15:00-23:00");
		Rules.put("Night Shift", "23:00-07:00");
		Rules.put("Number of Employees At Morning Shift", "15");
		Rules.put("Number ofEmployees At Afternoon Shift", "10");
		Rules.put("Number of Employees At Night Shift", "5");
		Rules.put(" Days off per week ", "2");

		JSONArray Rules1 = new JSONArray();
		Rules1.add(Rules);

		try {

			// Writing to a file
			File file = new File("EmployersDetails.json");
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			System.out.println("Writing JSON object to file");
			System.out.println("-----------------------");
			System.out.print(Rules);

			fileWriter.write(Rules.toJSONString());
			fileWriter.flush();
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
