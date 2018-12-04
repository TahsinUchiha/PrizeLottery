package com.infosys.domain;

public class Prize {
	
	private String message;
	private boolean winner;
	
	public Prize() {
		
	}
	
	public Prize(String message, boolean winner) {
		this.setMessage(message);
		this.setWinner(winner);
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
		return "Prize [message=" + message + ", winner=" + winner + "]";
	}

}
