import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;



@SuppressWarnings("unchecked")

public class EmployersDetails {

	public static void main(String[] args) {
		JSONObject Employer1 = new JSONObject();

		Employer1.put("ID", "1");
		Employer1.put("CompanyName", "Afoi Gewrgiadi");
		Employer1.put("Owner's Name", "Gergiadis Mixalis");
		Employer1.put("Phone", "6972548796");

		JSONObject Employer2 = new JSONObject();

		Employer2.put("ID", "2");
		Employer2.put("CompanyName", "Taste it");
		Employer2.put("Owner's Name", "Mixas Athanasios");
		Employer2.put("Phone", "6979875241");

		JSONArray Employers = new JSONArray();
		Employers.add(Employer1);
		Employers.add(Employer2);

		try {

			// Writing to a file
			File file = new File("EmployersDetails.json");
			file.createNewFile();
			FileWriter fileWriter = new FileWriter(file);
			System.out.println("Writing JSON object to file");
			System.out.println("-----------------------");
			System.out.print(Employers);

			fileWriter.write(Employers.toJSONString());
			fileWriter.flush();
			fileWriter.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
