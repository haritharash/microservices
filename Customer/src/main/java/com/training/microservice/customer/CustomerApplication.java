package com.training.microservice.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.ImportAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignAutoConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication(scanBasePackages = { "com.training.customer" })
@EnableFeignClients(basePackages = "com.training.microservice.clients")
@PropertySources({ @PropertySource("classpath:clients-default.properties") })
@ImportAutoConfiguration({ FeignAutoConfiguration.class })
public class CustomerApplication {
	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);

	}
}
