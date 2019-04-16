package com.mahendra.demo1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.mahendra.demo1.models.Account;
import com.mahendra.demo1.services.AccountService;

@SpringBootApplication
public class Demo1Application implements CommandLineRunner{

	@Autowired private AccountService service;
	
	public static void main(String[] args) {
		SpringApplication.run(Demo1Application.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		String accNo = service.openNewAccount("Mahendra Shinde", 14500D);
		System.out.println("Account created "+accNo);
		Account acc = service.findAccount(accNo);
		System.out.println("Account details "+acc.getCustomerName()+" "+acc.getBalance());
	}
	
	

}
