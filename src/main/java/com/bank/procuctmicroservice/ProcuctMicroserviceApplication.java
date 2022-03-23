package com.bank.procuctmicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProcuctMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProcuctMicroserviceApplication.class, args);
	}

}
