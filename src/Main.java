public class Main {

    public static void main (String[] args)
    {
        BusinessDetails businessDetails = new BusinessDetails();
        Functions functions = new Functions();
        //Need loop for program when to terminate
        //need loop in order to scan every employee and save them to hash map

        //create employee
        Employee employee = new Employee();
        employee.setName("general kenobi");
        employee.setId(5);
        employee.setDaysToWorkPerDayLeft(8);
        employee.setPreferenceShiftADay("prwi");
        //save employee
        businessDetails.employees.put(5,employee);

        //Generate program per day
        functions.programCreationPerDay(businessDetails);

        //Displays program per day
        for (String i : businessDetails.programPerDay.keySet()) {
            System.out.println("name: " + i + " shift: " + businessDetails.programPerDay.get(i));
        }

    }
}