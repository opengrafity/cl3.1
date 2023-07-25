package dev.grafity.springioc.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class DevDBConnector implements DBConnector{

	@Override
	public String getConnection() {
		return "Dev DB Connector";
	}

}
