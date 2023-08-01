package dev.grafity.springaop.service;

import org.springframework.stereotype.Service;

import dev.grafity.springaop.ValidateAmount;

@Service
public class NewTaxService {
	@ValidateAmount
	public void calculate(double income) {	
		System.out.println("Calculation of tax for "+income+" using New Tax Service");
	}
}
