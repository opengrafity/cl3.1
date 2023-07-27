package dev.grafity.springaop.service;

import org.springframework.stereotype.Service;

@Service
public class OldTaxService {
	public void calculate(double income) {				
		System.out.println("Calculation of tax for "+income+" using Old Tax Service");
	}
}
