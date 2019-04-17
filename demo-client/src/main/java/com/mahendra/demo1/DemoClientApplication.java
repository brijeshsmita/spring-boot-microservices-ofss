package com.mahendra.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@RibbonClient(name="exchange-service")
public class DemoClientApplication implements CommandLineRunner{

	@LoadBalanced
	@Bean
	public RestTemplate template() {
		return new RestTemplate();
	}
	
	@Autowired
	private RestTemplate template;
	
	public static void main(String[] args) {
		SpringApplication.run(DemoClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String msg = template.getForObject("http://exchange-service/", String.class);
		System.out.println("Got Response: "+msg);
	}

}
