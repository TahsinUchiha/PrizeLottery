package com.infosys.persistence.domain;

public class Accounts {
	
	private String account;
	private String date;
	
	@Override
	public String toString() {
		return "Accounts [account=" + account + ", date=" + date + "]";
	}

	public Accounts() {
		
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	

}
