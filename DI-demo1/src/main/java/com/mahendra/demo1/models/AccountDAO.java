package com.mahendra.demo1.models;

import java.util.List;

public interface AccountDAO {
	
	void save(Account acc);
	Account findByNumber(String accNum);
	List<Account> findByCustomerName(String custName);
	void update(Account acc);
}
