public class Functions {
    Generator generator = new Generator();

    public void programCreationPerDay(BusinessDetails businessDetails)
    {
        for(int i=1;i<=businessDetails.employees.size();i++)
        {
               businessDetails.preferenceOfEmployee.put(businessDetails.employees.get(i).getId(), businessDetails.employees.get(i).getPreferenceShiftADay());
               //checks what the employee prefers and if it exits
               if (businessDetails.preferenceOfEmployee.get(i) == businessDetails.shiftExisted.get(1)) {
                   generator.programGeneratorPerDay(businessDetails, i);
               } else if (businessDetails.preferenceOfEmployee.get(i) == businessDetails.shiftExisted.get(2)) {
                   generator.programGeneratorPerDay(businessDetails, i);
               } else if (businessDetails.preferenceOfEmployee.get(i) == businessDetails.shiftExisted.get(3)) {
                   generator.programGeneratorPerDay(businessDetails, i);
               }
        }
    }
}
