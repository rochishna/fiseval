package com.example.customerser.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@ComponentScan(basePackages="com.example.customer.customer")

public class CustomerApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
		
	}
}
