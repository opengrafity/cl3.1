package dev.grafity.springioc.services;

import org.springframework.stereotype.Component;

@Component
public class NewTaxCalculator implements TaxCalculator{
	public void calculate() {
		System.out.println("New Tax Calculator");		
	}
}
