package com.mahendra.demo1.controllers;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahendra.demo1.models.Account;

@RestController
public class HomeController {

	@RequestMapping("/")
	public String hello() {
		return "Hello World!";
	}
	
	@RequestMapping("/show")
	public Account showAccount() {
		return new Account("SB-001", 
				"Vijay Mallya",
				new Date(),
				46747644D);
	}
}
