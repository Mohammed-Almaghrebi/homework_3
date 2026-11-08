
package homework_3;
  import java.time.LocalDate;

public class ContractorEmployee  extends Employee  {
  
    private int hourlyRate;
    private int hoursWorked;

    
    public ContractorEmployee(String id, String name, double baseSalary, LocalDate joinDate, int hourlyRate, int hoursWorked) {
        super(id, name, 0, joinDate);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateNetSalary() {
        
        return hourlyRate * hoursWorked;
    }

    @Override
    public double calculateBonus(double performanceScore) {
        return (performanceScore> 4.0) ? 500.0 : 0.0;
    }

    public int getHourlyRate() {
        return hourlyRate;
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    @Override
    public String toString() {
        return "Contractor " + super.toString() + ", Hourly Rate=" + hourlyRate + ", Hours Worked=" + hoursWorked;
    }
}
    
    

