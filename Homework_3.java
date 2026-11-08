
package homework_3;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
  
public class Homework_3 {


    public static void main(String[] args) {
      
        List<Employee> employees = new ArrayList<>();

        
        employees.add(new FullTimeEmployee("E001", "Ahmed Ali", 8000, LocalDate.of(2020, 5, 12), 1500));
        employees.add(new ContractorEmployee("E002","Sara Mohammed",0, LocalDate.of(2022, 1, 15),50, 160));
        employees.add(new FullTimeEmployee("E003", "Khaled Abdullah", 12000, LocalDate.of(2018, 10, 1), 2000));
        employees.add(new ContractorEmployee("E004", "Fatima Omar",0, LocalDate.of(2023, 3, 10), 75, 140));

      
        for (Employee e : employees) {
            System.out.println(e);
        }

   
        Collections.sort(employees);

        for (Employee e : employees) {
            System.out.println(e.getName() + " -> Net Salary: " + e.calculateNetSalary());
        }

        
        employees.sort(Comparator.comparing(Employee::getJoinDate));

        for (Employee e : employees) {
            System.out.println(e.getName() + " -> Join Date: " + e.getJoinDate());
        }

      
        double totalTax = 0;
        double totalBonus = 0;
        double performanceScore = 4.5; 

        for (Employee e : employees) {
            totalTax += e.calculateTax();
            totalBonus += e.calculateBonus(performanceScore);
        }

  
        System.out.println("Total Taxes Collected: " + totalTax);
        System.out.println("Total Bonuses Distributed: " + totalBonus);
    }
}
      

