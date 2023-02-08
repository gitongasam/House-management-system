package com.devsam.paymentmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.elasticsearch.RestClientBuilderCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PaymentManagementServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(PaymentManagementServiceApplication.class, args);
	}
	@Bean
	public RestTemplate restTemplate(){
		return  new RestTemplate();
	}
}
