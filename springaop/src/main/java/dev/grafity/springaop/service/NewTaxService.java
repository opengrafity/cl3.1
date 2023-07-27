package dev.grafity.springaop.service;

import org.springframework.stereotype.Service;

@Service
public class NewTaxService {
	public void calculate(double income) {	
		System.out.println("Calculation of tax for "+income+" using New Tax Service");
	}
}
