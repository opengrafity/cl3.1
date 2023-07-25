package dev.grafity.springioc.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile({"test","dev"})
public class TestSecurityConfig implements SecurityConfig{

	@Override
	public String getSecurityConfig() {
		return "Test Security Config";
	}

}
