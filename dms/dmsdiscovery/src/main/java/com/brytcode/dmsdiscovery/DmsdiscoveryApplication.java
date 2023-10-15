package com.brytcode.dmsdiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class DmsdiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmsdiscoveryApplication.class, args);
	}

}
