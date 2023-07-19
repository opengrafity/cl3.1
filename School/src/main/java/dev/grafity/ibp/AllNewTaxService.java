package dev.grafity.ibp;

public class AllNewTaxService implements TaxService{
    @Override
    public double getTaxPercentage(Employee emp) {
        return 0;
    }

    @Override
    public String getDescription() {
        return null;
    }
}
