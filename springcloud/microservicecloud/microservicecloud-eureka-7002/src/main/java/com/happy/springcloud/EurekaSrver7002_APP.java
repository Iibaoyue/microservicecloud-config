package com.happy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer        // Eureka Service 注解
public class EurekaSrver7002_APP {

	public static void main(String[] args) {
		
		SpringApplication.run(EurekaSrver7002_APP.class, args);
		
	}
}
