package com.mahendra.demo1.models;

import java.util.Date;

public class Account {
	private String accNumber;
	private String customerName;
	private Date openingDate;
	private Double balance;
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Account(String accNumber, String customerName, Date openingDate, Double balance) {
		super();
		this.accNumber = accNumber;
		this.customerName = customerName;
		this.openingDate = openingDate;
		this.balance = balance;
	}


	public String getAccNumber() {
		return accNumber;
	}
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Date getOpeningDate() {
		return openingDate;
	}
	public void setOpeningDate(Date openingDate) {
		this.openingDate = openingDate;
	}
	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	
}
