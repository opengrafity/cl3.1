package com.brytcode.orgengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OrgengineApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrgengineApplication.class, args);
	}

}
