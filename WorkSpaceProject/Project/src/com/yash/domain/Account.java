package com.yash.domain;

public class Account {
	private int accountid;
	private int amount;
	
	
	
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Account(int accountid, int amount) {
		super();
		this.accountid = accountid;
		this.amount = amount;
	}
	public int getAccountid(){
		return accountid;
	}
	public void setAccountid(int accountid) {
		this.accountid = accountid;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
		}
	@Override
	public String toString() {
		return "Account [accountid=" + accountid + ", amount=" + amount + "]";
	}
	
}
