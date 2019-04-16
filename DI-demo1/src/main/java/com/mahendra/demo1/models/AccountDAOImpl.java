package com.mahendra.demo1.models;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component //Let Spring framework manage this instance
public class AccountDAOImpl implements AccountDAO {

	private List<Account> accounts = new LinkedList<>();
	
	@Override
	public void save(Account acc) {
		accounts.add(acc);
	}

	@Override
	public Account findByNumber(String accNum) {
		for(Account temp : accounts) {
			if(temp.getAccNumber().equals(accNum)) {
				return temp;
			}
		}
		return null;
	}

	@Override
	public List<Account> findByCustomerName(String custName) {
		List<Account> tempList = new LinkedList<>();
		for(Account temp : accounts) {
			if(temp.getCustomerName().equalsIgnoreCase(custName)) {
				tempList.add(temp);
			}
		}
		return tempList;
	}

	@Override
	public void update(Account acc) {
		Account temp = findByNumber(acc.getAccNumber());
		if(temp==null) {
			System.out.println("NO account found!");
			return;
		}
		temp.setBalance(acc.getBalance());
		temp.setCustomerName(acc.getCustomerName());
		temp.setOpeningDate(acc.getOpeningDate());
	}

}
