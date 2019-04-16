package com.mahendra.demo1.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mahendra.demo1.services.AccountService;

@RestController
@RequestMapping("/accounts") //Base URL for ALL methods
public class AccountController {

	@Autowired private AccountService service;
	 
	@RequestMapping("/list-all") //URL for Current method
	//Actual URL :  localhost:8080/accounts/list-all
	public List<Account> getAll(){
		return service.getAll();
	}
}
