package com.happy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient       //客户端自动注册进eureka
@EnableDiscoveryClient     //服务发现
public class DeptProvider8003_APP {
	
	public static void main(String[] args) {
		
		SpringApplication.run(DeptProvider8003_APP.class, args);
		
	}

}
