package com.mahendra.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient
@EnableAutoConfiguration
@ComponentScan("com.mahendra")
public class DemoExchangeserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoExchangeserviceApplication.class, args);
	}

}
