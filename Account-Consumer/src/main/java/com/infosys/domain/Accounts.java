package com.infosys.domain;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Accounts {
	
	@Id
	public ObjectId _id;
	private String account;
	private String date;
	
	public Accounts() {
		
	}
	
	public ObjectId get_id() {
		return _id;
	}
	public void set_id(ObjectId _id) {
		this._id = _id;
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

	@Override
	public String toString() {
		return "Accounts [_id=" + _id + ", account=" + account + ", date=" + date + "]";
	}
	

}
