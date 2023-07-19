package dev.grafity.ibp;

import java.util.ArrayList;
import java.util.List;

public class PayroleService {
    private List<Employee> employees = new ArrayList<>();
    public void addEmployee(Employee emp){
        employees.add(emp);
    }
    public void fileTaxs(){
        double taxPercent;
        for(Employee emp:employees){
            taxPercent = 0.0;
            if("New".equals(emp.getTaxChoice())){
                if(emp.getSalary() > 250000 && emp.getSalary()<500000){
                    taxPercent = 5;
                } else if (emp.getSalary() >= 500000 && emp.getSalary()<750000) {
                    taxPercent = 10;
                }else if (emp.getSalary() >= 750000 && emp.getSalary()<1000000) {
                    taxPercent = 15;
                }else if (emp.getSalary() >= 1000000) {
                    taxPercent = 25;
                }
            }else if("Old".equals(emp.getTaxChoice())){
                double taxableIncome = emp.getSalary() - emp.getInvestment();
                if(taxableIncome> 250000 && taxableIncome<500000){
                    taxPercent = 5;
                } else if (taxableIncome>= 500000 && taxableIncome<750000) {
                    taxPercent = 10;
                }else if (taxableIncome>= 750000 && taxableIncome<1000000) {
                    taxPercent = 20;
                }else if (taxableIncome>= 1000000) {
                    taxPercent = 30;
                }
            }
            String res = String.format("Employee Name:%s Salary:%.2f Tax:%.2f",
                    emp.getName(),
                    emp.getSalary(),
                    emp.getSalary()*(taxPercent/100));
            System.out.println(res);
        }
    }
}
