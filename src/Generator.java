
public class Generator extends Program implements Generate {

    @Override
    public void programGeneratorPerDay(BusinessDetails businessDetails, int i) {
        //checks if employee has hours of work left
       if (businessDetails.employees.get(i).daysToWorkPerDayLeft!=0) {
           //checks if shift is available for one employee according his preference
           if (!shift.get(businessDetails.preferenceOfEmployee.get(i))) {
               businessDetails.programPerDay.put(businessDetails.employees.get(i).getName(), businessDetails.employees.get(i).getPreferenceShiftADay());
               businessDetails.employees.get(i).setDaysToWorkPerDayLeft(businessDetails.employees.get(i).daysToWorkPerDayLeft - 8);
               shift.put(businessDetails.preferenceOfEmployee.get(i), true);
           } else if (shift.get(businessDetails.preferenceOfEmployee.get(i))) {
               businessDetails.programPerDay.put(businessDetails.employees.get(i).getName(), businessDetails.shiftExisted.get(3));
           }
       }
       else
           businessDetails.programPerDay.put(businessDetails.employees.get(i).getName(), businessDetails.shiftExisted.get(3));
    }

}
