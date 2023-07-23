package dev.grafity.springioc.services;

import org.springframework.stereotype.Component;

@Component
public class OldTaxCalculator implements TaxCalculator{
	@Override
	public void calculate() {
		System.out.println("Old Tax Calculator");		
	}
}
