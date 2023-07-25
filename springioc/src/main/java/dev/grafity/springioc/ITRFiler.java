package dev.grafity.springioc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import dev.grafity.springioc.services.DBConnector;
import dev.grafity.springioc.services.SecurityConfig;
import dev.grafity.springioc.services.TaxCalculator;
@Component
public class ITRFiler {
	@Autowired	
	private TaxCalculator taxCalculator;
	@Autowired
	private DBConnector dbConnector;
	@Autowired
	private SecurityConfig securityConfig;
	
	

	public ITRFiler() {
		super();
	}



	public ITRFiler(TaxCalculator taxCalculator, DBConnector dbConnector, SecurityConfig securityConfig) {
		super();
		this.taxCalculator = taxCalculator;
		this.dbConnector = dbConnector;
		this.securityConfig = securityConfig;
	}



	public void setTaxCalculator(TaxCalculator taxCalculator) {
		this.taxCalculator = taxCalculator;
	}



	public void setDbConnector(DBConnector dbConnector) {
		this.dbConnector = dbConnector;
	}



	public void setSecurityConfig(SecurityConfig securityConfig) {
		this.securityConfig = securityConfig;
	}



	public void fileTax() {
		taxCalculator.calculate();
		System.out.println(dbConnector.getConnection());
		System.out.println(securityConfig.getSecurityConfig());
		System.out.println(taxCalculator);
	}
}
