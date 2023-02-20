package com.devsam.Serviceregistry2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistry2Application {

	public static void main(String[] args) {
		SpringApplication.run(ServiceRegistry2Application.class, args);
	}

}
