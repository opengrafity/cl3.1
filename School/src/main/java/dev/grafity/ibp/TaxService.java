package dev.grafity.ibp;

public interface TaxService {
    double getTaxPercentage(Employee emp);
    String getDescription();
}
