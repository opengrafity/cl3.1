package dev.grafity.ibp;

import java.util.ArrayList;
import java.util.List;

public class EnhancedPayroleService {
    private List<Employee> employees = new ArrayList<>();
    @Qualfier("New")
    TaxService taxService;
    public void addEmployee(Employee emp){
        employees.add(emp);
    }

    public void fileTaxs(){
        double taxPercent;
        System.out.println(taxService.getDescription());
        for(Employee emp:employees){
            taxPercent = 0.0;
            taxPercent = taxService.getTaxPercentage(emp);
            String res = String.format("Employee Name:%s Salary:%.2f Tax:%.2f",
                    emp.getName(),
                    emp.getSalary(),
                    emp.getSalary()*(taxPercent/100));
            System.out.println(res);
        }
    }
}
