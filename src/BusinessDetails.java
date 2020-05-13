import java.util.HashMap;

public class BusinessDetails  {
    int workersPerShift = 1;
    int numberOfWorkers = 4;
    int hoursOfShift = 8;
    int activeDays= 7;
    int activeHoursPerEmployeeADay=8;

    //Hash map for existed shifts in company
    HashMap <Integer,String> shiftExisted = new HashMap<>();
    {
        shiftExisted.put(1,"prwi");
        shiftExisted.put(2,"apogeyma");
        shiftExisted.put(3,"day off");
    }

    Employee employee1= new Employee();
    {
        employee1.setName("Thomas");
        employee1.setId(1);
        employee1.setDaysToWorkPerDayLeft(8);
        employee1.setPreferenceShiftADay("prwi");
    }
    Employee employee2= new Employee();
    {
        employee2.setName("Giannis");
        employee2.setId(2);
        employee2.setDaysToWorkPerDayLeft(8);
        employee2.setPreferenceShiftADay("apogeyma");
    }

    Employee employee3= new Employee();
    {
        employee3.setName("Kostas");
        employee3.setId(3);
        employee3.setDaysToWorkPerDayLeft(8);
        employee3.setPreferenceShiftADay("day off");
    }
    Employee employee4 = new Employee();
    {
        employee4.setName("Mixalis");
        employee4.setId(4);
        employee4.setDaysToWorkPerDayLeft(0);
        employee4.setPreferenceShiftADay("apogeyma");
    }

    //hash map for employees
    HashMap<Integer ,Employee> employees = new HashMap<>();
    {
        employees.put(1,employee1);
        employees.put(2,employee2);
        employees.put(3,employee3);
        employees.put(4,employee4);
    }

    //stores preference id of employee and preference of employee
    HashMap<Integer, String> preferenceOfEmployee = new HashMap<>();

    //Stores the program with name and shift
    HashMap<String,String> programPerDay = new HashMap<>();
}
