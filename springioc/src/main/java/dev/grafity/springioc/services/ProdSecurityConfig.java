package dev.grafity.springioc.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdSecurityConfig implements SecurityConfig{

	@Override
	public String getSecurityConfig() {
		return "Prod Security Config"; 
	}

}
