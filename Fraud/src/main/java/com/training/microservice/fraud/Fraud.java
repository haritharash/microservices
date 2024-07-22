package com.training.microservice.fraud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
public class Fraud {
	
	public static void main(String[] args) {

		SpringApplication.run(Fraud.class, args);
	}

}
