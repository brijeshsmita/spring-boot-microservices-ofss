package com.mahendra.demo1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DemoConfig1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoConfig1Application.class, args);
	}

}
