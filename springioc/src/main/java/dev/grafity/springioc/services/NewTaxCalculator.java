package dev.grafity.springioc.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Primary
@Component
@Scope("prototype")
public class NewTaxCalculator implements TaxCalculator{
	@Autowired
	@Qualifier("taxSlabs")
	private Map<String,Double> taxPercentages;
	public NewTaxCalculator() {
		this.taxPercentages = new HashMap<>();
		taxPercentages.put("sal<10L", 5.0);
		taxPercentages.put("10L<sal<20L", 15.0);
		taxPercentages.put("20L<sal<30L", 25.0);
	}
	public void calculate() {		
		System.out.println("New Tax Calculator");
		System.out.println(taxPercentages.get("sal<10L"));		
	}
}
