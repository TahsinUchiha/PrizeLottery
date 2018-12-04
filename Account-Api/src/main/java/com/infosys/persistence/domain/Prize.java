package com.infosys.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Prize {
	
	@Id
	@GeneratedValue
	private long prizeId;
	private String message;
	private boolean winner;
	
	public Prize() {
		
		
	}
	
	public Prize (String message, boolean winner) {
		this.message = message;
		this.winner = winner;
	}

	public long getPrizeId() {
		return prizeId;
	}

	public void setPrizeId(long prizeId) {
		this.prizeId = prizeId;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isWinner() {
		return winner;
	}

	public void setWinner(boolean winner) {
		this.winner = winner;
	}

	@Override
	public String toString() {
		return "Prize [message=" + message + "]";
	}

}
