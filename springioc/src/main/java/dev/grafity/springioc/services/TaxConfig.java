package dev.grafity.springioc.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TaxConfig {
	@Bean("taxSlabs")
	Map<String,Double> getTaxPercentages(){
		Map<String,Double> taxPercentages = new HashMap<>();
		taxPercentages.put("sal<10L", 5.0);
		taxPercentages.put("10L<sal<20L", 15.0);
		taxPercentages.put("20L<sal<30L", 25.0);
		return taxPercentages;
	}
}
