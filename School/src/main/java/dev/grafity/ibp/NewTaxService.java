package dev.grafity.ibp;

public class NewTaxService implements TaxService{
    @Override
    public double getTaxPercentage(Employee emp) {
        double taxPercent = 0.0;
        if(emp.getSalary() > 250000 && emp.getSalary()<500000){
            taxPercent = 5;
        } else if (emp.getSalary() >= 500000 && emp.getSalary()<750000) {
            taxPercent = 10;
        }else if (emp.getSalary() >= 750000 && emp.getSalary()<1000000) {
            taxPercent = 15;
        }else if (emp.getSalary() >= 1000000) {
            taxPercent = 25;
        }
        return taxPercent;
    }
    @Override
    public String getDescription() {
        return "New Tax Service";
    }
}
