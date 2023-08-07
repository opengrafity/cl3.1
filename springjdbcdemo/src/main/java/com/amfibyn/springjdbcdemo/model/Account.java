package com.amfibyn.springjdbcdemo.model;

public class Account {
	private int accountId;
	private String accountName;
	private double balance;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Accounts [accountId=" + accountId + ", accountName=" + accountName + ", balance=" + balance + "]";
	}
	
}
