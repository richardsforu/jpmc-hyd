package com.cts.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages= {"com.cts.product.dao","com.cts.product.service"})
@ComponentScans(value = { @ComponentScan("com.cts.product.dao"), @ComponentScan("com.cts.product.service") })
public class AppConfig {

	@Bean
	public void test() {
		System.out.println("--- testing java code...");
	}
	
	@Bean
	public void test2() {
		System.out.println("--- test2 java code...");
	}

}
