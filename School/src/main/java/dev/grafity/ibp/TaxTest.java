package dev.grafity.ibp;

public class TaxTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Kumar",1000000);
        EnhancedPayroleService payrole = new EnhancedPayroleService();
        payrole.addEmployee(emp);
        emp = new Employee("Raja",1200000);
        emp.setInvestment(250000);
        payrole.addEmployee(emp);
        emp = new Employee("Ramesh",700000);
        payrole.addEmployee(emp);
        emp = new Employee("Ravi",800000);
        payrole.addEmployee(emp);
        emp = new Employee("Ramu",2500000);
        emp.setInvestment(150000);
        payrole.addEmployee(emp);

        payrole.fileTaxs();
    }
}
