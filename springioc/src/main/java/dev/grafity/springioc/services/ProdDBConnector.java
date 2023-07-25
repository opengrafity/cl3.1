package dev.grafity.springioc.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class ProdDBConnector implements DBConnector{

	@Override
	public String getConnection() {
		return "Prod DB Connector";
	}

}
