package dev.grafity.springioc.services;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("old")
public class OldTaxCalculator implements TaxCalculator{
	@Autowired
	@Qualifier("taxSlabs")
	private Map<String,Double> taxPercentages;
	
	public Map<String, Double> getTaxPercentages() {
		return taxPercentages;
	}

	public void setTaxPercentages(Map<String, Double> taxPercentages) {
		this.taxPercentages = taxPercentages;
	}

	@Override
	public void calculate() {
		System.out.println("Old Tax Calculator");	
		System.out.println(taxPercentages.get("sal<10L"));
	}
}
