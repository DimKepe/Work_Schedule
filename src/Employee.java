
public class Employee {

	
	String name;
    int id;
    int daysToWorkPerDayLeft;
    String preferenceShiftADay ;

    //getters and setters can be modified
    public String getPreferenceShiftADay() {
        return preferenceShiftADay;
    }

    public void setPreferenceShiftADay(String preferenceShiftADay) {
        this.preferenceShiftADay = preferenceShiftADay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDaysToWorkPerDayLeft() {
        return daysToWorkPerDayLeft;
    }

    public void setDaysToWorkPerDayLeft(int daysToWorkPerDayLeft) {
        this.daysToWorkPerDayLeft = daysToWorkPerDayLeft;
    }
}

