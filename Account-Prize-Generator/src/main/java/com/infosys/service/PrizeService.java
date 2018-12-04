package com.infosys.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infosys.domain.Prize;
import com.infosys.util.PrizeType;

@Service
public class PrizeService {

	@Autowired
	PrizeType prizeType;
	
	public Prize getPrize(String accountNumber) {
		return prizeType.checkLetter(accountNumber);
	}
	
}
