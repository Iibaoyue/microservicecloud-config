package com.happy.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.happy.myrule.MySelfRule;

@SpringBootApplication
@EnableEurekaClient
//启动该微服务时能加载自己的ribbon配置类,时配置生效
@RibbonClient(name="MICROSERVICECLOUD-DEPT",configuration=MySelfRule.class)
public class DeptConsumer80_APP {
	
	public static void main(String[] args) {
		
		SpringApplication.run(DeptConsumer80_APP.class, args);
		
	}

}
