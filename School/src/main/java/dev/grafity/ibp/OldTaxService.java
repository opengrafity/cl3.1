package dev.grafity.ibp;

public class OldTaxService implements TaxService{
    @Override
    public double getTaxPercentage(Employee emp) {
        double taxPercent = 0.0;
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
        return taxPercent;
    }

    @Override
    public String getDescription() {
        return "Old Tax Service";
    }

}
