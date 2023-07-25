package dev.grafity.springioc.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("test")
public class TestDBConnector implements DBConnector{

	@Override
	public String getConnection() {
		return "Test DB Connector";
	}

}
