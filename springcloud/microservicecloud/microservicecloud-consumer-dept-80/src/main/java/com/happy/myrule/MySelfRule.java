package com.happy.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule() {
		return new RandomRule();//用自己选择的随机算法覆盖默认的轮询算法
	}
	
}
