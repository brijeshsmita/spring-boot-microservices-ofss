package com.mahendra.demo1.services;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mahendra.demo1.models.Account;
import com.mahendra.demo1.models.AccountDAO;

@Component //Let Spring framework handle this instance
public class AccountServiceImpl implements AccountService {

	//Let Spring auto inject instance of AccountDAO 
	//Into this property "dao"
	@Autowired private AccountDAO dao;
	
	static int accNum = 0;
	@Override
	public String openNewAccount(String name, Double balance) {
		String tempNo = "SB-00"+ ++accNum;
		Account acc = new Account(tempNo, name, new Date(), balance);
		dao.save(acc);
		return acc.getAccNumber();
	}

	@Override
	public Account findAccount(String accNumber) {
		// TODO Auto-generated method stub
		return dao.findByNumber(accNumber);
	}

	@Override
	public List<Account> getAll() {
		// TODO Auto-generated method stub
		return dao.getAll();
	}

}
