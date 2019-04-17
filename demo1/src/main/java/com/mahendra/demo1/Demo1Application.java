package com.mahendra.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableDiscoveryClient ///Register with eureka server
//Search THIS package and it's child packages
//for ANY spring annotations
@ComponentScan("com.mahendra")
public class Demo1Application {

	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
	}
	

}
