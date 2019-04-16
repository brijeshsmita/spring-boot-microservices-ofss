package com.mahendra.demo1.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mahendra.demo1.services.AccountService;

@RestController
@RequestMapping("/accounts") //Base URL for ALL methods
public class AccountController {

	@Autowired private AccountService service;
	 
	@GetMapping() //URL for Current method
	//Actual URL :  localhost:8080/accounts/list-all
	public List<Account> getAll(){
		return service.getAll();
	}
	// Expect TWO Request Parameters
	// At Runtime Input would be converted into 
	// Matching Argument types (eg Double for balance)
	@PostMapping()
	public String create(@RequestParam String name, 
			@RequestParam Double balance) {
		System.out.println("Values are "+name+" "+balance);
		service.openNewAccount(name, balance);
		return "Creating Record";
	}
	// Expect INPUT in JSON format
	@PutMapping(consumes="application/json")
	public String update(@RequestBody Account account) {
		System.out.println("Got Object "+account.getAccNumber());
		service.update(account);
		return "Updating Record";
	}
	@DeleteMapping()
	public String delete() {
		return "Deleting Record";
	}
}
