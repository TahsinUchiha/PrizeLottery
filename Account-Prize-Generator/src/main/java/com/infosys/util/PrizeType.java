package com.infosys.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import com.infosys.domain.Prize;

@Component
public class PrizeType {
	
	@Value("£25")
	int basePrize;
	@Value("2")
	int multiplier;
	
	public Prize checkLetter(String accountNumber) {
		String letter = accountNumber.substring(0,1);
		switch(letter) {
		case "A":
			return new  Prize(String.valueOf(basePrize), true);
		case "B":
			return new Prize(String.valueOf(multiplier * basePrize), true);
		default:
			return new Prize(null, false);
		}
	}

}
