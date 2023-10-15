package com.brytcode.dmsgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DmsgatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmsgatewayApplication.class, args);
	}

}
