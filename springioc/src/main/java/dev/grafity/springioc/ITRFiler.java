package dev.grafity.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dev.grafity.springioc.services.TaxCalculator;
@Component
public class ITRFiler {
	@Autowired
	@Qualifier("oldTaxCalculator")
	private TaxCalculator taxCalculator;
	public void fileTax() {
		taxCalculator.calculate();
	}
}
