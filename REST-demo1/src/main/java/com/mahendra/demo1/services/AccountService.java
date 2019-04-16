package com.mahendra.demo1.services;

import java.util.List;

import com.mahendra.demo1.models.Account;

public interface AccountService {
	String openNewAccount(String name,Double balance);
	Account findAccount(String accNumber);
	List<Account> getAll();
	void update(Account acc);
}
